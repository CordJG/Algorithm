package codingTest.bronze.기타;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Bj25304 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int receiptMoney = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());
        int realMoney = 0;


        while (N > 0) {
            String[] input = br.readLine().split(" ");

            int goodsMoney = Integer.parseInt(input[0]);
            int goodsQuantity = Integer.parseInt(input[1]);

            realMoney += goodsMoney * goodsQuantity;

            N = N-1;
        }

        if (realMoney == receiptMoney) {
            System.out.println("Yes");

        } else {
            System.out.println("No");
        }
    }
}
