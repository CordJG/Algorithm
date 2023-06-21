package codingTest.silver.dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Bj11053 {

    static int[] dp ;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] nums = new int[N];

        String[] line = br.readLine().split(" ");

        int i=0;
        for (String str : line) {
            nums[i] = Integer.parseInt(str);
            i++;
        }

        dp = new int[N+1];

        dp[1] =1;

        int maxLength = 1;

        for (int j = 2; j <= N; j++) {
            dp[j] = 1; // 자기 자신을 포함하는 가장 작은 길이로 초기화

            // i번째 원소 이전의 원소들과 비교하여 증가하는 부분 수열인지 확인
            for (int k = 1; k < j; k++) {
                if (nums[j-1] > nums[k-1] && dp[j] < dp[k] + 1) {
                    dp[j] = dp[k] + 1; // 증가하는 부분 수열이므로 길이 갱신
                }
            }

            // 가장 긴 부분 수열의 길이 갱신
            if (maxLength < dp[j]) {
                maxLength = dp[j];
            }
        }

        System.out.println(maxLength);
    }
}