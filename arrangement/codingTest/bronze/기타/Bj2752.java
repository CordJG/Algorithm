package codingTest.bronze.기타;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Bj2752 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        int num1 = Integer.parseInt(input[0]);
        int num2 = Integer.parseInt(input[1]);
        int num3 = Integer.parseInt(input[2]);

        List<Integer> nums = new ArrayList<>();
        nums.add(num1);
        nums.add(num2);
        nums.add(num3);

        List<Integer> sortedNums = nums.stream().sorted().collect(Collectors.toList());

        System.out.println(sortedNums.get(0) + " " + sortedNums.get(1) + " " + sortedNums.get(2));
    }
}
