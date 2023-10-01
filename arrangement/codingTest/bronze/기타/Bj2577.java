package codingTest.bronze.기타;

import java.util.*;
public class Bj2577 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[3];
        int N = 1;
        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
            N = N * nums[i];
        }
        String strN = String.valueOf(N);
        int[] arr = new int[10];   //자동으로 0으로 채워짐


            for (int j = 0; j < strN.length(); j++) {
                int digit = Integer.parseInt(String.valueOf(strN.charAt(j)));
                arr[digit]++;

        }

        for (int n : arr) {
            System.out.println(n);
        }

    }
}
