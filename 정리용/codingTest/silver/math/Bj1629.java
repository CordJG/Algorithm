package codingTest.silver.math;


import java.io.*;

/**
 * 분할 정복을 이용한 거듭제곱... 근데 이해가 안됨
 */

public class Bj1629 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        long A =  Integer.parseInt(input[0]);
        long B =  Integer.parseInt(input[1]);
        long C =  Integer.parseInt(input[2]);

        long result = pow(A, B, C);

        System.out.println(result);
        System.out.println(1%12);
    }

    static long pow(long A, long B, long C) {
        if (B == 0) {
            return 1;
        }

        long half = pow(A, B / 2, C);
        long result = (half * half) %C;

        if (B % 2 == 1) {
            result = (result * A) % C;
        }

        return result;
    }
}
