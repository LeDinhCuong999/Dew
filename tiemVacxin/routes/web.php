<?php

use Illuminate\Support\Facades\Route;
use App\Http\Controllers\ListsController;

/*
|--------------------------------------------------------------------------
| Web Routes
|--------------------------------------------------------------------------
|
| Here is where you can register web routes for your application. These
| routes are loaded by the RouteServiceProvider within a group which
| contains the "web" middleware group. Now create something great!
|
*/

Route::get('/', function () {
    return view('index');

//    return \App\Models\Lists::all();
});

Route::get('/',[\App\Http\Controllers\ListsController::class, 'index']);

Route::post('commit',[\App\Http\Controllers\ListsController::class, 'commit'])->name('commit');

Route::post('/',[\App\Http\Controllers\HomeController::class,'index'])->name('index');

Route::get('search',[\App\Http\Controllers\ListsController::class, 'search']);

Route::get('viewtable',[\App\Http\Controllers\ListsController::class, 'viewtable']);
