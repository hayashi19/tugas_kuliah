package no_6;

public class PegawaiHarianClass extends PegawaiClass {
      
      int uang_per_hari;

      @Override
      public int Pph() {
            return (int)(0.015 * uang_per_hari);
      }

      @Override
      public int TotalGaji() {
            return (int)(uang_per_hari - Pph());
      }

}