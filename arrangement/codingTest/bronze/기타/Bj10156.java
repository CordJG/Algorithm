package codingTest.bronze.기타;

import java.util.Scanner;

public class Bj10156 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        int snackPrice = Integer.parseInt(input[0]);
        int quantity = Integer.parseInt(input[1]);
        int money = Integer.parseInt(input[2]);


        int requiredMoney = snackPrice * quantity - money;

        if (requiredMoney < 0) {
            requiredMoney =0;
        }
        System.out.println(requiredMoney);
    }
}
