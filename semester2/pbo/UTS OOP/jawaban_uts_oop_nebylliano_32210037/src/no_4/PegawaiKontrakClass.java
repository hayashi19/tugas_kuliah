package no_4;

class PegawaiKontrakClass extends PegawaiClass {

      int uang_prestasi;

      public int Tunjangan() {
            return (int)(0.1 * gapok); 
      }

      public int Bonus() {
            return (int)(0.1 * gapok); 
      }

      public int Pph() {
            return (int)(0.015 * gapok);
      }

      public int TotalGaji() {
            return (int)(uang_prestasi + gapok + Bonus() + Tunjangan()) - Pph();
      }

}