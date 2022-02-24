package tugas_offline_bpo_2;
import javax.swing.JOptionPane;
import tugas_offline_bpo_2.*;

public class Tugas_offline_bpo_2 {

    public static void main(String[] args) {
        
        // Covert class to obj
        MethodClass objPerhitunganGaji = new MethodClass();
        
        // Input buat data docternya
        while(MethodClass.docId.isEmpty()) {
            MethodClass.docId = JOptionPane.showInputDialog("Id Dokter:");
        }
        
        while(MethodClass.docNama.isEmpty()) {
            MethodClass.docNama = JOptionPane.showInputDialog("Nama Anda:");
        }

        while(MethodClass.docGaji.isEmpty()) {
            MethodClass.docGaji = JOptionPane.showInputDialog("Gaji:");
        }

        // buat variable pesan yang akan menampilkan semua data disampaikan pada message dialog
        String message =
                "Data Dokter Anda" +
                "\nId: " + MethodClass.docId +
                "\nNama: " + MethodClass.docNama +
                "\nGaji: " + MethodClass.docGaji + 
                "\nUang makan: Rp " + objPerhitunganGaji.uangMakan() + 
                "\nTransportasi: Rp " + objPerhitunganGaji.transport() + 
                "\nTotal gaji anda: Rp " + objPerhitunganGaji.totalGaji();
        
        // Tampilkan message dialog dengan value var [message]
        JOptionPane.showMessageDialog(null, message);
        
    }
    
}
