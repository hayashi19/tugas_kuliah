package no_5;

import javax.swing.JOptionPane;

public class no_5 {
      public static void main(String[] args) throws Exception {

            //////////////////////////////////////////////////////////////////////////////////////////////////////// MEMASUKAN DATA PEGAWAI
            JOptionPane.showMessageDialog(null,
                  "DATA PEGAWAI\n" +
                  "Selamat datang.\n" +
                  "Masukan data pekerja anda secara lengkap dan benar."
            );

            PegawaiClass.id = Integer.parseInt(JOptionPane.showInputDialog("ID", "0"));
            PegawaiClass.namal = JOptionPane.showInputDialog("NAMA", "");
            PegawaiClass.status_kerja = JOptionPane.showInputDialog("| t | Pekerja tetap\n| k | Pekerja kontrak\n| h | Pekerja harian\n\nSTATUS KERJA", "").charAt(0);

            // Di cek apakah pekerja merupakan perkerja tetap atau tidak, jika iya maka baru akan memasukan data berikut ini
            if (PegawaiClass.status_kerja.equals('t')) {
                  PegawaiClass.jenis_kelamin = JOptionPane.showInputDialog("| p | Pria\n| w | Wanita\n\nJENIS KELAMIN", "").charAt(0);
                  PegawaiClass.status_menikah = JOptionPane.showInputDialog("| m | Menikah\n| b | Belum\n\nSTATUS MENIKAH", "").charAt(0);

                  // Di cek jika {status_menikah} = menikah, maka baru bisa melakukan penginputan jumlah anak
                  if (PegawaiClass.status_menikah.equals('m')) {
                        PegawaiClass.jml_anak = Integer.parseInt(JOptionPane.showInputDialog("JUMLAH ANAK", "0"));      
                  }
            }

            if (PegawaiClass.status_kerja.equals('t') || PegawaiClass.status_kerja.equals('k')) {
                  PegawaiClass.gapok = Integer.parseInt(JOptionPane.showInputDialog("GAJI POKOK", "0"));
            }     
            //////////////////////////////////////////////////////////////////////////////////////////////////////// MEMASUKAN DATA PEGAWAI

            // Di cek status pegawinya apa lalu dihitung untuk uang tambahan lainnya dari kelas yang berbeda beda
            if (PegawaiClass.status_kerja.equals('t')) { // Jika {status_kerja} = tetap
                  JOptionPane.showMessageDialog(null, "Pengisian data tambahan untuk pegawai tetap.");

                  PegawaiTetapClass.lama_lembur = Integer.parseInt(JOptionPane.showInputDialog("LAMA LEMBUR (jam)", "0"));
                  
                  if (PegawaiTetapClass.lama_lembur > 0) {
                        PegawaiTetapClass.biaya_lembur_per_jam = Integer.parseInt(JOptionPane.showInputDialog("BIAYA KEMBUR (per jam)", "0"));      
                  }

                  // PRINT OUT SEMUA DATA DAN GAJI
                  String message = 
                        "GAJI PEGAWAI\n" + 
                        "ID: " + PegawaiClass.id + "\n" + 
                        "Nama: " + PegawaiClass.namal + "\n" +  
                        "Gaji Pokok: Rp " + PegawaiClass.gapok + "\n" +
                        "\nPerhitungan total gaji:\n" + 
                        "(+) Gaji Pokok: Rp " + PegawaiClass.gapok + "\n" +
                        "(+) Tunjangan: Rp " + PegawaiTetapClass.Tunjangan() + "\n" + 
                        "(+) Bonus: Rp " + PegawaiTetapClass.Bonus() + "\n" +
                        "(+) Uang Lembur: Rp " + PegawaiTetapClass.UangLembur() + "\n" +
                        "(-) PPH: Rp " +  PegawaiTetapClass.Pph() + "\n" + 
                        "(+) THR: Rp " + PegawaiTetapClass.Thr() + "\n" + 
                        "(+) Tunjangan Istri: Rp " + PegawaiTetapClass.Tun_istri() + "\n" +
                        "(+) Tunjnagan Anak: Rp " + PegawaiTetapClass.Tun_anak() + "\n" + 
                        "_____________________\n" + 
                        "Total Gaji: Rp " + PegawaiTetapClass.TotalGaji();

                  JOptionPane.showMessageDialog(null, message);
            }
            
            else if (PegawaiClass.status_kerja.equals('k')){ // Jika {status_kerja} = kontrak
                  JOptionPane.showMessageDialog(null, "Pengisian data tambahan untuk pegawai kontrak.");
                  
                  PegawaiKontrakClass.uang_prestasi = Integer.parseInt(JOptionPane.showInputDialog("UANG PRESTASI", "0"));

                  // PRINT OUT SEMUA DATA DAN GAJI
                  String message = 
                        "GAJI PEGAWAI\n" + 
                        "ID: " + PegawaiClass.id + "\n" + 
                        "Nama: " + PegawaiClass.namal + "\n" +  
                        "Gaji Pokok: Rp " + PegawaiClass.gapok + "\n" +
                        "\nPerhitungan total gaji:\n" + 
                        "(+) Gaji Pokok: Rp " + PegawaiClass.gapok + "\n" +
                        "(+) Uang Prestasi: RP " +  PegawaiKontrakClass.uang_prestasi + "\n" +
                        "(+) Tunjangan: Rp " + PegawaiKontrakClass.Tunjangan() + "\n" + 
                        "(+) Bonus: Rp " + PegawaiKontrakClass.Bonus() + "\n" +
                        "(-) PPH: Rp " +  PegawaiKontrakClass.Pph() + "\n" +  
                        "_____________________\n" + 
                        "Total Gaji: Rp " + PegawaiKontrakClass.TotalGaji();

                  JOptionPane.showMessageDialog(null, message);
            }

            else if (PegawaiClass.status_kerja.equals('h')){ // Jika {status_kerja} = harian
                  JOptionPane.showMessageDialog(null, "Pengisian data tambahan untuk pegawai harian.");

                  PegawaiHarianClass.uang_per_hari = Integer.parseInt(JOptionPane.showInputDialog("UANG/HARI", "0"));

                  // PRINT OUT SEMUA DATA DAN GAJI
                  String message = 
                        "GAJI PEGAWAI\n" + 
                        "ID: " + PegawaiClass.id + "\n" + 
                        "Nama: " + PegawaiClass.namal + "\n" +  
                        "\nPerhitungan total gaji:\n" + 
                        "(+) Uang/hari: Rp " + PegawaiHarianClass.uang_per_hari + "\n" +
                        "(-) PPH: Rp " +  PegawaiHarianClass.Pph() + "\n" +  
                        "_____________________\n" + 
                        "Total Gaji: Rp " + PegawaiHarianClass.TotalGaji();

                  JOptionPane.showMessageDialog(null, message);
            }
            
      }
  }