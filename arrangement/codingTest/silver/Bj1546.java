package codingTest.silver;

import java.util.*;
public class Bj1546 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();

        double[] nums = new double[N];
        String[] line = sc.nextLine().split(" ");
        for (int i = 0; i < N; i++) {
            nums[i] = Integer.parseInt(line[i]);
        }

        double newAverage = getAverage(nums);
        System.out.println(newAverage);


    }

    static double getAverage(double[] nums) {
        double maxNum =0;
        double sumNum =0;
        for (double num : nums) {
            maxNum = Math.max(maxNum, num);
        }
        for (double num : nums) {
            num = (num / maxNum) * 100;
            sumNum+= num;
        }

        double newAverage = sumNum / nums.length;
        return newAverage;
    }
}
