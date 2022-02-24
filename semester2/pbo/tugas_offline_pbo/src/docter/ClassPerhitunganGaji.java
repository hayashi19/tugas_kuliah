package tugas_offline_bpo_2;

public class MethodClass {
    
    // Buat variable untuk fungsi perhitungan
    static String docId = "", docNama = "", docGaji = "";
    static int docTunjanganJumlah, docTotalGajiJumlah;
    
    // Buat fungsi untuk menghitung uang makan
    int uangMakan() {
        
        return (int) (Integer.parseInt(docGaji) * 0.1);
        
    }
    
    // Buat fungsi untuk menghitung transport
    int transport() {
        
        return (int) (Integer.parseInt(docGaji) * 0.1);
        
    }
    
    // Buat fungsi untuk menghitung total gaji
    int totalGaji() {
        
        return (int) (Integer.parseInt(docGaji) + uangMakan() + transport());
        
    }
    
}
