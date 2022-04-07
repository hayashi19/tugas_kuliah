package no_1;

public class PegawaiTetapClass extends PegawaiClass {

      // Buat atribut private
      private int lama_lembur;
      public int getLama_lembur() {
            return lama_lembur;
      }
      public void setLama_lembur(int lama_lembur) {
            this.lama_lembur = lama_lembur;
      }

      private int biaya_lembur_per_jam;
      public int getBiaya_lembur_per_jam() {
            return biaya_lembur_per_jam;
      }
      public void setBiaya_lembur_per_jam(int biaya_lembur_per_jam) {
            this.biaya_lembur_per_jam = biaya_lembur_per_jam;
      }
      
      // Buat method perhitungan gaji kariawan  
      int Tunjangan() {
            return (int)(0.1 * getGapok()); 
      }
      int Bonus() {
            return (int)(0.1 * getGapok()); 
      }
      int UangLembur() {
            return getLama_lembur() * getBiaya_lembur_per_jam(); 
      }
      int Pph() {
            return (int)(0.015 * getGapok());
      }
      int Thr() {
            return (int)(1 * getGapok());
      }
      int Tun_istri() {
            if (getJenis_kelamin().equals('p') && getStatus_menikah().equals('m')) {
                  return (int)(0.3 * getGapok());
            }
            else {
                  return 0;
            }
      }
      int Tun_anak() {
            if (getStatus_menikah().equals('m') && getJml_anak() > 3) {
                  return (int)(3 * 0.2 * getGapok());
            }
            else if (getStatus_menikah().equals('m') && getJml_anak() <= 3) {
                  return (int)(getJml_anak() * 0.2 * getGapok());
            }
            else { 
                  return 0;
            }
      }
      int TotalGaji(){
            return (int)(Tunjangan() + Bonus() + UangLembur() + Thr() + Tun_istri() + Tun_anak() + getGapok()) - Pph();
      }
}
