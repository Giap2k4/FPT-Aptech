<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Insert</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
</head>
<body>
    <h1>Insert</h1>
    <form action="{{ route('addController') }}" method="post">
    @csrf
    @method('POST')
        <div class="form-group">
            <label for="exampleInputEmail1">AuthorID</label>
            <input type="text" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" placeholder="AuthorID" name="authorid">
        </div>

        <div class="form-group">
            <label for="exampleInputPassword1">Title</label>
            <input type="text" class="form-control" name="title" id="exampleInputPassword1" placeholder="Title">
        </div>

        <div class="form-group">
            <label for="exampleInputPassword1">ISBN</label>
            <input type="text" class="form-control" name="isbn" id="exampleInputPassword1" placeholder="ISBN">
        </div>

        <div class="form-group">
            <label for="exampleInputPassword1">Pub_year</label>
            <input type="text" class="form-control" name="pub_year" id="exampleInputPassword1" placeholder="Pub_year">
        </div>

        <div class="form-group">
            <label for="exampleInputPassword1">Available</label>
            <input type="text" class="form-control" name="available" id="exampleInputPassword1" placeholder="Available">
        </div>

        
        <button type="submit" class="btn btn-primary">Submit</button>
    </form>
</body>
<style>
    body {
        width: 50%;
        margin: 2rem auto;
    }
</style>
</html>