<?php
$_SESSION['username'] = "Admin";
?>

<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>My Player List</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="https://fonts.googleapis.com/css?family=Catamaran:100,200,300,400,500,600,700,800,900|Cormorant+Garamond:300,300i,400,400i,500,500i,600,600i,700,700i" rel="stylesheet">
    <link rel="stylesheet" href="styles/style.css">
</head>
<body>
<header>
    <a href="#" class="header-brand">DREAM SOCCER</a>
    <nav>
        <ul>
            <li><a href="player.html">PLAYERS</a></li>
            <li><a href="img.html">IMG</a></li>
        </ul>
        <a href="cases.html" class="header-cases">Cases</a>
    </nav>
</header>
<main>
    <section class="gallery-links">
        <div class="wrapper">
            <h2>Gallery</h2>

            <div class="gallery-container">
                <?php
                include_once 'includes/dbh.inc.php';

                $sql = "SELECT * FROM player ORDER BY orderGallery DESC;";
                $stmt = mysqli_stmt_init($conn);
                if (!mysqli_stmt_prepare($stmt, $sql)) {
                    echo "SQL statement failed!";
                } else{
                    mysqli_stmt_execute($stmt);
                    $result = mysqli_stmt_get_result($stmt);

                    while ($row = mysqli_fetch_assoc($result)) {
                        echo '<a href="#">
                            <div style="background-image: url(img/gallery/'.$row["imgFullName"].');"></div>
                            <h3>'.$row["Title"].'</h3>
                            <p>'.$row["Desc"].'</p> 
                        </a>';
                    }
                }
                ?>
            </div>

            <?php
            if (isset($_SESSION['username'])) {
                echo '<div class="gallery-upload">
                <h2>Upload</h2>
                <div>
                    <form action="includes/gallery-upload.inc.php" method="post" enctype="multipart/form-data">
                    <input type="text" name="filename" placeholder="File name...">
                    <input type="text" name="filetitle" placeholder="Image title...">
                    <input type="text" name="filedesc" placeholder="Image description...">
                    <input type="file" name="file">
                    <button type="submit" name="submit">UPLOAD</button>
                </form>
                </div>';
            }
            ?>

        </div>
    </section>
</main>
<div class="wrapper">
    <footer>
        <ul class="footer-links-main">
            <li><a href="#">Home</a></li>
            <li><a href="#">Cases</a></li>
            <li><a href="#">Portfolio</a></li>
            <li><a href="#">About me</a></li>
            <li><a href="#">Contact</a></li>
        </ul>
        <ul class="footer-links-cases">
            <li><p>Latest cases</p></li>
            <li><a href="#">CODELEAN - WEB DEVELOPMENT</a></li>
            <li><a href="#">DEW - WEB DEVELOPMENT, SEO</a></li>
            <li><a href="#">CUONGDEW - YOUTUBE CHANNEL</a></li>
            <li><a href="#">CODELEAN - VIDEO PRODUCTION</a></li>
        </ul>
        <div class="footer-sm">
            <a href="#">
                <img src="img/youtube-symbol.png" alt="youtube icon">
            </a>
            <a href="#">
                <img src="img/twitter-logo-button.png" alt="youtube icon">
            </a>
            <a href="#">
                <img src="img/facebook-logo-button.png" alt="youtube icon">
            </a>
        </div>
    </footer>
</div>
</body>
</html>


