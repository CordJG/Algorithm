package codingTest.bronze.기타;

import java.util.Scanner;

public class Bj10039 {

    static int sum;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[5];

        for (int i = 0; i < 5; i++) {
            int num = Integer.parseInt(sc.nextLine());
            if (num <= 40) {
                num = 40;
            }
            nums[i] = num;
        }

        sum =0;
        for (int num : nums) {
            sum+=num;
        }

        System.out.println(sum/5);
    }
}
