package codingTest.bronze.기타;

import java.util.Scanner;

public class Bj2845 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int manNum = sc.nextInt();
        int multiplyNum = sc.nextInt();

        int realManNum = manNum * multiplyNum;

        sc.nextLine();

        String[] manNums = sc.nextLine().split(" ");
        for (String num : manNums) {
            int guessManNum = Integer.parseInt(num);
            System.out.print(guessManNum - realManNum +" ");
        }
    }
}
