package codingTest.silver;

import java.util.Scanner;

public class Game1072 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int n = getWinRate(a ,b);
        System.out.println(n);


    }

    static int getWinRate(int gameCount, int winCount){
        if(gameCount==winCount) return -1;

        int result1 = (int)Math.floor((double) winCount / gameCount * 100);
        int result2 ;

        int n1 = gameCount;
        int n2 = winCount;

        int count=0;
        while(true){
            count++;
            n1++;
            n2++;
            result2= (int)Math.floor ((double) n2/ n1 *100);
            if(result2>result1) {
                break;
            }
        }


        return count;
    }
}
