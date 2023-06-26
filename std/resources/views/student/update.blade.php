<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <h1>Update</h1>
    <form action="{{ route('updateController', $id) }}" method="post">
        @csrf
        @method('POST')
        <label for="">Name</label>
        <input type="text" name="name" value="{{ $name }}"><br>

        <label for="">Age</label>
        <input type="text" name="age" value="{{ $age }}"><br>

        <!-- <input type="hidden" name="_token" value="{{ csrf_token() }}"> -->

        <input type="submit" value="Update">
    </form>
</body>
</html>

