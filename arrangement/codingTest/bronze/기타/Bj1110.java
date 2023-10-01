package codingTest.bronze.기타;

import java.util.Scanner;

public class Bj1110 {
    static int originN;
    static int maxCount;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        if (N < 10) {
            N = N * 10;
        }

        originN = N;

        int count =0;

        int result = getCycleN(N, count);

        System.out.println(result);

    }

    static int getCycleN(int N,int count) {
        int num1 = N / 10;
        int num2 = N - num1 * 10;

        if (N == originN && count!=0) {
            maxCount = count;
            return maxCount;
        }
        int rightN = num1 + num2;
        if (num1 + num2 >= 10) {
            rightN = rightN-10;
        }
        int newN = num2 * 10 + rightN;
        count++;



        return getCycleN(newN, count);
    }
}
