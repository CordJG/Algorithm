package codingTest.silver.bfs;

import java.io.*;
import java.util.*;

/**
 * 일반적인 미로찾기 시간 탐색이 아닌 미로탈출구로부터 각각의 위치에서의 시간을 구하는 거기 때문에
 * 각각의 위치에서 미로탈출구까지의 시간을 검색하는 게 아닌
 * 탈출구에서부터 각각의 위치로 이동할 때마다의 시간을 구해줘야함!
 */

public class Bj14940 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inputs = br.readLine().split(" ");
        int n = Integer.parseInt(inputs[0]);
        int m = Integer.parseInt(inputs[1]);
        int[][] nums = new int[n][m];


        for (int i = 0; i < n; i++) {
            inputs = br.readLine().split(" ");
            for (int j = 0; j < m; j++) {
                nums[i][j] = Integer.parseInt(inputs[j]);
            }
        }

        int[][] result = getArray(nums, n, m);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (j != m - 1) {
                    System.out.print(result[i][j] + " ");
                } else {
                    System.out.println(result[i][j]);
                }
            }
        }

    }

    static int[][] getArray(int[][] nums, int n, int m) {
        Queue<int[]> queue = new LinkedList<>();
        boolean[][] visited = new boolean[n][m];

        int[][] result = new int[n][m];
        int[][] directions = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};

        for (int i = 0; i < n; i++) {
            Arrays.fill(result[i], -1);
        }


        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (nums[i][j] == 2) {
                    queue.add(new int[]{i, j, 0});
                    result[i][j]=0;
                }
                if (nums[i][j] == 0) {
                    result[i][j] = 0;
                }
            }
        }

                while (!queue.isEmpty()) {
                    int[] cur = queue.poll();
                    int col = cur[0];
                    int row = cur[1];
                    int time = cur[2];

                    for (int[] dir : directions) {
                        int newCol = col + dir[0];
                        int newRow = row + dir[1];

                        if (newCol >= 0 && newCol < n && newRow >= 0 && newRow < m && nums[newCol][newRow] ==1 && result[newCol][newRow]==-1 && !visited[newCol][newRow]) {
                            queue.add(new int[]{newCol, newRow, time + 1});
                            result[newCol][newRow] = time+1;
                            visited[newCol][newRow] =true;
                        }

                    }
                }

        return  result;
    }
}
