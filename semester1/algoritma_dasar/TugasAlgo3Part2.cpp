#include <iostream>
#include <string>
using namespace std;

main() {

    // Deklarasi variable untuk array harga dan larik barang sebelum diskon
    int i, n = 3;
    string larik_barang[n] = {"ASUS", "iPhone", "Samsung"};
    int harga_jual[n] = {8000000, 21000000, 16000000}, diskon_harga[n];
    float p[n];
    // Deklarasi variabel untuk mendaftarkan array merek barang dan juga harga jual awalnya sebelum di diskon

    // Menampilkan daftar harga awal barang
    cout << "\n\nDaftar harga handphone.\n";
    cout << "=====================\n";
    cout << "Merek" << "\t | " << "Harga\n";
    cout << "=====================\n";

    // Loop untuk daftar barang nya
    for (i = 0; i < n; i++)
    {
        cout << larik_barang[i] << "\t | Rp " << harga_jual[i] << "\n";
    }

    cout << "=====================\n";

    // Menginput jumlah discount untuk harga handphone nya
    cout << "\nMemasukan harga diskon (%).\n";

    // Loop untuk memasukan jumlah diskon yang akan diperhitungkan berikutnya
    for (i = 0; i < n; i++)
    {
        cout << larik_barang[i] << ": ";
        // Memasukan jumlah diskon ke dalam variable <p> oleh user
        cin >> p[i];
    }

    // Perhitungan dan menampilkan daftar harga setelah diskon
    cout << "\nDaftar harga handphone setelah diskon.\n";
    cout << "=====================\n";
    cout << "Merek" << "\t | " << "Harga\n";
    cout << "=====================\n";

    for (i = 0; i < n; i++)
    {
        // Perhitungan diskon dari input <float p> yang variablenya sudah dimasukan
        diskon_harga[i] = harga_jual[i] * (p[i]/100);
        harga_jual[i] = harga_jual[i] - diskon_harga[i];

        // Menampilkan daftar harga setelah diskon
        cout << larik_barang[i] << "\t | Rp " << harga_jual[i] << "\n";
    }

    cout << "=====================\n";
}