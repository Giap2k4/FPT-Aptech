<?php

$student = array(
    $st1 = [
        "name" => "Giáp",
        "age" => 19,
        "score" => 9
    ],

    $st2 = [
        "name" => "Đại",
        "age" => 20,
        "score" => 9
    ],

    $st3 = [
        "name" => "Hùng",
        "age" => 19,
        "score" => 9
    ],

    $st4 = [
        "name" => "Đức",
        "age" => 20,
        "score" => 3
    ],

    $st5 = [
        "name" => "Phúc",
        "age" => 20,
        "score" => 3
    ],
);


foreach($student as $row){
    $a = $row["score"] >= 4 ? "Học sinh thi đỗ là: {$row["name"]}"."<br>" : "Học sinh thi không đỗ là: ".$row["name"]."<br>";
    echo $a;
}

