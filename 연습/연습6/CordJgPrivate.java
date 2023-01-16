package 연습.연습6;
import java.util.random.*;

public class CordJgPrivate {
    public static void main(String[] args) {

        Neo neo = new Neo(10,5,50);

        System.out.println("내 캐릭터의 데미지는" +neo.getAttackDmg()+" 방어력은"+ neo.getDffend()+" HP는" +neo.getHp()+"입니다");

        neo.itemSword();

        neo.attackSelf();

    }
}


class Neo{
    private int attackDmg;
    private int dffend;
    private int hp;
    private int mp;
    private void run(){
        System.out.println("공격하였습니다");
    }

    void attackSelf(){

        while(this.hp>0){
            this.hp = hp-(attackDmg-dffend);
            System.out.printf("내 체력이 %s 만큼 남았습니다\n",this.hp);
        }

    }

    void itemSword(){
        this.attackDmg= attackDmg+(int)(Math.random()*10+1);
    }


    Neo(int attackDmg, int dffend, int hp){
        this.attackDmg= attackDmg;
        this.dffend = dffend;
        this.hp= hp;
    }

    int getAttackDmg(){
        return attackDmg;
    }

    int getDffend(){
        return dffend;
    }

    int getHp(){
        return hp;
    }
}