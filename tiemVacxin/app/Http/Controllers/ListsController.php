<?php

namespace App\Http\Controllers;

use App\Http\Controllers\Controller;
use Illuminate\Http\Request;
use App\Models\Lists;
use Illuminate\Support\Facades\DB;


class ListsController extends Controller
{

    public function index(){
        return view('index');
    }

    public function commit(Request $request){
        $request -> validate([
            'cmnd'=>'required',
            'hovaten'=>'required',
            'ngaythangnamsinh'=>'required',
            'diachi'=>'required',
            'sdt'=>'required',
            'tiensudiung'=>'required',
        ]);
        Lists::create($request->all());
        return redirect()->route('index')
            ->with('Đăng kí thành công √');
        }


    public function viewtable()
    {
        $lists = Lists::all();
        return view('index', compact('lists'));
    }

    public function search(Request $request){
        $search = $request->get('search');
        $lists = DB::table('lists')->where('cmnd', 'like', '%'.$search.'%');
        return view('index', compact('lists'));
    }

}

