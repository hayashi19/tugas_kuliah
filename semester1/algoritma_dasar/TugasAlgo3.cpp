// TUGAS ALGORITMA no 1

#include <iostream>
using namespace std;

main() {
    int umur;

    cout << "Input Umur: ";
    cin >> umur;
    if (umur < 20) {
        cout << "Umur anda kurang dari 20th";
    } else if (umur > 20) {
        cout << "Umur anda lebih dari 20th";
    } else {
        cout << "Umur anda tepat 20th";
    }
}
/* Pembetulannya dilakukan pada if dan else yang tidak diberikan kurung kurawa, 
sehingga terhadi error pada program */

/* Unutk membuat statement conditional penentuan umur lebih dari 20, atau pas, atau pun kurang.
Bisa dipakai statement if else.
if umur <<kurang dari>> 20, maka "....."
else if umur <<lebih besar>> 20, maka "....."
else sisanya dimana hanya ada 20 */