package no_5;

public class PegawaiTetapClass {

      static int lama_lembur;
      static int biaya_lembur_per_jam;

      static int Tunjangan() {
            return (int)(0.1 * PegawaiClass.gapok);
      }

      static int Bonus() {
            return (int )(0.1 * PegawaiClass.gapok);
      }

      static int UangLembur() {
            return (int )(lama_lembur * biaya_lembur_per_jam);
      }

      static int Pph() {
            return (int)(0.015 * PegawaiClass.gapok);
      }

      static int Thr() {
            return (int)(1 * PegawaiClass.gapok);
      }

      static int Tun_istri() {
            if (PegawaiClass.jenis_kelamin.equals('p') && PegawaiClass.status_menikah.equals('m')) {
                  return (int)(0.3 * PegawaiClass.gapok);
            }
            else {
                  return 0;
            }
      }

      static int Tun_anak() {
            if (PegawaiClass.status_menikah.equals('m') && PegawaiClass.jml_anak > 3) {
                  return (int)(3 * 0.2 * PegawaiClass.gapok);
            }
            else if (PegawaiClass.status_menikah.equals('m') && PegawaiClass.jml_anak <= 3) {
                  return (int)(PegawaiClass.jml_anak * 0.2 * PegawaiClass.gapok);
            }
            else { 
                  return 0;
            }
      }

      static int TotalGaji(){
            return (int)(Tunjangan() + Bonus() + UangLembur() + Thr() + Tun_istri() + Tun_anak() + PegawaiClass.gapok) - Pph();
      }

}