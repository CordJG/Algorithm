package codingTest.silver;

import java.util.*;

public class Game1072 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();
        int n = getWinRate(a ,b);
        System.out.println(n);


    }

    static int getWinRate(int gameCount, int winCount){


        int result1 = (int)Math.floor((double) winCount / gameCount * 100);
        int result2 =result1;

        int n1 = gameCount;
        int n2 = winCount;

        int count=0;
        if(result1<99) {
            while (result2==result1) {
                count+=100;
                n1+=100;
                n2+=100;
                result2 = (int) Math.floor((double) n2 / n1 * 100);
                if(result1!=result2){
                    return count;
                }
            }
        }
        return -1;

    }
}
