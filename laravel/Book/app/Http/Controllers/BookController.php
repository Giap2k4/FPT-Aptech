<?php

namespace App\Http\Controllers;

use App\Models\Book;
use Illuminate\Http\Request;

class BookController extends Controller
{
    public function index(){
        $book = Book::all();
        return view('book.index', ['book'=>$book]);
    }

    public function search(Request $req){
        $name_book = $req->input('book');
        $book = Book::where('title','like', '%'.$name_book.'%')->get();
        return view('book.index', ['book' => $book]);
    }

    public function add(Request $req){
        $book = new Book();

        $book->authorid = $req->input('authorid');
        $book->title = $req->input('title');
        $book->ISBN = $req->input('isbn');
        $book->pub_year = $req->input('pub_year');
        $book->available = $req->input('available');
        $book->save();

        return $this->index();
    }
}
