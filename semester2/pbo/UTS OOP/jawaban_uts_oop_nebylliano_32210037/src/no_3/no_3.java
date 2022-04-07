package no_3;

import java.io.PrintStream;
import java.util.Scanner;

public class no_3 {
      
      public static void main(String[] args) throws Exception {
            
            // Variabel untuk pemanggilan calss dan scanner print
            PegawaiClass objPegawaiClass = new PegawaiClass();
            Scanner input = new Scanner(System.in);
            PrintStream prints = System.out;

            //////////////////////////////////////////////////////////////////////////////////////////////////////// MEMASUKAN DATA PEGAWAI
            prints.println(
                  "\n|| ================================= ||\n" +
                  "|| ========= DATA PEKERJA ========== ||\n" + 
                  "|| ================================= ||\n" + 
                  "Masukan data pekerja anda secara lengkap dan benar!"
            );

            prints.print("\n>> ID: ");
            objPegawaiClass.id = input.nextInt();

            input.nextLine();
            prints.print(">> Nama: ");
            objPegawaiClass.nama = input.nextLine();
            
            prints.print("\n| t | Pekerja tetap\n| k | Pekerja kontrak\n| h | Pekerja harian\n>> Status kerja: ");
            objPegawaiClass.status_kerja = input.next().charAt(0);

            // Di cek apakah pekerja merupakan perkerja tetap atau tidak, jika iya maka baru akan memasukan data berikut ini
            if (objPegawaiClass.status_kerja.equals('t')) {
                  prints.print("\n| p | Pria\n| w | Wanita\n>> Jenis Kelamin: ");
                  objPegawaiClass.jenis_kelamin = input.next().charAt(0);
                  
                  prints.print("\n| m | Menikah\n| b | Belum\n>> Status Menikah: ");
                  objPegawaiClass.status_menikah = input.next().charAt(0);

                  // Di cek jika {status_menikah} = menikah, maka baru bisa melakukan penginputan jumlah anak
                  if (objPegawaiClass.status_menikah.equals('m')) {
                        prints.print(">> Jumlah anak: ");
                        objPegawaiClass.jml_anak = input.nextInt();      
                  }
            }

            if (!objPegawaiClass.status_kerja.equals('h')) {
                  prints.print("\n>> Gaji pokok: Rp ");
                  objPegawaiClass.gapok = input.nextInt();
                  prints.println();
            }     
            //////////////////////////////////////////////////////////////////////////////////////////////////////// MEMASUKAN DATA PEGAWAI


            // Di cek status pegawinya apa lalu dihitung untuk uang tambahan lainnya dari kelas yang berbeda beda
            if (objPegawaiClass.status_kerja.equals('t')) { // Jika {status_pegawai} = tetap
                  prints.println(
                        "___________________________________\n" +
                        "Pengisian data tambahan untuk pegawai tetap."
                  );

                  prints.print(">> Lama lembur (jam): ");
                  objPegawaiClass.lama_lembur = input.nextInt();
                  
                  if (objPegawaiClass.lama_lembur > 0) {
                        prints.print(">> Biaya lembur (per jam): Rp ");
                        objPegawaiClass.biaya_lembur_per_jam= input.nextInt();      
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
                        objPegawaiClass.id,
                        objPegawaiClass.nama,
                        objPegawaiClass.gapok
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
                        objPegawaiClass.gapok,
                        objPegawaiClass.Tunjangan(),
                        objPegawaiClass.Bonus(),
                        objPegawaiClass.UangLembur(),
                        objPegawaiClass.Pph(),
                        objPegawaiClass.Thr(),
                        objPegawaiClass.Tun_istri(),
                        objPegawaiClass.Tun_anak(),
                        objPegawaiClass.TotalGaji()
                  );
            }
            
            else if (objPegawaiClass.status_kerja.equals('k')){ // Jika {status_pegawai} = kontrak
                  prints.println(
                        "___________________________________\n" +
                        "Pengisian data tambahan untuk pegawai kontrak."
                  );
                  
                  prints.print(">> Uang prestasi: Rp ");
                  objPegawaiClass.uang_prestasi = input.nextInt();

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
                        objPegawaiClass.id,
                        objPegawaiClass.nama,
                        objPegawaiClass.gapok
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
                        objPegawaiClass.gapok,
                        objPegawaiClass.uang_prestasi,
                        objPegawaiClass.Tunjangan(),
                        objPegawaiClass.Bonus(),
                        objPegawaiClass.Pph(),
                        objPegawaiClass.TotalGaji()
                  );
            }

            else if (objPegawaiClass.status_kerja.equals('h')){ // Jika {status_pegawai} = harian
                  prints.println(
                        "___________________________________\n" +
                        "Pengisian data tambahan untuk pegawai harian."
                  );
                        
                  prints.print(">> Uang/hari: Rp ");
                  objPegawaiClass.uang_per_hari = input.nextInt();

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
                        objPegawaiClass.id,
                        objPegawaiClass.nama,
                        objPegawaiClass.gapok
                  );

                  prints.println("\nPerhitungan total gaji: ");

                  prints.printf(
                        "(+) Gaji Pokok: Rp %d\n" + 
                        "(+) Uang/hari: Rp %d\n" + 
                        "(-) PPH: Rp %d\n" +
                        "_____________________\n" + 
                        "Total Gaji: Rp %d\n",
                        objPegawaiClass.gapok,
                        objPegawaiClass.uang_per_hari,
                        objPegawaiClass.Pph(),
                        objPegawaiClass.TotalGaji()
                  );
            }
            
      }

}