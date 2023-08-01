package codingTest.silver.시간초과관련;

import java.io.*;

/**
 *  집합을 다른 방식으로 표현하는 문제 (시간 복잡도 관련)
 *  boolean 이용
 *  switch 문 사용해서 간단하게 표현할 수 있다
 *  반복문마다 System.out 하는 것 보다
 *  StringBuilder 를 활용해서 하는 게 시간 훨씬 적게 든다! sb.append(set[n] ? 1 : 0).append('\n');
 *  BufferWriter를 활용할 수도 있다 (stringBuilder대신 ) 이게 맞겠따.
 */

public class Bj11723 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());

        boolean[] set = new boolean[21];


        for (int i = 0; i < N; i++) {
            String[] input = br.readLine().split(" ");
            String str = input[0];
            if(input.length==2) {
                int n = Integer.parseInt(input[1]);
                switch (str) {
                    case "add":
                        set[n] = true;
                        break;
                    case "remove":
                        set[n] = false;
                        break;
                    case "check":
                        bw.write(set[n] ? "1\n" : "0\n");
                        break;
                    case "toggle":
                        set[n] = !set[n];
                        break;
                }
            } else {
                switch (str) {
                    case "all":
                        for (int j = 1; j <= 20; j++) {
                            set[j] = true;
                        }
                        break;
                    case "empty":
                        for (int j = 1; j <= 20; j++) {
                            set[j] = false;
                        }
                        break;
                }
            }
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
