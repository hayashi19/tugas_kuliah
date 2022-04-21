package pertemuan_9;

public class ClassHero extends ClassCharacter {
    void HeroAttack(){
        HeroTurn();
        MonsterTurn();
        if(heroDamage > monsterDamage){
            System.out.print("Attack Succeed");
        }
        else {
            System.out.print("Attack failed");
        }
    }
}
