<!DOCTYPE html>
<html lang="zxx">
<head>
    <title>Index | DanhSach</title>
</head>

<body>
<div>
     <h2 align="center">ĐĂNG KÍ TIÊM VACXIN COVID</h2>
    <form action="Commit" method="post">
        @csrf
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


    <?php
    $cmnd = '';
    if (!empty($_POST['cmnd'])) {
        $cmnd = $_POST['cmnd'];
        echo "Finding record, {$_POST['cmnd']}, and Result";
    }
    ?>
    <form action="<?php echo $_SERVER['PHP_SELF']; ?>" method="post">
        Nhập số cmnd của bạn: <input type="text" name="cmnd" />
        <input type="submit" value="Search"/>
    </form>
    <br><br>

    <?php
    $myDB = new mysqli('localhost', 'root', '', 'tiem_vacxin');
    if ($myDB->connect_error)
    {
        die('Connect Error (' . $myDB->connect_error . ') '
            . $myDB->connect_error);
    }

    if ($cmnd != '') {
        $sql = "SELECT * FROM lists
        WHERE cmnd LIKE '%{$cmnd}%'
        ORDER BY cmnd";
    }else{
        $sql = "SELECT * FROM lists";
    }

    $result = $myDB->query($sql);
    ?>

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
        <?php
        while ($row = $result->fetch_assoc() ) {
            echo "<tr>";
            echo "<td align='center'>";
            echo $row["cmnd"];
            echo "</td><td>";
            echo $row["hovaten"];
            echo "</td><td>";
            echo $row["ngaythangnamsinh"];
            echo "</td><td>";
            echo $row["diachi"];
            echo "</td><td>";
            echo $row["sdt"];
            echo "</td><td>";
            echo $row["tiensudiung"];
            echo "</td>";
            echo "</tr>";
        }
        ?>
    </table>
</div>
</body>

</html>
