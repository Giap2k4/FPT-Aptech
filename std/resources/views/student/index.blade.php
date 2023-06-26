<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <table>
        <tr>
            <th>MaSV</th>
            <th>Name</th>
            <th>Age</th>
            <th>Action</th>
        </tr>

        @foreach($std as $s)
        <tr>
            <td>{{$s['MaSV']}}</td>
            <td>{{$s['Name']}}</td>
            <td>{{$s['Age']}}</td>
            <td><a href="{{ route('update', [$s['MaSV'], $s['Name'], $s['Age']]) }}">Sửa</a></td>
            <td><a href="{{ route('delete', $s['MaSV']) }}">Xóa</a></td>
        </tr>
        @endforeach
        <a href="{{ route('add') }}">Thêm sinh viên</a>
    </table>
</body>
<style>
    td, th {
        text-align: center;
        /* border-right: 1px solid; */
        width: 5rem;
    }
</style>
</html>
