package codingTest.bronze.기타;

import java.util.Scanner;

public class Bj10797 {

    static int count =0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int standard = sc.nextInt();
        sc.nextLine();

        int num = 5;
        while (num > 0) {
            int carsNum = sc.nextInt();
            if (standard == carsNum) {
                count++;
            }
            num --;
        }

        System.out.println(count);
    }
}
