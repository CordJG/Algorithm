package codingTest.gold.dfs;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;

public class Bj2206 {
    static int[][] maze;
    static int N;
    static int M;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        N = Integer.parseInt(input[0]);
        M = Integer.parseInt(input[1]);

        maze = new int[N][M];

        for (int i = 0; i < N; i++) {
            input = br.readLine().split("");
            for (int j = 0; j < M; j++) {
                maze[i][j] = Integer.parseInt(input[j]);
            }
        }

        int result = findMinimumN(maze);
        System.out.println(result);
    }

    static int findMinimumN(int[][] maze) {
        Queue<int[]> queue = new LinkedList<>();
        boolean[][][] visited = new boolean[N][M][2];

        int[][] directions = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
        queue.add(new int[]{0, 0, 1,0});
        visited[0][0][0] = true;

        while (!queue.isEmpty()) {
            int[] cur = queue.poll();
            int col = cur[0];
            int row = cur[1];
            int time = cur[2];
            int count = cur[3];

            if (col == N - 1 && row == M - 1) {
                return time;
            }

            for (int[] dir : directions) {
                int newCol = col + dir[0];
                int newRow = row + dir[1];
                int newCount = count;

                if (newCount == 1) {
                    if (newCol >= 0 && newCol < N && newRow >= 0 && newRow < M && !visited[newCol][newRow][newCount] && maze[newCol][newRow]!=1) {
                        queue.add(new int[]{newCol, newRow, time + 1, newCount});
                        visited[newCol][newRow][newCount] = true;
                    }
                }else{
                    if (newCol >= 0 && newCol < N && newRow >= 0 && newRow < M && !visited[newCol][newRow][newCount]) {
                        if (maze[newCol][newRow] == 1) {
                            queue.add(new int[]{newCol, newRow, time + 1, newCount+1});
                            visited[newCol][newRow][newCount] = true;
                        } else {
                            queue.add(new int[]{newCol, newRow, time + 1, newCount});
                            visited[newCol][newRow][newCount]=true;
                        }
                    }
                }
            }
        }
        return -1;
    }
}
