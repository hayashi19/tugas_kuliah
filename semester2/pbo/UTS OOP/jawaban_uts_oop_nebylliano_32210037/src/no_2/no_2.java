package no_2;

import java.io.PrintStream;
import java.util.Scanner;

public class no_2 {
      public static void main(String[] args) throws Exception {
            
            // Variabel untuk pemanggilan calss dan scanner print
            Scanner input = new Scanner(System.in);
            PrintStream prints = System.out;

            prints.println(
                  "\n|| ================================= ||\n" +
                  "|| ========= DATA PEKERJA ========== ||\n" + 
                  "|| ================================= ||\n" + 
                  "Masukan data pekerja anda secara lengkap dan benar!"
            );

            prints.print("\n| t | Pekerja tetap\n| k | Pekerja kontrak\n| h | Pekerja harian\n>> Status kerja: ");
            PegawaiClass.status_kerja = input.next().charAt(0);

            // Di cek status pegawinya apa lalu dihitung untuk uang tambahan lainnya dari kelas yang berbeda beda
            if (PegawaiClass.status_kerja.equals('t')) { // Jika {status_kerja} = tetap

                  prints.print("\n>> ID: ");
                  PegawaiClass.id = input.nextInt();

                  input.nextLine();
                  prints.print(">> Nama: ");
                  PegawaiClass.namal = input.nextLine();
                  
                  // Di cek apakah pekerja merupakan perkerja tetap atau tidak, jika iya maka baru akan memasukan data berikut ini
                  
                  prints.print("\n| p | Pria\n| w | Wanita\n>> Jenis Kelamin: ");
                  PegawaiClass.jenis_kelamin = input.next().charAt(0);
                  
                  prints.print("\n| m | Menikah\n| b | Belum\n>> Status Menikah: ");
                  PegawaiClass.status_menikah = input.next().charAt(0);

                  // Di cek jika {status_menikah} = menikah, maka baru bisa melakukan penginputan jumlah anak
                  if (PegawaiClass.status_menikah.equals('m')) {
                        prints.print(">> Jumlah anak: ");
                        PegawaiClass.jml_anak = input.nextInt();      
                  }
            

                  prints.print("\n>> Gaji pokok: Rp ");
                  PegawaiClass.gapok = input.nextInt();
                  prints.println();

                  prints.println(
                        "___________________________________\n" +
                        "Pengisian data tambahan untuk pegawai tetap."
                  );

                  prints.print(">> Lama lembur (jam): ");
                  PegawaiTetapClass.lama_lembur = input.nextInt();
                  
                  if (PegawaiTetapClass.lama_lembur > 0) {
                        prints.print(">> Biaya lembur (per jam): Rp ");
                        PegawaiTetapClass.biaya_lembur_per_jam = input.nextInt();      
                  }

                  // PRINT OUT SEMUA DATA DAN GAJI
                  prints.println(
                        "\n|| ================================= ||\n" +
                        "|| ========= GAJI PEKERJA ========== ||\n" + 
                        "|| ================================= ||\n"
                   );

                   prints.printf(
                        "ID: %d\n" + 
                        "Nama: %s\n" + 
                        "Gaji Pokok: Rp %d\n", 
                        PegawaiClass.id,
                        PegawaiClass.namal,
                        PegawaiClass.gapok
                  );

                  prints.println("\nPerhitungan total gaji: ");

                  prints.printf(
                        "(+) Gaji Pokok: Rp %d\n" + 
                        "(+) Tunjangan: Rp %d\n" + 
                        "(+) Bonus: Rp %d\n" + 
                        "(+) Uang Lembur: Rp %d\n" + 
                        "(-) PPH: Rp %d\n" + 
                        "(+) THR: Rp %d\n" + 
                        "(+) Tunjangan Istri: Rp %d\n" + 
                        "(+) Tunjnagan Anak: Rp %d\n" + 
                        "_____________________\n" + 
                        "Total Gaji: Rp %d\n",
                        PegawaiClass.gapok,
                        PegawaiTetapClass.Tunjangan(),
                        PegawaiTetapClass.Bonus(),
                        PegawaiTetapClass.UangLembur(),
                        PegawaiTetapClass.Pph(),
                        PegawaiTetapClass.Thr(),
                        PegawaiTetapClass.Tun_istri(),
                        PegawaiTetapClass.Tun_anak(),
                        PegawaiTetapClass.TotalGaji()
                  );
            }
            
            else if (PegawaiClass.status_kerja.equals('k')){ // Jika {status_kerja} = kontrak

                  prints.print("\n>> ID: ");
                  PegawaiClass.id = input.nextInt();

                  input.nextLine();
                  prints.print(">> Nama: ");
                  PegawaiClass.namal = input.nextLine();

                  prints.print("\n>> Gaji pokok: Rp ");
                  PegawaiClass.gapok = input.nextInt();
                  prints.println();

                  prints.println(
                        "___________________________________\n" +
                        "Pengisian data tambahan untuk pegawai kontrak."
                  );
                  
                  prints.print(">> Uang prestasi: Rp ");
                  PegawaiKontrakClass.uang_prestasi = input.nextInt();

                  // PRINT OUT SEMUA DATA DAN GAJI
                  prints.println(
                        "\n|| ================================= ||\n" +
                        "|| ========= GAJI PEKERJA ========== ||\n" + 
                        "|| ================================= ||\n"
                   );

                   prints.printf(
                        "ID: %d\n" + 
                        "Nama: %s\n" + 
                        "Gaji Pokok: Rp %d\n", 
                        PegawaiClass.id,
                        PegawaiClass.namal,
                        PegawaiClass.gapok
                  );

                  prints.println("\nPerhitungan total gaji: ");

                  prints.printf(
                        "(+) Gaji Pokok: Rp %d\n" + 
                        "(+) Uang Prestasi: RP %d\n" + 
                        "(+) Tunjangan: Rp %d\n" + 
                        "(+) Bonus: Rp %d\n" + 
                        "(-) PPH: Rp %d\n" + 
                        "_____________________\n" + 
                        "Total Gaji: Rp %d\n",
                        PegawaiClass.gapok,
                        PegawaiKontrakClass.uang_prestasi,
                        PegawaiKontrakClass.Tunjangan(),
                        PegawaiKontrakClass.Bonus(),
                        PegawaiKontrakClass.Pph(),
                        PegawaiKontrakClass.TotalGaji()
                  );
            }

            else if (PegawaiClass.status_kerja.equals('h')){ // Jika {status_kerja} = harian

                  prints.print("\n>> ID: ");
                  PegawaiClass.id = input.nextInt();

                  input.nextLine();
                  prints.print(">> Nama: ");
                  PegawaiClass.namal = input.nextLine();

                  prints.println(
                        "___________________________________\n" +
                        "Pengisian data tambahan untuk pegawai harian."
                  );
                        
                  prints.print(">> Uang/hari: Rp ");
                  PegawaiHarianClass.uang_per_hari = input.nextInt();

                  // PRINT OUT SEMUA DATA DAN GAJI
                  prints.println(
                        "\n|| ================================= ||\n" +
                        "|| ========= GAJI PEKERJA ========== ||\n" + 
                        "|| ================================= ||\n"
                   );

                   prints.printf(
                        "ID: %d\n" + 
                        "Nama: %s\n",
                        PegawaiClass.id,
                        PegawaiClass.namal
                  );

                  prints.println("\nPerhitungan total gaji: ");

                  prints.printf(
                        "(+) Uang/hari: Rp %d\n" + 
                        "(-) PPH: Rp %d\n" +
                        "_____________________\n" + 
                        "Total Gaji: Rp %d\n",
                        PegawaiHarianClass.uang_per_hari,
                        PegawaiHarianClass.Pph(),
                        PegawaiHarianClass.TotalGaji()
                  );
            }
            
      }
  }