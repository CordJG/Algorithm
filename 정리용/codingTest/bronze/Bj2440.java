package codingTest.bronze;

import java.sql.Array;
import java.util.*;
import java.util.stream.Collectors;

public class Bj2440 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        String str = "*";
        while (N > 0) {
            System.out.println(str.repeat(N));
            N = N - 1;
        }

        System.out.print("*");
        System.out.print("*");
        System.out.print("*");

        List<Integer> list = new ArrayList<>();

        List<Integer> sortedList = (List<Integer>) list.stream().sorted();

    }
}
