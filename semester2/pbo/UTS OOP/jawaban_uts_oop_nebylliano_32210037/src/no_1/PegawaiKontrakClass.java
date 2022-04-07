package no_1;

public class PegawaiKontrakClass extends PegawaiClass{

      private int uang_prestasi;
      public int getUang_prestasi() {
            return uang_prestasi;
      }
      public void setUang_prestasi(int uang_prestasi) {
            this.uang_prestasi = uang_prestasi;
      }

      int Tunjangan() {
            return (int)(0.1 * getGapok()); 
      }

      int Bonus() {
            return (int)(0.1 * getGapok()); 
      }

      int Pph() {
            return (int)(0.015 * getGapok());
      }

      int TotalGaji() {
            return (int)(getUang_prestasi() + getGapok() + Bonus() + Tunjangan()) - Pph();
      }

}
