package codingTest.gold.dp;

import java.io.*;


public class Bj12865 {

    static int[][] dp;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int K = Integer.parseInt(input[1]);

        int[] weights = new int[N + 1];
        int[] values = new int[N + 1];
        dp = new int[N + 1][K + 1];

        for (int i = 1; i <= N; i++) {
            input = br.readLine().split(" ");
            weights[i] = Integer.parseInt(input[0]);
            values[i] = Integer.parseInt(input[1]);
        }

        int result = knapsack(N, K, weights, values);
        System.out.println(result);
    }

    public static int knapsack(int N, int K, int[] weights, int[] values) {
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= K; j++) {
                if (weights[i] <= j) {
                    dp[i][j] = Math.max(dp[i - 1][j], values[i] + dp[i - 1][j - weights[i]]);
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }
        return dp[N][K];
    }
}

