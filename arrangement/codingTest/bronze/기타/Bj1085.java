package codingTest.bronze.기타;

import java.util.Scanner;

public class Bj1085 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] nums = new int[4];
        String[] line = sc.nextLine().split(" ");
        for (int i = 0; i < 4; i++) {
            nums[i] = Integer.parseInt(line[i]);
        }
        int minimumN = findNum(nums);
        System.out.println(minimumN);

    }

    static int findNum(int[] nums) {
        int x = nums[0];
        int y = nums[1];
        int w = nums[2];
        int h = nums[3];

        int minimumN = 1001;

        int[] numbers = {x, y, Math.abs(w - x), Math.abs(h - y)};
        for (int num : numbers) {
            if (minimumN > num) {
                minimumN = num;
            }
        }
        return minimumN;
    }
}
