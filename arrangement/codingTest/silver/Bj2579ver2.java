package codingTest.silver;

import java.util.*;
public class Bj2579ver2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int[] nums = new int[N];
        for (int i = 0; i < N; i++) {
            nums[i] = sc.nextInt();
        }

        int maxPoint = findMaxN(nums);
        System.out.println(maxPoint);
    }

    static int findMaxN(int[] nums) {
        int N = nums.length;
        int[] dp = new int[N+1]; // dp 배열에 최대 점수를 저장
        int[] stairs = new int[N+1];

        for (int i = 1; i <= N; i++) {
            stairs[i] = nums[i-1];
        }

        dp[1] = stairs[1];
        if (N ==1) {
            return stairs[1];
        }
        if( N==2){
            return stairs[1] + stairs[2];
        }
        dp[2] = stairs[1] + stairs[2];
        dp[3] = Math.max(stairs[1], stairs[2]) + stairs[3];

        for (int i = 4; i <= N; i++) {
            dp[i] = Math.max(dp[i - 3] + stairs[i - 1], dp[i - 2]) + stairs[i];
        }

        return dp[N];

    }
}
