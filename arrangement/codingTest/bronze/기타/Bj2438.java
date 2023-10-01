package codingTest.bronze.기타;
import java.util.*;
public class Bj2438 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        for (int i = 0; i < N; i++) {
            System.out.println(" ".repeat(N-i-1)+"*".repeat(i+1));
        }
    }
}
