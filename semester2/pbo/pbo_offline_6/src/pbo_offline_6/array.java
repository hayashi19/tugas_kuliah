package pbo_offline_6;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        PencarianClass objPencarianClass = new PencarianClass();
        
        Random rand = new Random();
        
        int[] arrayAngka = new int[5]; 
        
        for(int i = 0; i < arrayAngka.length; i++) {
            arrayAngka[i] = rand.nextInt(10);
        }
        
        System.out.println("Array: " + Arrays.toString(arrayAngka));
        
        objPencarianClass.RataRata(arrayAngka);
        objPencarianClass.NilaiTerbesar(arrayAngka);
        objPencarianClass.NilaiTerkecil(arrayAngka);
        
        System.out.print("Cari nilai array: ");
        int arrayKe = scanner.nextInt();
        
        objPencarianClass.PencarianArray(arrayAngka, arrayKe);
        
    }
}
