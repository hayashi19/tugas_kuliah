// Tugas MatKul Algoritma dan Pemograman. Mebuat aplikasi perhitungan luas bangun datar. 
#include <stdio.h>

main() {

    // Deklarasi variable ukuran untuk bangun datar
    char bangun_datar;
    float sisi_1, sisi_2, sisi_3, luas;

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    // Memasukan input pilihan
    // Meminta user untuk memasukan kode bangun datar yang sesuai dengan kode yang telah diberikan untuk masuk keperhitungannya nanti
    printf("_____________________________________ \n");
    // Daftar kode yang disajikan untuk memudahkan user untuk memilih
    printf("Kode pemilihan jenis bangun ruang: \
            \n\t - Persegi: 's'         \n\t - Persegi Panjang: 'r' \
            \n\t - Segitiga 't'         \n\t - Lingkaran 'c' \
            \n\t - Trapesium 'a'        \n\t - Jajargenjang 'p' \
            \n\t - Layang-layang 'k'    \n\t - Belah Ketupat 'h'\n");
    printf("_____________________________________ \n\n");
    // Set input untuk user menginput jenis bangun datarnya
    printf("Jenis bangun ruang ? "); scanf("%s", &bangun_datar);

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    // Perhitungan dan penginputan ukuran dari bangun datar yang dipilih
    // Perhitungan akan disesuaikan dengan pilihan dari use yang telah dipilih sebelumnnya
    switch (bangun_datar)
    {
    // Persegi
    // User memasukan ukuran sisi dari persegi dan dihitung luas = s x s
    case 's' : 
        printf("Sisi  = ");             scanf("%f", &sisi_1);
        luas = sisi_1 * sisi_1;
        break;

    // Persegi panjang
    // User memasukan ukuran panjang dan lebar dari persegi panjang dan dihitung luas = p x l
    case 'r' : 
        printf("Panjang = ");           scanf("%f", &sisi_1);
        printf("Lebar   = ");           scanf("%f", &sisi_2);
        luas = sisi_1 * sisi_2;
        break;

    // Segitiga
    // User memasukan ukuran alas dan tinggi dari segitiga dan dihitung luas = 1/2 a x t
    case 't' : 
        printf("Alas    = ");           scanf("%f", &sisi_1);
        printf("Tinggi  = ");           scanf("%f", &sisi_2);
        luas = 0.5 * sisi_1 * sisi_2;
        break;

    // Lingkaran
    // User memasukan ukuran jari-jari dari lingkaran dan dihitung luas = πr^2
    case 'c' : 
        printf("Jari-jari   = ");       scanf("%f", &sisi_1);
        luas = 22/7 * sisi_1^2;
        break;

    // Trapesium
    // User memasukan ukuran sisi sejajar dan tinggi dari trapesium dan dihitung luas = 1/2 x (s + s) x t
    case 'a' : 
        printf("Sisi Sejajar 1  = ");   scanf("%f", &sisi_1);
        printf("Sisi Sejajar 2  = ");   scanf("%f", &sisi_2);
        printf("Tinggi          = ");   scanf("%f", &sisi_3);
        luas = 0.5 * (sisi_1 + sisi_2) * sisi_3;
        break;

    // Jajar genjang
    // User memasukan ukuran alas dan tinggi dari jajargenjang dan dihitung luas = a x t 
    case 'p' : 
        printf("Alas    = ");           scanf("%f", &sisi_1);
        printf("Tinggi  = ");           scanf("%f", &sisi_2);
        luas = sisi_1 * sisi_2;
        break;

    // Layang-layang
    // User memasukan ukuran diagonal dari layang-layang dan dihitung luas = 1/2 x d1 x d2
    case 'k' : 
        printf("Diagonal 1  = ");       scanf("%f", &sisi_1);
        printf("Diagonal 2  = ");       scanf("%f", &sisi_2);
        luas = 0.5 * sisi_1 * sisi_2;
        break;

    // Belah ketupat
    // User memasukan ukuran diagonal dari belah ketupat dan dihitung luas = 1/2 x d1 x d2
    case 'h' : 
        printf("Diagonal 1  = ");       scanf("%f", &sisi_1);
        printf("Diagonal 2  = ");       scanf("%f", &sisi_2);
        luas = 0.5 * sisi_1 * sisi_2;
        break;

    // Tidak ada pilihan
    default:
        printf("Tolong pilih salah satu bangun datar.");
        break;
    }

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    // Output dari perhitungan
    printf("_____________________________________\n");
    printf("Luas = %f ", luas);
}