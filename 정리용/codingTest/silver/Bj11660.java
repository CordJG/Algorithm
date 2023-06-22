package codingTest.silver;

import java.io.*;

/**
 * dp문제  구간 합 구하기 5
 *  N개의 줄에는 표에 채워져 있는 수가 1행부터 차례대로 주어진다. -> 라는 표현은 1행 1열, 2열 3열 ... 이 주어진다는 뜻
 *  즉, 1행의 모든 열이 주어진다는 의미 (세로 줄)
 *  그리고 dp를 할 때 높은 수가 주어진 경우 반복문 안에 또다른 반복문이 들어가는 경우 무조건 시간초과가 나온다고 생각해야함
 *  반복문을 없애는 생각을 계속 해야 하는 게 중요
 */

public class Bj11660 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int M = Integer.parseInt(input[1]);

        int[][] dp = new int[N + 1][N + 1];


        for (int i = 1; i <= N; i++) {
            input = br.readLine().split(" ");
            int rowSum = 0;
            for (int j = 1; j <= N; j++) {
                int num = Integer.parseInt(input[j - 1]);
                rowSum += num;
                dp[i][j] = dp[i - 1][j] + rowSum;

            }
        }

        for (int i = 0; i < M; i++) {
            input = br.readLine().split(" ");
            int x1 = Integer.parseInt(input[0]);
            int y1 = Integer.parseInt(input[1]);
            int x2 = Integer.parseInt(input[2]);
            int y2 = Integer.parseInt(input[3]);

            int result = dp[x2][y2] - dp[x1 - 1][y2] - dp[x2][y1 - 1] + dp[x1 - 1][y1 - 1];
            /**
             * dp[x2][y2] -> (x2,y2) 좌표까지의 모든 행의 누적값
             * dp[x1-1][y2] -> x1 부터의 누적값을 계산해야 하니 x-1까지의 누적값을 제거
             * dp[x2][y1-1] -> y1 까지만 누적값을 계산해야 하니 y1-1부터의 누적값은 제거
             * dp[x1-1][y1-1] -> dp[x2][y1-1] 을 뺄 때 dp[x2][y1-1] 값에는 dp[x1-1][y1-1] 의 값이 포함되어 있음
             * 내가 원하는 건 x1,x2 사이에 있는 y1 이하의 행의 값만 빼야 하는 거 기 때문에 dp[x1-1][y1-1] 의 값을 더해줌
             */

            System.out.println(result);

        }
    }
}
