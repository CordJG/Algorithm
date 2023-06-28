package codingTest.gold.dp;

import java.util.*;


public class Bj13549 {

    static int[] dp ;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int K = Integer.parseInt(input[1]);

        int[] dp = new int[K*2 +1];
        Arrays.fill(dp, 1000000);
        dp[N] = 0;

        for (int i = N; i <= K; i++) {
            if (i > 0) {
                dp[i] = Math.min(dp[i], dp[i - 1] + 1);
            }
            if (i < K) {
                dp[i] = Math.min(dp[i], dp[i + 1] + 1);
            }
            if (2 * i <= K*2) {
                dp[2 * i] = dp[i];
            }
        }

        System.out.println(dp[K]);

        sc.close();
    }
}