package docter;
import javax.swing.JOptionPane;

public class ClassDocter {

    public static void main(String[] args) {
        
        // Covert class to obj
        ClassPerhitunganGaji objPerhitunganGaji = new ClassPerhitunganGaji();
        
        // Input semua atribut
//        objPerhitunganGaji.docId = JOptionPane.showInputDialog("Id Dokter:"); 
//        objPerhitunganGaji.docNama = JOptionPane.showInputDialog("Nama Anda:");
//        objPerhitunganGaji.docGaji = Integer.parseInt(JOptionPane.showInputDialog("Gaji:"));
//        
        while(objPerhitunganGaji.docId.isEmpty()) {
            objPerhitunganGaji.docId = JOptionPane.showInputDialog("Id Dokter:");
        }
        
        while(objPerhitunganGaji.docNama.isEmpty()) {
            objPerhitunganGaji.docNama = JOptionPane.showInputDialog("Nama Anda:");
        }
        
        while(Integer.toString(objPerhitunganGaji.docGaji).isEmpty()) {
            objPerhitunganGaji.docGaji = Integer.parseInt(JOptionPane.showInputDialog("Gaji:"));
        }
        
        // buat variable pesan yang akan menampilkan semua data disampaikan pada message dialog
        String message =
                "Data Anda" +
                "\nId: " + objPerhitunganGaji.docId +
                "\nNama: " + objPerhitunganGaji.docNama +
                "\nGaji: " + objPerhitunganGaji.docGaji + 
                "\nTunjangan anda: Rp " + objPerhitunganGaji.docTunjangan() + 
                "\nTotal gaji anda: Rp " + objPerhitunganGaji.docTotalGaji();
        
        // Tampilkan message dialog dengan value var [message]
        JOptionPane.showMessageDialog(null, message);
    
    }
    
}
