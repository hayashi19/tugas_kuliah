package pertemuan_9;

import java.util.Scanner;

public class ClassCharacter {
    static int level;
    static String role;
    static String element;
    
    static int heroDamage;
    static int monsterDamage;
    
    
    Scanner input = new Scanner(System.in);
    
    void HeroTurn() {
        System.out.print("Pilih angka dari 1 - 10: ");
        heroDamage = input.nextInt();
    }
    
    void MonsterTurn() {
        monsterDamage = 2;
    }
}
