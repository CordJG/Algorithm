package codingTest.bronze;

import java.util.Scanner;

public class Bj2231 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.close();

        int result = findNewNum(N);
        System.out.println(result);
    }
    static int findNewNum(int N){
        int result =0;
        for (int i = 1; i <N; i++) {
            int sum =i;

            int newM = i;
            while (newM >0){
                sum += newM %10;
                newM /= 10;
            }
            if (sum == N) {
                result =i;
                break;
            }
        }
        return  result;
    }
}
