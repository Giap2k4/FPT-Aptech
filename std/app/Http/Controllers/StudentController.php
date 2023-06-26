<?php

namespace App\Http\Controllers;

use App\Models\Student;
use Illuminate\Http\Request;

class StudentController extends Controller
{
    public function show(){
        $data = Student::all();
        return view('student.index', ['std'=>$data]);
    }

    public function add(Request $request){
        $student = new Student();
        // $student -> MaSV = $request->input('maSV');
        $student -> Name = $request->input('name');
        $student -> Age = $request->input('age');
        $student->save();
        return $this->show();
    }

    public function delete($id){
        $student = Student::where('MaSV', $id);
        $student->delete();
        return $this->show();
    }

    public function update(Request $req, $id){
        $std = new Student();
        $std = Student::where('MaSV', $id)->first();

        $std->Name = $req->input('name');
        $std->Age = $req->input('age');
        $std->save();
        return $this->show();
    }
}
