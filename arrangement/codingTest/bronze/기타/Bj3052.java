package codingTest.bronze.기타;

import java.util.*;
public class Bj3052 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set set = new HashSet<>();
        for (int i = 0; i < 10; i++) {
            set.add(sc.nextInt() % 42);
        }
        sc.close();
        System.out.println(set.size());
    }
}
