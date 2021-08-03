<html>
<head>
    <title>Search | DanhSach</title>
</head>

<body>
<?php
$title = '';
if (!empty($_POST['title'])) {
    $title = $_POST['title'];
    echo "Finding record, {$_POST['title']}, and Result";
}
?>

<form action="<?php echo $_SERVER['PHP_SELF']; ?>" method="post">
    Enter your name: <input type="text" name="title" />
    <input type="submit" value="Search"/>
</form>

<?php
$myDB = new mysqli('localhost', 'root', '', 'covid19');
if ($myDB->connect_error)
{
    die('Connect Error (' . $myDB->connect_error . ') '
        . $myDB->connect_error);
}

if ($title != '') {
    $sql = "SELECT * FROM people
        WHERE Name LIKE '%{$title}%'
        or F LIKE '%{$title}%'
        or Location LIKE '%{$title}%'
        ORDER BY Name";
}else{
    $sql = "SELECT * FROM people";
}

$result = $myDB->query($sql);
?>

<table cellspacing="3" cellpadding="20" align="center" border="8">

    <tr>
        <td colspan="8">
            <h1 align="center">Danh sach cau thu bong da cach ly</h1>
        </td>
    </tr>

    <tr>
        <td align="center">Id</td>
        <td align="center">Name</td>
        <td align="center">Tel</td>
        <td align="center">Address</td>
        <td align="center">F</td>
        <td align="center">Location</td>
        <td align="center">Start_date</td>
        <td align="center">End_date</td>
    </tr>
    <?php
    while ($row = $result->fetch_assoc() ) {
        echo "<tr>";
        echo "<td>";
        echo stripslashes($row["Id"]);
        echo "</td><td align='center'>";
        echo $row["Name"];
        echo "</td><td>";
        echo $row["Tel"];
        echo "</td><td>";
        echo $row["Address"];
        echo "</td><td>";
        echo $row["F"];
        echo "</td><td>";
        echo $row["Location"];
        echo "</td><td>";
        echo $row["Start_date"];
        echo "</td><td>";
        echo $row["End_date"];
        echo "</td>";
        echo "</tr>";
    }
    ?>
</table>
</body>
</html>

