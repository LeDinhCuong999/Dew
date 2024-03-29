<?php

use Illuminate\Support\Facades\Route;

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
use App\Models\Task;
use Illuminate\Http\Request;

//Route::get('/', function () {
//    return view('welcome');
//});

/***
 * Show_Task Dashboard
 */
Route::get('/', function (){
    $tasks = Task::orderBy('created_at', 'desc')->get();

    return view('tasks', [
        'tasks' => $tasks
    ]);
});

/***
 * Add new Task
 */
Route::post('/task', function (Request $request){
   //validate information
    $validator = Validator::make($request->all(),[
        'name' => 'required|max:255'
    ]);

    if ($validator->fails()) {
        return redirect('/')
            ->withInput()
            ->withErrors($validator);
    }

    $task = new Task;
    $task->name = $request->name;
    $task->save();

    return redirect('/');
});

/***
 * Delete Task
 */
Route::post('/task/{task}', function ($id){
    Task::findOrFail($id)->delete();
    return redirect('/');
});
