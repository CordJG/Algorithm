package codingTest.bronze.기타;

import java.util.*;
public class Bj1978 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();

        int[] nums = new int[N];

        String[] line = sc.nextLine().split(" ");
        for (int i = 0; i < N; i++) {
            nums[i] = Integer.parseInt(line[i]);
        }


        int count=0;
        for (int num : nums) {
            boolean checkNoPrime =false;
            if (num == 1) {
                checkNoPrime = true;
            } else {
                for (int i = 2; i < num; i++) {
                    if (num % i == 0) {
                        checkNoPrime = true;
                        break;
                    }
                }
                if (!checkNoPrime) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
