package codingTest.bronze;
import java.util.*;
public class Bj2475 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] line = sc.nextLine().split(" ");
        int[] nums = new int[line.length];
        int sum = 0;
        for (int i = 0; i < line.length; i++) {
            nums[i] = Integer.parseInt(line[i]);
        }
        for (int num : nums) {
            sum += Math.pow(num, 2);
        }
        System.out.println(sum % 10);
    }
}
