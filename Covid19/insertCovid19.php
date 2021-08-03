<?php
require_once 'config.php';

$id = $name = $tel = $address = $f = $location = $start_date = $end_date = "";
$id_err = $name_err = $tel_err = $address_err = $f_err = $location_err = $start_date_err = $end_date_err = "";

if($_SERVER["REQUEST_METHOD"]=="POST"){

    $input_id = trim($_POST["id"]);
    if (empty($input_id)){
        $id_err="Enter an id";
    }else {
        $id = $input_id;
    }

    $input_name = trim($_POST["name"]);
    if (empty($input_name)){
        $name_err="Enter a name";
    }elseif (!filter_var(trim($_POST["name"]),FILTER_VALIDATE_REGEXP ,
        array("options"=>array("regexp"=>"/^[a-zA-Z'-.\s]+$/")))){
        $name_err = 'Enter a valid name';
    }else{
        $name = $input_name;
    }

    $input_tel = trim($_POST["tel"]);
    if (empty($input_tel)){
        $tel_err="Enter a tel";
    }else {
        $tel = $input_tel;
    }


    $input_address = trim($_POST["address"]);
    if (empty($input_address)){
        $address_err="Enter an address";
    }else {
        $f = $input_address;
    }

    $input_f = trim($_POST["f"]);
    if (empty($input_f)){
        $f_err="Enter a f";
    }else {
        $f = $input_f;
    }

    $input_location = trim($_POST["location"]);
    if (empty($input_location)){
        $location_err="Enter the location";
    }else {
        $location = $input_location;
    }

    $input_start_date = trim($_POST["start_date"]);
    if (empty($input_start_date)){
        $start_date_err="Enter the start_date";
    }else {
        $start_date = $input_start_date;
    }

    $input_end_date = trim($_POST["end_date"]);
    if (empty($input_end_date)){
        $end_date_err="Enter the end_date";
    }else {
        $end_date = $input_end_date;
    }

    if (empty($id_err) && empty($name_err) && empty($tel_err) && empty($address_err) && empty($f_err) && empty($location_err) && empty($start_date_err) && empty($end_date_err)){
        $sql = "INSERT INTO people (id, name, tel, address, f, location, start_date, end_date) VALUE (?,?,?,?,?,?,?,?)";
        if ($stmt = mysqli_prepare($link,$sql)){
            mysqli_stmt_bind_param($stmt,"ssd",$param_id,$param_name, $param_tel, $param_address, $param_f, $param_location, $param_start_date, $param_end_date);
            $param_id = $id;
            $param_name = $name;
            $param_tel = $tel;
            $param_address = $address;
            $param_f = $f;
            $param_location = $location;
            $param_start_date = $start_date;
            $param_end_date = $end_date;

            if (mysqli_stmt_execute($stmt)){
                header("location:indexCovid19.php");
                exit();
            }else{
                echo "Something went wrong.Please try again later";
            }
        }
        mysqli_stmt_close($stmt);

    }
    mysqli_close($link);
}
?>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Insert Record</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.css">
    <style type="text/css">
        .wrapper{
            width:  500px;
            margin: 0 auto;
        }
    </style>
</head>
<body>
<div class="wrapper">
    <div class="container_fluid">
        <div class="row">
            <div class="page-header">
                <h2>Insert Record</h2>
            </div>
            <p>Please fill this and submit to add people record the database</p>
            <form action="<?php echo htmlspecialchars($_SERVER["PHP_SELF"])?>" method="post">
                <div class="form-group <?php echo (!empty($id_err))? 'has-error':''; ?>">
                    <label>Id</label>
                    <input type="text" name="id" class="form-control" value="">
                    <span class="help-block"><?php echo $id_err; ?></span>
                </div>

                <div class="form-group <?php echo (!empty($name_err))? 'has-error':''; ?>">
                    <label>Name</label>
                    <input type="text" name="name" class="form-control" value="">
                    <span class="help-block"><?php echo $name_err; ?></span>
                </div>

                <div class="form-group <?php echo (!empty($tel_err))? 'has-error':''; ?>">
                    <label>Tel</label>
                    <input type="text" name="tel" class="form-control" value="">
                    <span class="help-block"><?php echo $tel_err; ?></span>
                </div>

                <div class="form-group <?php echo (!empty($address_err))? 'has-error':''; ?>">
                    <label>Address</label>
                    <input type="text" name="address" class="form-control" value="">
                    <span class="help-block"><?php echo $address_err; ?></span>
                </div>

                <div class="form-group <?php echo (!empty($f_err))? 'has-error':''; ?>">
                    <label>F</label>
                    <input type="text" name="f" class="form-control" value="">
                    <span class="help-block"><?php echo $f_err; ?></span>
                </div>

                <div class="form-group <?php echo (!empty($location_err))? 'has-error':''; ?>">
                    <label>Location</label>
                    <input type="text" name="location" class="form-control" value="">
                    <span class="help-block"><?php echo $location_err; ?></span>
                </div>

                <div class="form-group <?php echo (!empty($start_date_err))? 'has-error':''; ?>">
                    <label>Start_date</label>
                    <input type="date" name="start_date" class="form-control" value="">
                    <span class="help-block"><?php echo $start_date_err; ?></span>
                </div>

                <div class="form-group <?php echo (!empty($end_date_err))? 'has-error':''; ?>">
                    <label>End_date</label>
                    <input type="date" name="end_date" class="form-control" value="">
                    <span class="help-block"><?php echo $end_date_err; ?></span>
                </div>
                <input type="submit" class="btn btn-primary" value="Submit">
                <a href="indexCovid19.php" class="btn btn-default">Cancel</a>
            </form>
        </div>
    </div>
</div>
</body>
</html>