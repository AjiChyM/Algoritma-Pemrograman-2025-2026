#include <iostream>

using namespace std;

int main() {
    string namaBarang;
    int harga, jumlah;
    double diskon, total, totalbayar;

    cout << "Masukkan nama barang: ";
    cin >> namaBarang; 
 
    cout << "Masukkan harga barang: ";
    cin >> harga;


    cout << "Masukkan jumlah barang: ";
    cin >> jumlah;


    total = harga * jumlah;

 
    if (total >= 16100) {
        diskon = total * 0.01; 
    } else {
        diskon = 0;
    }


    totalbayar = total - diskon;

 
    cout << "\n======== Struk Pembelian ========\n";
    cout << "Nama Barang   : " << namaBarang << endl;
    cout << "Harga Barang  : " << harga << endl;
    cout << "Jumlah Barang : " << jumlah << endl;
    cout << "Total         : " << total << endl;
    cout << "Diskon        : " << diskon << endl;
    cout << "Total Bayar   : " << totalbayar << endl;
    cout << "=================================\n";

    return 0;
}