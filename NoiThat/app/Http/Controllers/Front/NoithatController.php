<?php

namespace App\Http\Controllers\Front;

use App\Http\Controllers\Controller;
use App\Models\NoiThat;
use Illuminate\Http\Request;
use Illuminate\Support\Facades\DB;


class NoithatController extends Controller
{
    //
    public function index()
    {
        return view('index');
    }

    public function view()
    {
        $datas = NoiThat::all();
        return view('index', compact('datas'));
    }

    public function commit(Request $request){
        $request -> validate([
            'name'=>'required',
            'price'=>'required',
            'image'=>'required',
        ]);
        NoiThat::create($request->all());
        return redirect()->route('index')
            ->with('Ban da them 1 noi that √');
    }
}
