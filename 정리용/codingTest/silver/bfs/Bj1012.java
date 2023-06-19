package codingTest.silver.bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Bj1012 {

    static int[][] directions = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            String[] input = br.readLine().split(" ");
            int M = Integer.parseInt(input[0]);
            int N = Integer.parseInt(input[1]);
            int K = Integer.parseInt(input[2]);


            boolean[][] visited = new boolean[M][N];
            int count =0;

            int[][] nums = new int[M][N];
            for (int[] num : nums) {
                Arrays.fill(num, 0);
            }
            int[][] objects = new int[K][2];

            for (int j = 0; j < K; j++) {
                input = br.readLine().split(" ");
                int x = Integer.parseInt(input[0]);
                int y = Integer.parseInt(input[1]);
                nums[x][y] = 1;
                objects[j]= new int[]{x, y};
            }

            for(int[] object : objects){
                int x = object[0];
                int y = object[1];
                Queue<int[]> queue = new LinkedList<>();

                if (!visited[x][y]) {
                    queue.add(new int[]{x, y});
                    count++;
                    visited[x][y]=true;
                }
                while (!queue.isEmpty()) {
                    int[] cur = queue.poll();
                    int row = cur[0];
                    int col = cur[1];

                    for (int[] dir : directions) {
                        int newRow = row + dir[0];
                        int newCol = col + dir[1];

                        if (newRow >= 0 && newRow < M && newCol >= 0 && newCol < N && nums[newRow][newCol] ==1 && !visited[newRow][newCol]) {
                            queue.add(new int[]{newRow, newCol});
                            visited[newRow][newCol]=true;
                        }
                    }
                }
            }
            System.out.println(count);
        }
    }
}
