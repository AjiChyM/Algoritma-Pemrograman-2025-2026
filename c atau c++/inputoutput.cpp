#include <iostream>
#include <string>
using namespace std;

int main() {
    string nama;
    double harga;
    int jumlah;

    cout << "Masukkan nama barang: ";
    getline(cin, nama);

    cout << "Masukkan harga barang: ";
    cin >> harga;

    cout << "Masukkan jumlah beli: ";
    cin >> jumlah;

    double total = harga * jumlah;
    double diskon;

    if (total > 16100) {
        diskon = total * 0.01;
    } else {
        diskon = 0;
    }

    double total_bayar = total - diskon;

    cout << "\n===== STRUK PEMBELIAN =====\n";
    cout << "Nama Barang     : " << nama << endl;
    cout << "Harga Satuan    : " << harga << endl;
    cout << "Jumlah Beli     : " << jumlah << endl;
    cout << "Total Harga     : " << total << endl;
    cout << "Diskon (1%)     : " << diskon << endl;
    cout << "Total Bayar     : " << total_bayar << endl;
    cout << "===========================\n";

    return 0;
}