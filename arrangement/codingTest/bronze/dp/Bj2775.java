package codingTest.bronze.dp;

import java.io.*;
public class Bj2775 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            int k = Integer.parseInt(br.readLine());
            int n = Integer.parseInt(br.readLine());

            int[][] dp =new int[k+1][n+1];

            for (int j = 1; j < n + 1; j++) {
                dp[0][j] =j;
            }
            for (int a = 1; a <= k; a++) {
                dp[a][1] = dp[a-1][1];
                for (int b = 1; b <= n; b++) {
                    dp[a][b] = dp[a][b-1]+dp[a-1][b];
                }
            }
            System.out.println(dp[k][n]);

        }



        // 1 5 15 35 70...
        // 1 4 10 20 35 56 ...
        // 1 3 6 10 15 21 28...
        // 1 2 3 4 5 6 7 8 9 10
    }
}
