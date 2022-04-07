package no_4;

import java.io.PrintStream;
import java.util.Scanner;

public class no_4 {
      public static void main(String[] args) throws Exception {
            
            // Variabel untuk pemanggilan calss dan scanner print
            PegawaiTetapClass objPegawaiTetapClass = new PegawaiTetapClass();
            Scanner input = new Scanner(System.in);
            PrintStream prints = System.out;

            prints.println(
                  "\n|| ================================= ||\n" +
                  "|| ========= DATA PEKERJA ========== ||\n" + 
                  "|| ================================= ||\n" + 
                  "Masukan data pekerja anda secara lengkap dan benar!"
            );

            prints.print("\n| t | Pekerja tetap\n| k | Pekerja kontrak\n| h | Pekerja harian\n>> Status kerja: ");
            objPegawaiTetapClass.status_kerja = input.next().charAt(0);

            // Di cek status pegawinya apa lalu dihitung untuk uang tambahan lainnya dari kelas yang berbeda beda
            if (objPegawaiTetapClass.status_kerja.equals('t')) { // Jika {status_kerja} = tetap

                  prints.print("\n>> ID: ");
                  objPegawaiTetapClass.id = input.nextInt();

                  input.nextLine();
                  prints.print(">> Nama: ");
                  objPegawaiTetapClass.nama = input.nextLine();
                  
                  prints.print("\n| p | Pria\n| w | Wanita\n>> Jenis Kelamin: ");
                  objPegawaiTetapClass.jenis_kelamin = input.next().charAt(0);
                  
                  prints.print("\n| m | Menikah\n| b | Belum\n>> Status Menikah: ");
                  objPegawaiTetapClass.status_menikah = input.next().charAt(0);

                  // Di cek jika {status_menikah} = menikah, maka baru bisa melakukan penginputan jumlah anak
                  if (objPegawaiTetapClass.status_menikah.equals('m')) {
                        prints.print(">> Jumlah anak: ");
                        objPegawaiTetapClass.jml_anak =  input.nextInt();      
                  }
                  
                  prints.print("\n>> Gaji pokok: Rp ");
                  objPegawaiTetapClass.gapok = input.nextInt();
                  prints.println();     

                  prints.println(
                        "___________________________________\n" +
                        "Pengisian data tambahan untuk pegawai tetap."
                  );

                  prints.print(">> Lama lembur (jam): ");
                  objPegawaiTetapClass.lama_lembur = input.nextInt();
                  
                  if (objPegawaiTetapClass.lama_lembur > 0) {
                        prints.print(">> Biaya lembur (per jam): Rp ");
                        objPegawaiTetapClass.biaya_lembur_per_jam = input.nextInt();      
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
                        objPegawaiTetapClass.id,
                        objPegawaiTetapClass.nama,
                        objPegawaiTetapClass.gapok
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
                        objPegawaiTetapClass.gapok,
                        objPegawaiTetapClass.Tunjangan(),
                        objPegawaiTetapClass.Bonus(),
                        objPegawaiTetapClass.UangLembur(),
                        objPegawaiTetapClass.Pph(),
                        objPegawaiTetapClass.Thr(),
                        objPegawaiTetapClass.Tun_istri(),
                        objPegawaiTetapClass.Tun_anak(),
                        objPegawaiTetapClass.TotalGaji()
                  );
            }
            
            else if (objPegawaiTetapClass.status_kerja.equals('k')){ // Jika {status_kerja} = kontrak

                  PegawaiKontrakClass objPegawaiKontrakClass = new PegawaiKontrakClass();

                  prints.print("\n>> ID: ");
                  objPegawaiKontrakClass.id = input.nextInt();

                  input.nextLine();
                  prints.print(">> Nama: ");
                  objPegawaiKontrakClass.nama = input.nextLine();
                  
                  prints.print("\n>> Gaji pokok: Rp ");
                  objPegawaiKontrakClass.gapok = input.nextInt();
                  prints.println();     

                  prints.println(
                        "___________________________________\n" +
                        "Pengisian data tambahan untuk pegawai kontrak."
                  );
                  
                  prints.print(">> Uang prestasi: Rp ");
                  objPegawaiKontrakClass.uang_prestasi = input.nextInt();

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
                        objPegawaiKontrakClass.id,
                        objPegawaiKontrakClass.nama,
                        objPegawaiKontrakClass.gapok
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
                        objPegawaiKontrakClass.gapok,
                        objPegawaiKontrakClass.uang_prestasi,
                        objPegawaiKontrakClass.Tunjangan(),
                        objPegawaiKontrakClass.Bonus(),
                        objPegawaiKontrakClass.Pph(),
                        objPegawaiKontrakClass.TotalGaji()
                  );
            }

            else if (objPegawaiTetapClass.status_kerja.equals('h')){ // Jika {status_kerja} = harian
                        
                  PegawaiHarianClass objPegawaiHarianClass = new PegawaiHarianClass();

                  prints.print("\n>> ID: ");
                  objPegawaiHarianClass.id = input.nextInt();

                  input.nextLine();
                  prints.print(">> Nama: ");
                  objPegawaiHarianClass.nama = input.nextLine();

                  prints.println(
                        "___________________________________\n" +
                        "Pengisian data tambahan untuk pegawai harian."
                  );
                        
                  prints.print(">> Uang/hari: Rp ");
                  objPegawaiHarianClass.uang_per_hari = input.nextInt();

                  // PRINT OUT SEMUA DATA DAN GAJI
                  prints.println(
                        "\n|| ================================= ||\n" +
                        "|| ========= GAJI PEKERJA ========== ||\n" + 
                        "|| ================================= ||\n"
                   );

                   prints.printf(
                        "ID: %d\n" + 
                        "Nama: %s\n",
                        objPegawaiHarianClass.id,
                        objPegawaiHarianClass.nama
                  );

                  prints.println("\nPerhitungan total gaji: ");

                  prints.printf( 
                        "(+) Uang/hari: Rp %d\n" + 
                        "(-) PPH: Rp %d\n" +
                        "_____________________\n" + 
                        "Total Gaji: Rp %d\n",
                        objPegawaiHarianClass.uang_per_hari,
                        objPegawaiHarianClass.Pph(),
                        objPegawaiHarianClass.TotalGaji()
                  );
            }
            
      }
  }