<?php
$number = [1, 2, 3, 4 ,5 ,6 ,7];
echo "Mảng có ".count($number)." phần tử!<br>";
echo "Phần tử thứ 3 của mảng có giá trị là: ".$number[3]."<br>";
echo "------- Mảng kết hợp -------<br>";
$person = [
    "name" => "Giáp",
    "age" => 19,
    "id" => "001"
];

echo "Tên: ".$person["name"]."<br>";
echo "Tuổi: ".$person["age"]."<br>";
echo "ID: ".$person["id"]."<br>";