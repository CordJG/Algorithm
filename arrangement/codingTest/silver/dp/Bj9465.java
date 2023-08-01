package codingTest.silver.dp;

import java.util.Scanner;

public class Bj9465 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt(); // 테스트 케이스 개수 입력

        for (int t = 0; t < T; t++) {
            int n = scanner.nextInt(); // n 입력

            int[][] scores = new int[2][n];
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < n; j++) {
                    scores[i][j] = scanner.nextInt(); // 스티커 점수 입력
                }
            }

            int[][] dp = new int[2][n];
            dp[0][0] = scores[0][0];
            dp[1][0] = scores[1][0];

            for (int i = 1; i < n; i++) {
                dp[0][i] = Math.max(dp[1][i - 1], (i >= 2 ? dp[1][i - 2] : 0)) + scores[0][i];
                dp[1][i] = Math.max(dp[0][i - 1], (i >= 2 ? dp[0][i - 2] : 0)) + scores[1][i];
            }

            int maxScore = Math.max(dp[0][n - 1], dp[1][n - 1]);
            System.out.println(maxScore);
        }

        scanner.close();
    }
}
