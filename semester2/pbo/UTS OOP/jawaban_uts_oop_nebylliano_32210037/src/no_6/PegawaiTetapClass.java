package no_6;

public class PegawaiTetapClass extends PegawaiClass{

      int lama_lembur;
      int biaya_lembur_per_jam;

      // Buat method perhitungan gaji kariawan  
      @Override
      public int Tunjangan() {
            return (int)(0.1 * gapok); 
      }

      @Override
      public int Bonus() {
            return (int)(0.1 * gapok); 
      }

      @Override
      public int UangLembur() {
            return lama_lembur * biaya_lembur_per_jam; 
      }

      @Override
      public int Pph() {
            return (int)(0.015 * gapok);
      }

      @Override
      public int Thr() {
            return (int)(1 * gapok);
      }

      @Override
      public int Tun_istri() {
            if (jenis_kelamin.equals('p') && status_menikah.equals('m')) {
                  return (int)(0.3 * gapok);
            }
            else {
                  return 0;
            }
      }

      @Override
      public int Tun_anak() {
            if (status_menikah.equals('m') && jml_anak > 3) {
                  return (int)(3 * 0.2 * gapok);
            }
            else if (status_menikah.equals('m') && jml_anak <= 3) {
                  return (int)(jml_anak * 0.2 * gapok);
            }
            else { 
                  return 0;
            }
      }

      @Override
      public int TotalGaji(){
            return (int)(Tunjangan() + Bonus() + UangLembur() + Thr() + Tun_istri() + Tun_anak() + gapok) - Pph();
      }

}