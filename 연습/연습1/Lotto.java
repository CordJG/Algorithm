package 연습.연습1;

import java.util.HashSet;

public class Lotto {
    public static void main(String[] args) {


        HashSet<Integer> hashSet = new HashSet<>();

        for (int i = 1; hashSet.size() < 7; i++) {
            int num = (int)(Math.random() *45)+1;
            System.out.println(i + "번째 num = " + num);

            hashSet.add(num);

            try { Thread.sleep(1000); } catch(Exception e){}

        }


        System.out.println("1등 당첨 번호 : " + hashSet);



    }
}
