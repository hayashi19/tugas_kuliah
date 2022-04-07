package no_4;

class PegawaiTetapClass extends PegawaiClass {
      // Buat atribut private
      int lama_lembur;
      int biaya_lembur_per_jam;
      
      // Buat method perhitungan gaji kariawan  
      public int Tunjangan() {
            return (int)(0.1 * gapok); 
      }

      public int Bonus() {
            return (int)(0.1 * gapok); 
      }

      public int UangLembur() {
            return (int)(lama_lembur * biaya_lembur_per_jam); 
      }

      public int Pph() {
            return (int)(0.015 * gapok);
      }

      public int Thr() {
            return (int)(1 * gapok);
      }

      public int Tun_istri() {
            if (jenis_kelamin.equals('p') && status_menikah.equals('m')) {
                  return (int)(0.3 * gapok);
            }
            else {
                  return 0;
            }
      }

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

      public int TotalGaji(){
            return (int)(Tunjangan() + Bonus() + UangLembur() + Thr() + Tun_istri() + Tun_anak() + gapok) - Pph();
      }
}