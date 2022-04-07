package no_1;

import java.io.PrintStream;
import java.util.Scanner;

public class no_1 {
      public static void main(String[] args) throws Exception {
            
            // Variabel untuk pemanggilan calss dan scanner print
            PegawaiClass objPegawaiClass = new PegawaiClass();
            Scanner input = new Scanner(System.in);
            PrintStream prints = System.out;

            prints.println(
                  "\n|| ================================= ||\n" +
                  "|| ========= DATA PEKERJA ========== ||\n" + 
                  "|| ================================= ||\n" + 
                  "Masukan data pekerja anda secara lengkap dan benar!"
            );

            // Memasukan input [status_kerja] yang kemudian akan di check di fungsi brktnya
            prints.print("\n| t | Pekerja tetap\n| k | Pekerja kontrak\n| h | Pekerja harian\n>> Status kerja: ");
            objPegawaiClass.setStatus_kerja(input.next().charAt(0));        

            // Di check apakah [status_kerja] = 'k' || [status_kerja] = 'k' || [status_kerja] = 'h'
            if (objPegawaiClass.getStatus_kerja().equals('t')) { // jika [status_kerja] = perkerja tetap
                  
                  PegawaiTetapClass objPegawaiTetapClass = new PegawaiTetapClass();

                  // Pekerja akan memasukan data pekerja tetap
                  prints.print("\n>> ID: ");
                  objPegawaiTetapClass.setId(input.nextInt());

                  input.nextLine();
                  prints.print(">> Nama: ");
                  objPegawaiTetapClass.setNama(input.nextLine());    

                  prints.print("\n| p | Pria\n| w | Wanita\n>> Jenis Kelamin: ");
                  objPegawaiTetapClass.setJenis_kelamin(input.next().charAt(0));
                  
                  prints.print("\n| m | Menikah\n| b | Belum\n>> Status Menikah: ");
                  objPegawaiTetapClass.setStatus_menikah(input.next().charAt(0));

                  // Di cek jika {status_menikah} = menikah, maka baru bisa melakukan penginputan jumlah anak
                  if (objPegawaiTetapClass.getStatus_menikah().equals('m')) {
                        prints.print(">> Jumlah anak: ");
                        objPegawaiTetapClass.setJml_anak(input.nextInt());      
                  }
            
                  prints.print("\n>> Gaji pokok: Rp ");
                  objPegawaiTetapClass.setGapok(input.nextInt()); 

                  prints.println(
                        "___________________________________\n" +
                        "Pengisian data tambahan untuk pegawai tetap."
                  );

                  prints.print(">> Lama lembur (jam): ");
                  objPegawaiTetapClass.setLama_lembur(input.nextInt());
                  
                  if (objPegawaiTetapClass.getLama_lembur() > 0) {
                        prints.print(">> Biaya lembur (per jam): Rp ");
                        objPegawaiTetapClass.setBiaya_lembur_per_jam(input.nextInt());      
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
                        objPegawaiClass.getId(),
                        objPegawaiClass.getNama(),
                        objPegawaiClass.getGapok()
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
                        objPegawaiTetapClass.getGapok(),
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

            else if (objPegawaiClass.getStatus_kerja().equals('k')) {

                  PegawaiKontrakClass objPegawaiKontrakClass = new PegawaiKontrakClass();

                  // Pekerja akan memasukan data pekerja kontrak
                  prints.print("\n>> ID: ");
                  objPegawaiKontrakClass.setId(input.nextInt());

                  input.nextLine();
                  prints.print(">> Nama: ");
                  objPegawaiKontrakClass.setNama(input.nextLine());    

                  prints.print("\n>> Gaji pokok: Rp ");
                  objPegawaiKontrakClass.setGapok(input.nextInt()); 

                  prints.println(
                        "___________________________________\n" +
                        "Pengisian data tambahan untuk pegawai kontrak."
                  );
                  
                  prints.print(">> Uang prestasi: Rp ");
                  objPegawaiKontrakClass.setUang_prestasi(input.nextInt());

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
                        objPegawaiClass.getId(),
                        objPegawaiClass.getNama(),
                        objPegawaiClass.getGapok()
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
                        objPegawaiKontrakClass.getGapok(),
                        objPegawaiKontrakClass.getUang_prestasi(),
                        objPegawaiKontrakClass.Tunjangan(),
                        objPegawaiKontrakClass.Bonus(),
                        objPegawaiKontrakClass.Pph(),
                        objPegawaiKontrakClass.TotalGaji()
                  );
                  
            }

            else if (objPegawaiClass.getStatus_kerja().equals('h')) {

                  PegawaiHarianClass objPegawaiHarianClass = new PegawaiHarianClass();

                  // Pekerja akan memasukan data pekerja kontrak
                  prints.print("\n>> ID: ");
                  objPegawaiHarianClass.setId(input.nextInt());

                  input.nextLine();
                  prints.print(">> Nama: ");
                  objPegawaiHarianClass.setNama(input.nextLine());    

                  prints.println(
                        "___________________________________\n" +
                        "Pengisian data tambahan untuk pegawai harian."
                  );
                        
                  prints.print(">> Uang/hari: Rp ");
                  objPegawaiHarianClass.setUang_per_hari(input.nextInt());

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
                        objPegawaiClass.getId(),
                        objPegawaiClass.getNama(),
                        objPegawaiClass.getGapok()
                  );

                  prints.println("\nPerhitungan total gaji: ");

                  prints.printf( 
                        "(+) Uang/hari: Rp %d\n" + 
                        "(-) PPH: Rp %d\n" +
                        "_____________________\n" + 
                        "Total Gaji: Rp %d\n",
                        objPegawaiHarianClass.getUang_per_hari(),
                        objPegawaiHarianClass.Pph(),
                        objPegawaiHarianClass.TotalGaji(objPegawaiClass.getGapok())
                  );
                  
            }

            else {
                  prints.println("Tolong masukan status pegawai anda sesua dengan pilihan!");
            }
            
      }
  }