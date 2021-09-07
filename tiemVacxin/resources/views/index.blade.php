<!DOCTYPE html>
<html lang="zxx">
<head>
    <title>Trangchu | DanhSach</title>
</head>

<body>
<div>

    <form action="commit" method="post">
        @csrf
        <h2 align="center">ĐĂNG KÍ TIÊM VACXIN COVID</h2>

        <table cellspacing="3" cellpadding="12" align="center" border="4" bgcolor="#add8e6">
            <tr>
                <td>Số cmnd/cccd</td>
                <td><input type="text" name="cmnd"></td>
            </tr>
            <tr>
                <td>Họ và tên</td>
                <td><input type="text" name="hovaten"></td>
            </tr>
            <tr>
                <td>Ngày tháng năm sinh</td>
                <td><input type="date" name="ngaythangnamsinh"></td>
            </tr>
            <tr>
                <td>Địa chỉ</td>
                <td><input type="text" name="diachi"></td>
            </tr>
            <tr>
                <td>Số điện thoại</td>
                <td><input type="text" name="sdt"></td>
            </tr>
            <tr>
                <td>Tiền sử dị ứng</td>
                <td><input type="text" name="tiensudiung"></td>
            </tr>
            <tr>
                <td>=============></td>
                <td><button type="submit">ĐĂNG KÝ</button></td>
            </tr>
        </table>
    </form>


    <br><br><br>
{{--    --}}
    <br><br><br>



    <form action="search" method="get">
        Nhập số cmnd của bạn: <input type="search" name="search" />
        <button type="submit" value="Search">Search</button>
    </form>
    <br><br>




{{--    --}}
    <table cellspacing="3" cellpadding="20" align="center" border="6" bgcolor="#fff8dc">

        <tr>
            <td colspan="8">
                <h1 align="center">Danh sách người đăng kí tiêm vacxin</h1>
            </td>
        </tr>

        <tr>
            <td align="center">cmnd</td>
            <td align="center">hovaten</td>
            <td align="center">ngaythangnamsinh</td>
            <td align="center">diachi</td>
            <td align="center">sdt</td>
            <td align="center">tiensudiung</td>
        </tr>

        @foreach($lists as $list)
        <tr>
            <td>{{$list['cmnd']}}</td>
            <td>{{$list['hovaten']}}</td>
            <td>{{$list['ngaythangnamsinh']}}</td>
            <td>{{$list['diachi']}}</td>
            <td>{{$list['sdt']}}</td>
            <td>{{$list['tiensudiung']}}</td>
        </tr>
        @endforeach
    </table>
</div>
</body>

</html>
