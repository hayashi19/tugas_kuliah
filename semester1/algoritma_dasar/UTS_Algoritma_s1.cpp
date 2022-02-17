#include <stdio.h>
#include <iostream>
#include <string>
#include <cstring>
#include <math.h>
using namespace std;

main() {

    // No 1
    // Deklaraasi var untuk biodata
    char nama[100], prodi[100];
    int nim, kelas, panjang_nama;

    // Deklarasi var untuk titik objek
    double x1, y1, x2, y2, x, y, euclidean_distance;

    // No 2
    // Inputan untuk biodata
    cout << "Input biodata anda.\n";
    cout << "Nama   : "; gets(nama);
    cout << "NIM    : "; cin >> nim;
    cout << "Prodi  : "; cin >> prodi;
    cout << "Kelas  : "; cin >> kelas;
    cout << "\n";

    // Input untuk titik objek
    cout << "Input jarak antar objek.\n";
    cout << "Titik x1   : "; cin >> x1;
    cout << "Titik y1   : "; cin >> y1;
    cout << "Titik x2   : "; cin >> x2;
    cout << "Titik y2   : "; cin >> y2;
    cout << "\n";

    // NO 3
    // Hitung panjang nama / jumlah string nama
    panjang_nama = strlen(nama);

    // Hitung titik berdasarkan rumus Euclidean Distance
    x = x1 - x2;
    y = y1 - y2;

    euclidean_distance = pow(x, 2) + pow(y, 2);
    euclidean_distance = sqrt(euclidean_distance);
    
    // No 4
    cout << "Dengan ini saya “" << nama << " (" << panjang_nama << ")” dengan NIM " << nim << " dari prodi " << prodi << " (" << kelas << ") " << 
            "mengumpulkan jawaban UTS mata kuliah Algoritma dan Pemrograman berikut.\n" <<
            
            "Jarak antara Objek A yang berada di titik " << 
            x1 << ", " << y1 << 
            " dan Objek B yang berada di titik " << 
            x2 << ", " << y2 << 
            " adalah " << euclidean_distance;
}