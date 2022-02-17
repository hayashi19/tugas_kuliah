#include <iostream> // import library
#include <string>
using namespace std;

main(){
    // SECTION 1: DEKLARASI VARIABLE =============================================================================
    /*  Seksi satu buat deklarasi variable,
        var harga barang, kode barang dll.*/
    int harga_barang[7] = {0, 1500000, 300000, 2500000, 2200000, 5750000, 6230000},
        kode_barang = 1,
        jumlah_barang,
        total,
        subtotal = 0,
        discount,
        ppn,
        grand_total,
        change,
        i = 1; // Ini nanti buat dipake di looping while.

    string no_nota; // Ini var buat no nota.
    // ============================================================================= // 

    // SECTION 2: INPUT NOTA =============================================================================
    /*  Buat input no nota yang disimpen nanti di var [no_nota]. */
    cout << "No nota: ";
    cin >> no_nota;
    cout << "=========================================" << endl;
    // ============================================================================= //

    /*  Ini cuman buat petuntuk penggunaan aja nanti, karena program ini kan pake kode untuk mewakilkan setiap barang. */
    cout << "Kode barang: || 1. Meja || 2. Kursi || 3. Lemari || 4. Rak || 5. Sofa || 6. Springbed." << endl;

    // SECTION 3: INPUT BARANG DAN HARGANYA =============================================================================
    /*  Ini buat penginput barang dan harganya,
        nanti dari while kan akan di loop terus selama penginputan kode barangnya != 0.*/
    while (kode_barang != 0){
        /* Pertama input kode barangnya dulu sesuai yang ada di petunjuk */
        cout    << "Input code barang ke " << i << ": ";    cin     >> kode_barang;

        /* If ini cuman dipake buat biar nanti pas user input kode barang == 0, looping nya akan berhenti.*/
        if (kode_barang != 0){
            /* Input jumlah barang. */    
            cout    << "Jumlah barang ke " << i << ": ";        cin     >> jumlah_barang;

            /* Menghtung total masing masing barang */
            total   = harga_barang[kode_barang] * jumlah_barang;
            cout    << "Total barang ke " << i << ": Rp ";      cout    << total << endl << endl;   
        } else{
            /* Untuk stop looping nya, pake break. */
            break; 
            cout << endl;
        }

        /*  Ini untuk perhitungan subtotalnya, masih ada di dalam looping while nya karena harus menambahkan setiap total dari
            setiap barang yang di input. */
        subtotal    = subtotal + total;
        total       = 0;
        i++; 
    }
    // ============================================================================= //

    cout << "=========================================" << endl;

    // SECTION 4: SUBTOTAL =============================================================================
    /* Untuk menampilkan subtotalnya */
    cout        << "Subtotal: Rp " << subtotal << endl;
    // ============================================================================= //

    // SECTION 5: DISCOUNT =============================================================================
    /* Perhitungan diskon nya pake if, jika lebih dari 5jt maka ...., dan seterusnya. Lalu nanti ditampilin cout << ..... */
    if(subtotal > 5000000){
        discount = subtotal * 0.3;
    }
    if((subtotal > 2000000) and (subtotal < 5000000)){
        discount = subtotal * 0.15;
    }
    if(subtotal < 2000000){
        discount = 0;
    } 
    cout << "Discount: Rp " << discount << endl;
    // ============================================================================= //

    // SECTION 6: PAJAK =============================================================================
    /* Perhitungan ppn berdasarkan rumus. */
    ppn = (subtotal - discount) * 0.1;
    cout << "PPN: Rp " << ppn << endl;
    // ============================================================================= //

    // SECTION 7: GRAND TOTAL =============================================================================
    /* Perhitungan grand total. */
    grand_total = subtotal - discount + ppn;
    cout << "Grand Total: Rp " << grand_total << endl;
    // ============================================================================= //

    cout << "=========================================" << endl;

    // SECTION 8: PERHITUNGAN KEMBALIAN =============================================================================
    /* Perhitungan kembalian. */
    cout    << "Jumlah dibayar: Rp ";
    cin     >> change;
    change  = change - grand_total;
    cout    << "Total Kembalian: Rp " << change << endl;
    // ============================================================================= //
    
}
