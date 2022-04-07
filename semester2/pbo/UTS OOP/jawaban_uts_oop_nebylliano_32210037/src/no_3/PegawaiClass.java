package no_3;

public class PegawaiClass implements PegawaiTetap, PegawaiKontrak, PegawaiHarian{

      // buat varibel(atribut) untuk interface Pegawai 
      int id = 0;
      String nama = "";
      Character status_kerja = '\0';
      Character jenis_kelamin = '\0';
      Character status_menikah = '\0';
      int jml_anak = 0;
      int gapok = 0;

      int lama_lembur = 0;
      int biaya_lembur_per_jam = 0;
      
      int uang_prestasi = 0;

      int uang_per_hari = 0;

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
            return (int)(lama_lembur * biaya_lembur_per_jam);
      }

      @Override
      public int Pph() {
            if (status_kerja.equals('h')) {
                  return (int)(0.015 * uang_per_hari);
            }
            else {
                  return (int)(0.015 * gapok);
            }
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
      public int TotalGaji() {
            if (status_kerja.equals('t')) {
                  return (int)(Tunjangan() + Bonus() + UangLembur() + Thr() + Tun_istri() + Tun_anak() + gapok) - Pph();      
            }
            else if (status_kerja.equals('k')) {
                  return (int)(Tunjangan() + Bonus() + uang_prestasi + gapok) - Pph();
            }
            else {
                  return (int)(uang_per_hari - Pph());
            }
      }

}