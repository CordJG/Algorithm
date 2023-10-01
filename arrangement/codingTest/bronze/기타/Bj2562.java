package codingTest.bronze.기타;
import java.util.*;
public class Bj2562 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[9];
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 9; i++) {
            nums[i] = sc.nextInt();
            list.add(nums[i]);
        }
        int maxNum =0;

        for (int num : nums) {
            maxNum = Math.max(maxNum, num);
        }
        int index =list.indexOf(maxNum);

        System.out.println(maxNum);
        System.out.println(index+1);
    }
}
