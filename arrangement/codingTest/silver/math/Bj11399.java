package codingTest.silver.math;

import java.io.*;
import java.util.*;

/**
 * 수학 문제
 */
public class Bj11399 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        String[] input = br.readLine().split(" ");
        int[] nums = new int[N];
        for (int i = 0; i < N; i++) {
            nums[i] = Integer.parseInt(input[i]);
        }
        Arrays.sort(nums);
        int sumNum =0;
        int finalNum = 0;
        for (int num : nums) {
            sumNum+=num;
            finalNum += sumNum;
        }

        System.out.println(finalNum);
    }
}
