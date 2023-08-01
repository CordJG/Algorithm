package codingTest.silver;

import java.io.*;


public class Bj2839 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        boolean check = false;
        for (int a = (int) Math.floor((double)N/5); a >= 0; a--) {

            int count = 0;
            if (a * 5 == N) {

                System.out.println(a);
                check=true;
                break;
            } else {
                for (int b = 0; b * 3 <= N - a * 5; b++) {
                    if (b * 3 == N - a * 5) {
                        count = a + b;
                        System.out.println(count);
                        check = true;
                        break;
                    }
                }
            }
            if (check) {
                break;
            }
        }
        if (!check) {
            System.out.println(-1);
        }
    }
}
