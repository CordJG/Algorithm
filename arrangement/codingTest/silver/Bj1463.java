package codingTest.silver;

import java.util.*;
public class Bj1463 {
    static int[] memo; // 메모이제이션을 위한 배열

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        memo = new int[N + 1]; // 메모이제이션 배열 초기화

        int mintime = findMinimalNum(N);

        System.out.println(mintime);
    }

    static int findMinimalNum(int num) {
        if (num == 1) {
            return 0;
        }

        if (memo[num] != 0) {
            return memo[num]; // 이미 계산한 값이라면 메모된 결과 반환
        }

        int minTime = Integer.MAX_VALUE;

        if (num % 3 == 0) {
            int time1 = findMinimalNum(num / 3) + 1;
            minTime = Math.min(minTime, time1);
        }

        if (num % 2 == 0) {
            int time2 = findMinimalNum(num / 2) + 1;
            minTime = Math.min(minTime, time2);
        }

        int time3 = findMinimalNum(num - 1) + 1;
        minTime = Math.min(minTime, time3);

        memo[num] = minTime; // 결과를 메모이제이션 배열에 저장

        return minTime;
    }
}

