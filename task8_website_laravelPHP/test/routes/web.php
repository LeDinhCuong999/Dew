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
use App\Models\Post;


Route::get('/', function () {
//    return 'Welcome to WC';
     return view('welcome');
});

Route::get('profile/{name}', 'ProfileController@showProfile');

Route::get('home', 'HomeController@showWelcome');
Route::get('about', 'AboutController@showDetails');

//Route::get('about', function () {
//    return 'About Content';
//});

Route::get('about/directions',array('as' => 'directions', function () {
    $theURL = URL::route('directions');
    return "Directions go to this URL: $theURL";
}));

Route::any('submit-form', function () {
    return 'Process Form';
});

//Route::get('about/{theSubject}', function ($theSubject) {
//    return $theSubject. ' djt kon me thang Dat nghien.';
//});

Route::get('about/{theSubject}', 'AboutController@showSubject');

Route::get('about/classes/{theSubject}', function ($theSubject) {
    return " djt kon me thang Dat nghien $theSubject.";
});

Route::get('about/classes/{Price}/{Art}', function ($Price,$Art) {
    return "The product: $Price and $Art"  ;
});

Route::get('where', function () {
    return Redirect::route('directions');
});

Route::get('/insert', function () {
   DB::insert('insert into posts(title, body, is_admin) values(?,?,?)',['PHP_with_Laravel','Laravel_is_the_best_fremework !',0]);
   return 'DONE';
});

Route::get('/read', function () {
   $result = DB::select('select * from posts where id > ?',[1]);
//   return $result;
    foreach ($result as $posts) {
        return $posts->body;
    }
});

Route::get('update', function () {
   $update = DB::update('update posts set title = "New title hihi" where id > ?',[1]);
   return $update;
});

Route::get('delete', function () {
   $delete = DB::delete('delete from posts where id = ?',[4]);
   return $delete;
});

Route::get('readAll', function () {
   $posts = Post::all();
   foreach ($posts as $p) {
       echo $p->title. " " . $p->body;
       echo "<br>";
   }
});

Route::get('findId', function () {
   $posts = Post::where('id', '>=', 1)
       ->where('title', 'PHP with laravel')
       ->where('body', 'like', '%laravel%')
       ->orderBy('id', 'desc')
       ->take(10)
       ->get();
    foreach ($posts as $p) {
        echo $p->title;
        echo "<br>";
    }
});

Route::get('insertORM', function (){
   $p = new Post();
   $p->title = 'insert ORM';
   $p->body = 'INSERTED done done ORM';
   $p->is_admin = 1;
   $p->save();
});

Route::get('updateORM', function (){
    $p = Post::where('id', 5)->first();
    $p->title = 'updated ORM';
    $p->body = 'update Ahihihi DONE DONE';
    $p->save();
});

Route::get('deleteORM', function (){
   Post::where('id','>=',14)
       ->delete();
});

Route::get('destroyORM', function (){
    Post::destroy(7, 11);
});
