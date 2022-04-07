package no_2;

public class PegawaiKontrakClass {

      PegawaiTetapClass objPegawaiTetapClass = new PegawaiTetapClass();

      static int uang_prestasi;

      static int Tunjangan() {
            return (int)(0.1 * PegawaiClass.gapok); 
      }

      static int Bonus() {
            return (int)(0.1 * PegawaiClass.gapok); 
      }

      static int Pph() {
            return (int)(0.015 * PegawaiClass.gapok);
      }

      static int TotalGaji() {
            return (int)(uang_prestasi + PegawaiClass.gapok + Bonus() + Tunjangan()) - Pph();
      }

}
