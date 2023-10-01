package codingTest.bronze.기타;


import java.math.BigInteger;
import java.util.Scanner;

public class Bj1247 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger[][] nums = new BigInteger[3][];

        for (int i = 0; i < 3; i++) {
            int N = sc.nextInt();
            nums[i] = new BigInteger[N];

            for (int j = 0; j < N; j++) {
                nums[i][j] = sc.nextBigInteger();
            }
        }
        sc.close();
        for (BigInteger[] num : nums) {
            System.out.println(findSymbol(num));
        }

    }

    static String findSymbol(BigInteger[] nums) {
        BigInteger n = BigInteger.valueOf(0);
        BigInteger zero = BigInteger.valueOf(0);
        for (BigInteger num : nums) {
            n = n.add(num);
        }
        if (n.compareTo(zero)==0) {
            return "0";
        }
        else if (n.compareTo(zero)<0) {
            return "-";
        }
        else if (n.compareTo(zero)>0) {
            return "+";
        }
        throw new IllegalArgumentException("으앙");
    }
}
