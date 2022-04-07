package no_6;

public class PegawaiKontrakClass extends PegawaiClass {

      int uang_prestasi;

      @Override
      public int Tunjangan() {
            return (int)(0.1 * gapok); 
      }

      @Override
      public int Bonus() {
            return (int)(0.1 * gapok); 
      }

      @Override
      public int Pph() {
            return (int)(0.015 * gapok);
      }

      @Override
      public int TotalGaji() {
            return (int)(uang_prestasi+ Bonus() + Tunjangan()) - Pph();
      }

}