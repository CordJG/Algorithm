package 연습.연습6;

import java.util.Random.*;

public class CordJgPrivate {
    public static void main(String[] args) {

        Neo neo = new Neo(10, 5, 100);

        System.out.println("내 캐릭터의 데미지는" +neo.getAttackDmg()+" 방어력은"+ neo.getDffend()+" HP는" +neo.getHp()+"입니다");

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

        int basisDmg = 0;
        int criticalCount=0;
        double count=0.0;
        double sumDmg =0.0;

        while(this.hp>0){
            count++;

            basisDmg= attackDmg+(int)((Math.random()*10+1));
            hp = hp-(basisDmg-dffend);

            if(basisDmg==attackDmg+10) {
                criticalCount++;
                System.out.println("Critical!!");
            }
            System.out.printf("데미지가 %s 나왔습니다.\n",basisDmg);
            if(this.hp<=0) {System.out.println("내 캐릭터가 죽었습니다"); break;}
            System.out.printf("내 체력이 %s 만큼 남았습니다\n",hp);
            System.out.println();
            sumDmg +=basisDmg;
            basisDmg=0;
        }
        double averDmg= Math.round((sumDmg/count*100)/100.0);

        System.out.printf("총 공격 횟수 :%s , 크리티컬 횟수 : %d , 평균 데미지 : %s",count,criticalCount,sumDmg/count);

    }

    void damage(){
       ;
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