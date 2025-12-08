<?php

$nim = "2510066";
$digits = [];

// Pisahkan digit satu per satu
for ($i = 0; $i < strlen($nim); $i++) {
    $digits[] = intval($nim[$i]);
}

$total = array_sum($digits);
$maks = max($digits);
$minim = min($digits);
$rata = $total / count($digits);

$reverse = array_reverse($digits);

// Output
echo "Array digit = [ " . implode(" ", $digits) . " ]<br>";
echo "Total digit = $total<br>";
echo "Digit maksimum = $maks<br>";
echo "Digit minimum = $minim<br>";
echo "Rata-rata digit = $rata<br>";
echo "Reverse array = [ " . implode(" ", $reverse) . " ]<br>";

?>
