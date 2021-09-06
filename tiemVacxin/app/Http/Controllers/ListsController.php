<?php

namespace App\Http\Controllers;

use Illuminate\Http\Request;
use App\Models\Lists;


class ListsController extends Controller
{
    //

    public function Commit(Request $request){
        $list = new Lists;
        $list->cmnd=$request->cmnd;
        $list->hovaten=$request->hovaten;
        $list->ngaythangnamsinh=$request->ngaythangnamsinh;
        $list->diachi=$request->diachi;
        $list->sdt=$request->sdt;
        $list->tiensudiung=$request->tiensudiung;
        $list->save();

        return redirect('/');
        }
}

