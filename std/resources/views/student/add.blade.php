<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <h1>Add student</h1>
    <form action="{{ route('addController')}}" method="post">
    
        <label for="">Name</label>
        <input type="text" name="name"><br>

        <label for="">Age</label>
        <input type="text" name="age"><br>

        <input type="hidden" name="_token" value="{{ csrf_token() }}">
        
        <input type="submit" value="Add Student">
    </form>
</body>
</html>