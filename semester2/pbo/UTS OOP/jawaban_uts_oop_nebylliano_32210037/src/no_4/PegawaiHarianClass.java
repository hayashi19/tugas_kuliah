package no_4;

class PegawaiHarianClass extends PegawaiClass {
      
      int uang_per_hari;

      public int Pph() {
            return (int)(0.015 * uang_per_hari);
      }

      public int TotalGaji() {
            return (int)(uang_per_hari - Pph());
      }

}
