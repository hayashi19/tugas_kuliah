package no_1;

public class PegawaiHarianClass extends PegawaiClass {
      
      private int uang_per_hari;
      public int getUang_per_hari() {
            return uang_per_hari;
      }
      public void setUang_per_hari(int uang_per_hari) {
            this.uang_per_hari = uang_per_hari;
      }

      public int Pph() {
            return (int)(0.015 * getUang_per_hari());
      }

      public int TotalGaji(int gapok) {
            return (int)(getUang_per_hari() - Pph());
      }

}
