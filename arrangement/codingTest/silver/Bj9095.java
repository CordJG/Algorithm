package codingTest.silver;

import java.util.*;
public class Bj9095 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int[] nums = new int[T];

        for (int i = 0; i < T; i++) {
            nums[i] = sc.nextInt();
        }

        countAll(nums);

    }

    static void countAll(int[] nums) {
        for (int num : nums) {
            System.out.println(count(num));
        }
    }

    static int count(int num) {
        int n = 1;
        int result2 = num / 2;
        int result3 = num / 3;

        for (int i = 1; i <= result2; i++) {
            int a = num - i*2;
            n += factorial(num - i) / (factorial(i) * factorial(a));
            if (a > 0) {
                for (int j = 1; j <= a / 3; j++) {
                    n += factorial(num - i - j * 2) / (factorial(i) * factorial(j) * factorial(a - j * 3));
                }
            }
        }
        for (int k = 1; k <= result3; k++) {
            int b = num - k*3;
            n += factorial(num - k * 2) /(factorial(k) * factorial(b));
        }
        return n;
    }

    static int factorial(int num){
        if (num == 0) {
            return 1;
        } else{
            return num * factorial(num - 1);
        }
    }
}
