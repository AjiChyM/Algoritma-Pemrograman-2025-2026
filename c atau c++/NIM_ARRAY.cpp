#include <iostream>
#include <vector>
using namespace std;

int main() {
    string nim = "2510161";
    vector<int> digits;

    // Memisahkan setiap digit dengan loop
    for(char c : nim) {
        digits.push_back(c - '0');
    }

    int total = 0, maks = digits[0], minim = digits[0];

    for(int d : digits) {
        total += d;
        if(d > maks) maks = d;
        if(d < minim) minim = d;
    }

    double rata = (double)total / digits.size();

    // Reverse array
    vector<int> rev;
    for(int i = digits.size() - 1; i >= 0; i--) {
        rev.push_back(digits[i]);
    }

    // Output
    cout << "Array digit = [ ";
    for(int d : digits) cout << d << " ";
    cout << "]\n";

    cout << "Total digit = " << total << endl;
    cout << "Digit maksimum = " << maks << endl;
    cout << "Digit minimum = " << minim << endl;
    cout << "Rata-rata digit = " << rata << endl;

    cout << "Reverse array = [ ";
    for(int d : rev) cout << d << " ";
    cout << "]\n";
}
