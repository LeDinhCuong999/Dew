<html>
<body>
<?php
$x = array();
$y = array();
echo 'array()' .'<=>' .'array()' .' returns ', $x <=> $y;
// This will output 0
echo '</br>';
$m = array(1, 2, 3);
$n = array(1, 2, 3);
$p = array(1, 2, 1);
$q = array(1, 2, 4);
echo 'array(1,2,3)' .'<=>' .'array(1,2,3)' .' Returns ', $m <=> $n;
// This will output 0
echo '</br>';
echo 'array(1,2,3)' .'<=>' .'array()' .' Returns ', $m <=> $n;
// This will output 1
echo '</br>';
echo 'array(1,2,3)' .'<=>' .'array(1,2,4)' .' Returns ', $m <=> $n;
// This will output -1
echo '</br>';
?>
</body>
</html>