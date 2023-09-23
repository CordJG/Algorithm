package codingTest.bronze.BufferedReader;

import java.io.*;

/**
 * BufferedReader 이용한 코테문제
 */
public class Bj15552 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());

        for (int i = 1; i <= N; i++) {

            String[] input = br.readLine().split(" ");
            int num1 = Integer.parseInt(input[0]);
            int num2 = Integer.parseInt(input[1]);
            bw.write(num1+num2+"\n");
        }

        bw.flush();

    }
}
