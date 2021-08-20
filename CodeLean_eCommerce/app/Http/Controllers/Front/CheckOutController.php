<?php

namespace App\Http\Controllers\Front;

use App\Http\Controllers\Controller;
use App\Models\Order;
use App\Models\OrderDetail;
use App\Utilities\VNPay;
use Illuminate\Http\Request;
use Gloudemans\Shoppingcart\Facades\Cart;
use Illuminate\Support\Facades\Mail;

class CheckOutController extends Controller
{
    public function index()
    {
        $carts = Cart::content();
        $total = Cart::total();
        $subtotal = Cart::subtotal();

        return view('front.checkout.index',compact('carts','total','subtotal'));
    }

    public function addOrder(Request $request)
    {
        //01. Them don hang
        $order = Order::create($request->all());

        //02. Them chi tiet don hang
        $carts = Cart::content();

        foreach ($carts as $cart) {
            $data = [
                'order_id' => $order->id,
                'product_id' => $cart->id,
                'qty' => $cart->qty,
                'amount' => $cart->price,
                'total' => $cart->price * $cart->qty,
            ];

            OrderDetail::create($data);
        }

        if ($request->payment_type =='pay_later') {
            //03. Gui email
            $total = Cart::total();
            $subtotal = Cart::subtotal();

            $this->sendEmail($order, $total, $subtotal);

            //04. Xoa gio hang
            Cart::destroy();

            //05. Tra ve ket qua
            return redirect('checkout/result')
                ->with('notification', 'Success! You will pay on delivery. Please check your email.');
        }

        if ($request->payment_type == 'online_payment') {
            //01. Lấy URL thanh toan VNPAY
            $data_url = VNPay::vnpay_create_payment([
                'vnp_TxnRef' => $order->id, //ID cua don hang
                'vnp_OrderInfo' => 'Mo ta don hang o day...!',
                'vnp_Amount' => Cart::total(0, '', '') * 22825, //Nhan voi ti gia de chuyen sang tien Viet
            ]);

            //02. Chuyen huong toi URL lay duoc
            return redirect()->to($data_url);
        }
    }

    public function vnPayCheck(Request $request)
    {
        //01. Lay data tu URL (do VNPay gui ve qua $vnp_Returnurl)
        $vnp_ResponseCode = $request->get('vnp_ResponseCode');
        $vnp_TxnRef = $request->get('vnp_TxnRef'); //ticked_id
        $vnp_Amount = $request->get('vnp_Amount'); //so tien thanh toan

        //02. Kiem tra ket qua giao dich tra ve tu VNPay
        if ($vnp_ResponseCode != null) {
            //Neu thanh cong
            if ($vnp_ResponseCode == 00) {
                //Gui email
                $order = Order::find($vnp_TxnRef);
                $total = Cart::total();
                $subtotal = Cart::subtotal();
                $this->sendEmail($order, $total, $subtotal);

                //Xoa gio hang
                Cart::destroy($order);

                //Thong bao ket qua thanh cong
                return redirect('checkout/result')
                    ->with('notification', 'Success! Has paid online. Please check your email.');
            }else { //Neu khong thanh cong
                //Xoa don hang da them vao DataBase, va tra ve thong bao loi
                Order::find($vnp_TxnRef)->delete();

                //Tra ve thong bao loi
                return redirect('checkout/result')
                    ->with('notification', 'ERROR: Payment failed or canceled.');
            }
        }
    }

    public function result()
    {
        $notification = session('notification');
        $notification = "Info...";
        return view('front.checkout.result', compact('notification'));
    }

    private function sendEmail($order, $total, $subtotal)
    {
        $email_to = $order->email;

        Mail::send('front.checkout.email', compact('order', 'total', 'subtotal') , function ($message) use ($email_to) {
            $message->from('codelean@gmail.com', 'CodeLean eCommerce');
            $message->to($email_to, $email_to);
            $message->subject('Order Notification');
        });
    }
}
