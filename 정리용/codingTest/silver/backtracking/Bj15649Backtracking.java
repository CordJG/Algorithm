package codingTest.silver.backtracking;

import java.util.*;

public class Bj15649Backtracking {
    static int[] sequence; // 수열을 저장할 배열
    static boolean[] visited; // 방문 여부를 저장할 배열

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        sequence = new int[M];
        visited = new boolean[N];

        backtrack(N, M, 0);

        sc.close();
    }
        static void backtrack(int N, int M, int depth) {
            if (depth == M) { // 수열의 길이가 M에 도달한 경우 출력
                for (int num : sequence) {
                    System.out.print(num + " ");
                }
                System.out.println();
                return;      //다음 for문 되게 return
            }

            for (int i = 0; i < N; i++) {
                if (!visited[i]) {
                    visited[i] = true;
                    sequence[depth] = i + 1;
                    backtrack(N, M, depth + 1);
                    visited[i] = false;
                }
            }
        }
    }