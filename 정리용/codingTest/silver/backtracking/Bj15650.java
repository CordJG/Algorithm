package codingTest.silver.backtracking;

import java.io.*;

/**
 * 백트래킹 문제
 * 내가 구하고자 하는 깊이를 인자로 넣은 재귀함수를 만들고
 * 깊이에 다다랐을 때 그 결과값을 출력하는 식으로 구하면된다
 */


public class Bj15650 {
    static int N, M;
    static boolean[] visited;
    static int[] sequence;

    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split(" ");
        N = Integer.parseInt(input[0]);
        M = Integer.parseInt(input[1]);

        sequence = new int[M];
        visited = new boolean[N+1];


        generateSequence(0, 1);


        bw.flush();
        bw.close();
        br.close();
    }

    static void generateSequence(int depth, int start) throws IOException {
        // 수열의 길이가 M에 도달하면 수열 출력

        if (depth == M) {
            for (int num : sequence) {
                bw.write(num+" ");
            }
            bw.write("\n");
            return;
        }

        // start부터 N까지의 숫자 중에서 방문하지 않은 숫자를 선택하여 수열에 추가
        for (int j = start; j <= N; j++) {
            if (!visited[j ]) {
                visited[j ] = true;
                sequence[depth]=j;
                generateSequence(depth + 1, j + 1);
                visited[j] =false;
            }
        }
    }
}
