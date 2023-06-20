package codingTest.silver.sort;

import java.io.*;
import java.util.*;

/**
 * 시간 테이블을 최대로 활용하는 경우의 수 구하는 거임
 * 이럴 경우 시작 시간과 끝나는 시간이 주어지는데
 * 시작 시간과 끝나는 시간이 같아도 하나로 인정
 * 끝나는 시간을 기준으로 정렬을 해주고 그 다음 시간이 끝나는 시간보다 클 경우 count++을 해주면 되는데 Arrays.sort(nums, Comparator.comparingInt(n -> n[1]));
 * 문제는 끝나는 시간이 같은데 시작 시간이 더 빠른 경우도 고려해줘야함
 * 예를 들어 8 8 , 4 8 순서로 들어가게 되면
 * 8 8 이 인정되는 순간 4 8 은 인정이 되지 않음  4 가 8보다 크지 않기 때문
 * 그래서 시작 시간도 낮은 순서대로 정렬을 먼저 해준 뒤에 끝나는 시간을 정렬을 해줘야함! Arrays.sort(nums, Comparator.comparingInt(n -> n[0]));
 */

public class Bj1931 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[][] nums = new int[N][2];
        for (int i = 0; i < N; i++) {
            String[] input = br.readLine().split(" ");
            int start = Integer.parseInt(input[0]);
            int end = Integer.parseInt(input[1]);
            nums[i] = new int[]{start, end};
        }

        int count = findMaxN(nums);
        System.out.println(count);
    }

    static int findMaxN(int[][] nums) {

        int endTime =-1;

        int count =0;
        Arrays.sort(nums, Comparator.comparingInt(n -> n[0]));   // 시작 시간으로 배열 sort
        Arrays.sort(nums, Comparator.comparingInt(n -> n[1]));   // 끝나는 시간 기준으로 배열 sort

        for (int[] num : nums) {
            if (num[0] >= endTime ) {

                count++;
                endTime = num[1];

            }
        }

        return count;
        }
    }

