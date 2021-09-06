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

Route::post('Commit',[\App\Http\Controllers\ListsController::class, 'Commit']);

Route::post('Commit',[\App\Http\Controllers\ListsController::class, 'Commit']);
