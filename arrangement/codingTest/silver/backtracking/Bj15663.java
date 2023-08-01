package codingTest.silver.backtracking;

import java.io.*;
import java.util.*;

/**
 * 백트래킹 문제
 * visited 는 i 로한다( nums[i] x)
 * 중복된 값이 들어간 경우
 * 중복된 값이 들어가지 않게 이전 값이랑 같지 않을 때만 sequence에 추가하게 조건식을 넣어줌
 *
 */


public class Bj15663 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static int N;
    static int M;
    static int[] sequence;
    static boolean[] visited;

    static int[] nums;

    public static void main(String[] args) throws IOException {

        String[] input = br.readLine().split(" ");
        N = Integer.parseInt(input[0]);
        M = Integer.parseInt(input[1]);

        visited = new boolean[N];
        nums = new int[N];
        sequence = new int[M];

        input = br.readLine().split(" ");

        for (int i = 0; i < N; i++) {
            nums[i] = Integer.parseInt(input[i]);
        }
        Arrays.sort(nums);


        generateSequence(0);

        bw.flush();
        bw.close();
        br.close();

    }

    static void generateSequence(int depth) throws IOException {
        if (depth == M) {
            for (int num : sequence) {
                bw.write(num + " ");

            }
            bw.write("\n");

            return;
        }

        int prev =0;                       //이전 값이랑 다를 경우만 넣기 위한 조건식
        for (int i = 0; i < N; i++) {
            if (!visited[i] && prev != nums[i]) {      //이전 값이랑 다를 경우만 넣기 위한 조건식
                visited[i] = true;
                sequence[depth] = nums[i];
                prev = nums[i];              //이전 값이랑 다를 경우만 넣기 위한 조건식

                generateSequence(depth + 1);
                visited[i] = false;
            }
        }
    }
}

