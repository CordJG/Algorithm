package codingTest.bronze;

import java.util.*;

public class Bj2440 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        String str = "*";
        while (N > 0) {
            System.out.println(str.repeat(N));
            N = N - 1;
        }
    }
}
