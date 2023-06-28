<?php

use App\Http\Controllers\BookController;
use App\Models\Book;
use Illuminate\Support\Facades\DB;
use Illuminate\Support\Facades\Route;

/*
|--------------------------------------------------------------------------
| Web Routes
|--------------------------------------------------------------------------
|
| Here is where you can register web routes for your application. These
| routes are loaded by the RouteServiceProvider and all of them will
| be assigned to the "web" middleware group. Make something great!
|
*/

Route::get('/book', [BookController::class, 'index'])->name('index');

Route::get('/insert', function(){
    DB::insert('insert into book(authorid, title, ISBN, pub_year, available	) values(?, ?, ?, ?, ?)', [107, 'Thần Đồng', '0-304-40615-2', 2012, 22]);
    return 'DONE';
});

Route::get('/book/searchController/', [BookController::class, 'search'])->name('searchController');

Route::post('/book/addController', [BookController::class, 'add'])->name('addController');

Route::get('/book/add', function(){
    return view('book.add');
})->name('add');