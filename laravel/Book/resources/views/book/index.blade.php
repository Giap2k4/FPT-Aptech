<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Book Details</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
</head>
<body>
    <h1>Book Details</h1>
    <h1>Tìm kiếm sách</h1>
    <form action="{{ route('searchController') }}" method="get">
    @csrf
    @method('GET')
        <label for="name_book">Nhập tên sách: </label>
        <input type="text" name="book" placeholder="Nhập tên sách..."><br>

        <input type="hidden" name="_token" value="{{ csrf_token() }}">
        <input type="submit" value="Tìm Kiếm">
    </form>
<table class="table table-striped">
  <thead>
    <tr>
      <th scope="col">BookId</th>
      <th scope="col">AuthorId</th>
      <th scope="col">Title</th>
      <th scope="col">ISBN</th>
      <th scope="col">Pub_year</th>
      <th scope="col">Available</th>
    </tr>
  </thead>
  <tbody>
  @foreach($book as $b)
    <tr>
      <th scope="row">{{ $b['bookid'] }}</th>
      <td>{{ $b['authorid'] }}</td>
      <td>{{ $b['title'] }}</td>
      <td>{{ $b['ISBN'] }}</td>
      <td>{{ $b['pub_year'] }}</td>
      <td>{{ $b['available'] }}</td>
    </tr>
  @endforeach
    
  </tbody>
</table>
<button><a href="{{ route('add') }}">Insert</a></button>
</body>
<style>
    body {
        width: 70%;
        margin: 2rem auto;
    }
    input[type="text"] {
        
        padding: 10px;
        border: 1px solid #ccc;
        border-radius: 5px;
        font-size: 16px;
    }

    input[type="text"]:focus {
        outline: none;
        box-shadow: 0 0 5px #6c63ff;
    }
    a{
      font-size: 3rem;
      padding: 1rem;
      text-decoration: none;
    }
    label {
        margin-right: 15px;
        font-size: 2rem;
    }
</style>
</html>