package 프로젝트대비;
import java.util.Scanner;
public class project {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Player pl = new Player(20, 5, 2);
        Monster mon = new Monster();

        System.out.println("이름을 입력하세요");
        pl.name = sc.next();

        pl.hp=20; pl.atk=5; pl.def=2;
        mon.hp=10; mon.atk=3; mon.def=0;
        mon.realdmg=mon.atk-pl.def;
        mon.lefthp=mon.hp-pl.realdmg;
        pl.realdmg=pl.atk-mon.def;
        pl.lefthp=pl.hp-mon.realdmg;

        while (mon.hp <= 0 || pl.hp <= 0) {
            if (mon.lefthp < mon.hp) {
                pl.attack(5, 0);
                mon.hp = mon.lefthp;
                mon.lefthp=mon.hp-pl.realdmg;
            }
            if (pl.lefthp < pl.hp){

            pl.defend(20, 5, 2);
                pl.hp = pl.lefthp;
            }

        }
    }


    static class Player {
        Monster mon = new Monster();
        String name;
        int atk ;
        int gage = 0;
        int hp;
        int def;
        int realdmg = atk - mon.def;
        int lefthp = mon.hp - realdmg;


        void attack(int atk, int gage) {
            this.atk = atk;
            this.gage = gage;
            int realdmg = atk - mon.def;
            int lefthp = mon.hp - realdmg;
            System.out.printf("%s의 %d 공격으로 %s를 공격\n", name, atk, mon.name);
            System.out.printf("%s의 체력이 %d 남았습니다\n", mon.name, lefthp);

        }

        void defend(int hp, int atk, int def) {
            int realdmg = atk - def;
            int lefthp = hp - realdmg;
            System.out.printf("%s님이 %d에서 %d의 공격을 받아 %d 체력이 남았습니다.\n", name, hp, realdmg, lefthp);


        }

        public Player(int hp, int atk, int def) {
            this.hp = hp;
            this.atk = atk;
            this.def = def;
        }

        public int gethp() {
            return hp;
        }
    }

    static class Monster {

        Player pl = new Player(20, 5, 2);
        String name = "야생고양이";
        int atk = 3;
        int def = 0;
        int hp = 10;

        int realdmg = atk - pl.def;
        int lefthp = pl.atk - def;

    }
}

