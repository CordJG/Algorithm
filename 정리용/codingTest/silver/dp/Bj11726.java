package codingTest.silver.dp;

import java.io.*;

/**
 * dp문제   타일을 추가할 때 경우의수는 두가지 2x1 을 하나 더하거나 1x2를 두개 더하거나
 * 2x1을 하나 더하는 경우는 2x(n-1) 타일에서 하나를 더하는 경우이고
 * 1x2 를 두개 더하는 경우는 2x(n-2) 타일에서 두개를 더하는 경우임
 *
 */


public class Bj11726 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[] dp = new int[N + 1];
        dp[1] = 1;
        if (N != 1) {
            dp[2] = 2;
        }

        for (int i = 3; i <= N; i++) {
            dp[i] = (dp[i - 1] + dp[i - 2]) %10007 ;
        }

        System.out.println(dp[N] );

    }


}
