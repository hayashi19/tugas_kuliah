package pertemuan_9;

import java.util.Scanner;

public class Pertemuan_9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        ClassBangun objClassBangun = new ClassBangun();
        ClassSegiEmpat objClassSegiEmpat = new ClassSegiEmpat();
        ClassSegiTiga objClassSegiTiga = new ClassSegiTiga();
        
        int m,n;
        System.out.print("Masukan nilai x: ");
        m = input.nextInt();
        System.out.print("Masukan nilai y: ");
        n = input.nextInt();
        objClassBangun.Hitung(m, n);
        
        objClassBangun = objClassSegiEmpat;
        objClassBangun.Hitung(m, n);
        
        objClassBangun = objClassSegiTiga;
        objClassBangun.Hitung(m, n);
    }
}
