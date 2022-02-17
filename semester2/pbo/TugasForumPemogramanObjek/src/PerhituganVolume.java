import java.util.Scanner;

// Buat class bernama perhituganVolume
public class PerhituganVolume {
    
    public static void main(String[] args) throws Exception {
    
        // variable persingkat untuk scanner dan println
        Scanner scanner = new Scanner(System.in);
        var call = System.out;

        // variable untuk input data dari volume
        float jari, tinggi, volume;

        call.println("Masukan angka untuk perhitungan tabung.");

        // input jari-jari
        call.print("Jari-jari: ");
        jari = scanner.nextFloat();

        // input tinggi
        call.print("Tinggi: ");
        tinggi = scanner.nextFloat();

        // Perhitungan volume
        volume = (float) (Math.PI * jari * jari * tinggi);
        call.print("Volume tabung: " + volume);
    
    }

}
