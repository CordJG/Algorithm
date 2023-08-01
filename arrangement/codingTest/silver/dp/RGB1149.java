package codingTest.silver.dp;


import java.io.*;

/**
 * dp 문제
 * 각각의 집은 그 전 집에서 자신의 색깔과 다른 값들 중 작은 컬러 값 일 때의 본인 컬러값을 정한다
 * 그때 dp는 이전 컬러값들 중 작은 값 + 본인 컬러값으로 누적값으로 구한다
 * 그렇게 모두 구하면 dp[N-1][0] ,[1],[2] 에는 각각 값들이 모두 구해지고
 * 이 중 최소값을 구하면된다
 */

public class RGB1149 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[][] cost = new int[N][3];

        for (int i = 0; i < N; i++) {
            String[] input = br.readLine().split(" ");
            int red = Integer.parseInt(input[0]);
            int green = Integer.parseInt(input[1]);
            int blue = Integer.parseInt(input[2]);

            cost[i][0] = red;
            cost[i][1] = green;
            cost[i][2] = blue;
            }

        int[][] dp = new int[N][3];

        dp[0][0] = cost[0][0];
        dp[0][1] = cost[0][1];
        dp[0][2] = cost[0][2];

        for (int i = 1; i < N; i++) {
            dp[i][0] = Math.min(dp[i - 1][1], dp[i - 1][2]) + cost[i][0]; //빨강으로 칠하는 경우
            dp[i][1] = Math.min(dp[i - 1][0], dp[i - 1][2]) + cost[i][1]; //초록으로 칠하는 경우
            dp[i][2] = Math.min(dp[i - 1][0], dp[i - 1][1]) + cost[i][2]; //파랑으로 칠하는 경우
        }

        int minCost = Math.min(Math.min(dp[N - 1][0], dp[N - 1][1]), dp[N - 1][2]);
        System.out.println(minCost);
        }
    }

