// Tugas MatKul Algoritma dan Pemograman. Mebuat aplikasi perhitungan luas bangun datar. 
#include <stdio.h>

void main() {

    //Deklarasi variable ukuran untuk bangun datar
    char bangun_datar;
    int sisi_1, sisi_2, luas;

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //Memasukan input pilihan
    //Meminta user untuk memasukan kode bangun datar yang sesuai dengan kode yang telah diberikan untuk masuk keperhitungannya nanti
    printf("_____________________________________ \n");
    //Daftar kode yang disajikan untuk memudahkan user untuk memilih
    printf("Kode pemilihan jenis bangun ruang: \
            \n\t - Segitiga 't'         \n\t - Lingkaran 'c'\n");
    printf("_____________________________________ \n\n");
    //Set input untuk user menginput jenis bangun datarnya
    printf("Jenis bangun ruang ? "); scanf("%s", &bangun_datar);

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

 //Perhitungan dan penginputan ukuran dari bangun datar yang dipilih
    //Perhitungan akan disesuaikan dengan pilihan dari use yang telah dipilih sebelumnnya
    switch (bangun_datar)
    {
    //Segitiga
    //User memasukan ukuran alas dan tinggi dari segitiga dan dihitung luas = 1/2 a x t
    case 's' : 
        printf("Alas    = ");           scanf("%d", &sisi_1);
        printf("Tinggi  = ");           scanf("%d", &sisi_2);
        luas = 0.5 * sisi_1 * sisi_2;
        break;

    //Lingkaran
    //User memasukan ukuran jari-jari dari lingkaran dan dihitung luas = πr^2
    case 'l' : 
        printf("Jari-jari   = ");       scanf("%d", &sisi_1);
        luas = (22 * sisi_1 * sisi_1) / 7;
        break;

    //Tidak ada pilihan
    default:
        printf("Tolong pilih salah satu bangun datar.");
        break;
    }

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //Output dari perhitungan
    printf("_____________________________________\n");
    printf("Luas = %d ", luas);
}