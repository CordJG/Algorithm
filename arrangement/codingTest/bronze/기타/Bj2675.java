package codingTest.bronze.기타;

import java.util.*;
public class Bj2675 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();
        String[] strs = new String[N];


        for (int i = 0; i < N; i++) {
            String newStr = "";
            String[] line = sc.nextLine().split(" ");

            int n = Integer.parseInt(line[0]);
            String str = line[1];

            for (int j = 0; j < str.length(); j++) {
                newStr += String.valueOf(str.charAt(j)).repeat(n);
            }

            System.out.println(newStr);

        }
    }
}
