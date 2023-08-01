package codingTest.bronze;
import java.util.*;
public class Bj10998 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] line = sc.nextLine().split(" ");
        int[] nums = new int[line.length];
        for (int i = 0; i < line.length; i++) {
            nums[i] = Integer.parseInt(line[i]);
        }

        System.out.println(nums[0] * nums[1]);
    }
}
