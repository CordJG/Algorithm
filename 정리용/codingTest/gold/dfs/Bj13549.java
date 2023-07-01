package codingTest.gold.dfs;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;

/**
 * 일반적인 bfs 문제가 아님 왜냐하면 간선에 대한 가중치가 다른 경우 bfs로 푸는 게 아니기 때문
 * 다만 이 문제는 가중치가 0인 걸 앞에 dir로 정해서 풀 경우 정답으로 될 수 있다.
 * 0 1 너비우선탐색 dfs
 */

public class Bj13549 {

    static boolean[][] visited ;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int K = Integer.parseInt(input[1]);

        visited = new boolean[100001][3];

        int minimalTime = findMinTime(N, K);
        System.out.println(minimalTime);
    }


    static int findMinTime(int N, int K) {
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{N, 0});

        while (!queue.isEmpty()) {

            int[] cur = queue.poll();
            int curX = cur[0];
            int time = cur[1];


            if (curX == K) {
                return time;
            }

            int[] nextXs = {2 * curX,curX - 1, curX + 1 };

            for (int i = 0; i < 3; i++) {
                int nextX = nextXs[i];

                if (nextX < 0 || nextX > 100000 || visited[nextX][i]) {
                    continue;
                }
                    if (i == 0) {
                        queue.add(new int[]{nextX, time });
                        visited[nextX][i] = true;
                    } else {
                        queue.add(new int[]{nextX,time+1});
                        visited[nextX][i]=true;
                    }

            }
        }
        return -1;
    }
}
