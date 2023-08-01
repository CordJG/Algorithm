package codingTest.silver.backtracking;

import java.io.*;
import java.util.*;

/**
 * 백트래킹 문제  N과 M(5)
 * 백트래킹 문제는 모두 같다
 * 깊이를 설정해주고 깊이에 도달했을 때 값을 제출 해주면된다.
 * 주의할 점은 각 문제마다 sequence와 visited 배열의 크기를 다르게 설정해줘야함
 */

public class Bj15654 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static int N;
    static int M;
    static int[] sequence;
    static boolean[] visited;
    public static void main(String[] args) throws IOException {


        String[] input = br.readLine().split(" ");
        N = Integer.parseInt(input[0]);
        M = Integer.parseInt(input[1]);

        input = br.readLine().split(" ");

        sequence = new int[M];



        int[] nums = new int[N];

        for (int i = 0; i < N; i++) {
            nums[i] = Integer.parseInt(input[i]);
        }

        Arrays.sort(nums);
        int maxN = nums[N - 1];
        visited = new boolean[maxN+1];




        generateSequence(0, nums);

        bw.close();
        br.close();
    }

    static void generateSequence(int depth, int[] nums) throws IOException {
        if (depth == M) {
            for (int n : sequence) {
                bw.write(n + " ");
            }
            bw.write("\n");
            return;
        }

        for (int i = 0; i < N; i++) {

            if (!visited[nums[i]]) {
                visited[nums[i]] = true;
                sequence[depth] = nums[i];
                generateSequence(depth + 1, nums);
                visited[nums[i]] = false;
            }

        }
    }
}
