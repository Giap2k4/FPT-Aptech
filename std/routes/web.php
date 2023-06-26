<?php

use App\Http\Controllers\StudentController;
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

// Route::get('/student', [StudentController::class, 'index'])->name('index');
Route::get('/student/view', [StudentController::class, 'show'])->name('show');

Route::get('/student/add', function(){
    return view('student.add');
})->name('add');

Route::post('/student/addController', [StudentController::class, 'add'])->name('addController');

Route::get('/student/delete/{id}', [StudentController::class, 'delete'])->name('delete');

Route::get('/student/update/{id}/{name}/{age}', function($id, $name, $age){
    return view('student.update', compact('id', 'name', 'age'));
})->name('update');

Route::post('/student/updateController/{id}', [StudentController::class, 'update'])->name('updateController');
