<!DOCTYPE html>
<html lang="zxx">

<head>
    <meta charset="UTF-8">
    <title>Noi That</title>
    <!-- Bootstrap -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-F3w7mX95PdgyTmZZMECAngseQB83DfGTowi0iMjiWaeVhAn4FJkqJByhZMI3AhiU" crossorigin="anonymous">
    <!-- Google Font -->
    <link href="https://fonts.googleapis.com/css?family=Muli:300,400,500,600,700,800,900&display=swap" rel="stylesheet">
</head>

<body>
    <form action="commit" method="post">
        @csrf
        <h1 align="center">Luu Do Noi That</h1>

        <table cellspacing="3" cellpadding="12" align="center" border="4" bgcolor="#add8e6">
            <tr>
                <td>______name______</td>
                <td><input type="text" name="name"></td>
            </tr>
            <tr>
                <td>______price_______</td>
                <td><input type="text" name="price"></td>
            </tr>
            <tr>
                <td>______image_______</td>
                <td><input type="file" name="file"></td>
            </tr>
            <tr>
                <td>=============></td>
                <td><button type="submit">Save</button></td>
            </tr>
        </table>
    </form>


    <br><br><br>
    <tr>
        <td colspan="8">
            <b><h1 align="center">Danh Sach Do Noi That</h1></b>
        </td>
    </tr>
    <div align="center">
        <table>
            @foreach($datas as $data)
                <div align="center" class="card" style="width: 45rem;">
                    <img src="front/image/{{$data->image}}" cellspacing="3" cellpadding="12" border="8" class="card-img-top" alt="...">
                    <div class="card-body">
                        <h4 class="card-text">Name: {{$data->name}}</h4>
                        <h4 class="card-text">Price: {{$data->price}}</h4>
                    </div>
                </div>
                <br>
            @endforeach
        </table>
    </div>

</body>
</html>
