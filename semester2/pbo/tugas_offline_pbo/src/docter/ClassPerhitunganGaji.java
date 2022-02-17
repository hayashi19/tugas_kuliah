package docter;

public class ClassPerhitunganGaji {
    
    // Buat variable untuk fungsi perhitungan
    String docId = "", docNama = "";
    int docGaji;
    
    // Fungsi untuk perhitungan tunjangan
    public int docTunjangan() {
        return (int) (docGaji * 0.1);
    }
    
    // fungsi total gaji
    public int docTotalGaji() {
        return (int) (docTunjangan() + docGaji);
    }
    
}
