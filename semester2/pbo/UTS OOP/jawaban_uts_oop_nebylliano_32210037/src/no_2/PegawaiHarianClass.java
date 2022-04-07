package no_2;

public class PegawaiHarianClass {
      
      static int uang_per_hari;

      static int Pph() {
            return (int)(0.015 * uang_per_hari);
      }

      static int TotalGaji() {
            return (int)(uang_per_hari - Pph());
      }

}
