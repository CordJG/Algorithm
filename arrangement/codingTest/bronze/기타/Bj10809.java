package codingTest.bronze.기타;
import java.util.*;
public class Bj10809 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        sc.close();

        int[] nums = new int[26];
        Arrays.fill(nums, -1);

        String[] alphabet = new String[26];
        char currentChar = 'a';

        for (int i = 0; i < 26; i++) {
            alphabet[i] = String.valueOf(currentChar);
            currentChar++;
        }

        for (int i = 0; i < 26; i++) {
            nums[i]=str.indexOf(alphabet[i]);
        }
        String result = "";

        for (int num : nums) {
            result += num + " ";
        }

        System.out.println(result);

    }
}
