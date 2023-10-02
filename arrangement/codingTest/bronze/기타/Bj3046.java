package codingTest.bronze.기타;

import java.util.Scanner;

public class Bj3046 {

    static int R1, S, result;
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");

        R1 = Integer.parseInt(input[0]);
        S = Integer.parseInt(input[1]);

        result = S*2 - R1;

        System.out.println(result);
    }
}
