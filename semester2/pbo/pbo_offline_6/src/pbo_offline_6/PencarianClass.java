package pbo_offline_6;

import java.util.Arrays;
import java.util.Random;

public class PencarianClass {

    static void RataRata(int[] x) {
        float rerata = 0;
        int i = 0;
        while(i < x.length) {
            rerata += x[i];
            i++;
        }
        rerata = rerata / x.length;
        System.out.println("Rata-rata: " + rerata);
    }
    
    static void NilaiTerbesar(int[] x) {
        int terbesar = x[0];
        for(int i = 1; i < x.length; i++) {
            if(x[i] > terbesar){
                terbesar = x[i];
            }
        }
        System.out.println("Terbesar: " + terbesar);
    }
    
    static void NilaiTerkecil(int[] x) {
        int terkecil = x[0];
        for(int i = 1; i < x.length; i++) {
            if(x[i] < terkecil){
                terkecil = x[i];
            }
        }
        System.out.println("Terbesar: " + terkecil);
    }
    
    static void PencarianArray(int[] x, int value) {
        int pencarian = Arrays.binarySearch(x, value);
        String adaTidak = pencarian >= 0 ? "ADA" : "TIDAK ADA";
        System.out.println(adaTidak + ": " + value);
    }
    
}
