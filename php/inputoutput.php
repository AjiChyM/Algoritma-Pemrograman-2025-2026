<?php

echo "Masukkan nama barang: ";
$nama = trim(fgets(STDIN));

echo "Masukkan harga barang: ";
$harga = floatval(trim(fgets(STDIN)));

echo "Masukkan jumlah beli: ";
$jumlah = intval(trim(fgets(STDIN)));

$total = $harga * $jumlah;

if ($total > 16100) {
    $diskon = $total * 0.01;
} else {
    $diskon = 0;
}

$total_bayar = $total - $diskon;

echo "\n===== STRUK PEMBELIAN =====\n";
echo "Nama Barang     : $nama\n";
echo "Harga Satuan    : $harga\n";
echo "Jumlah Beli     : $jumlah\n";
echo "Total Harga     : $total\n";
echo "Diskon (1%)     : $diskon\n";
echo "Total Bayar     : $total_bayar\n";
echo "===========================\n";