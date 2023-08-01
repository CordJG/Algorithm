package codingTest.bronze.math;


import java.util.Arrays;
import java.util.Scanner;

/**
 * 직각삼각형 문제 (피타고라스)
 * Math.sqrt 에 대한 개념만 알면 풀 수 있다
 * + 입력 값에 대한 제공 없을 때 푸는 경우
 */


public class Bj4153 {
    static int[] nums;
    public static void main(String[] args)  {

        Scanner sc = new Scanner(System.in);

        nums = new int[3];

        while (sc.hasNext()) {
            String[] input = sc.nextLine().split(" ");
            int i=0;
            for (String str : input) {
                nums[i++] = Integer.parseInt(str);
            }

            int[] sortedNums = Arrays.stream(nums).sorted().toArray();

            if (sortedNums[0] == 0 && sortedNums[1] == 0 && sortedNums[2] == 0) {
                break;
            }

            if (Math.sqrt(sortedNums[0] * sortedNums[0] + sortedNums[1] * sortedNums[1]) == sortedNums[2]) {
                System.out.println("right");

            } else {
                System.out.println("wrong");
            }
        }
    }
}
