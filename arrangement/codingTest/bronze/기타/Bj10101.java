package codingTest.bronze.기타;

import java.util.Scanner;

public class Bj10101 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a + b + c != 180) {
            System.out.println("Error");
        } else {
            if (a == b && b == c) {
                System.out.println("Equilateral");

            } else if (a != b && b != c && c!=a) {
                System.out.println("Scalene");

            } else {
                System.out.println("Isosceles");
            }
        }
    }
}
