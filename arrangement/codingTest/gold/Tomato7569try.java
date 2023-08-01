package codingTest.gold;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Tomato7569try {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        int M = sc.nextInt();
        int N = sc.nextInt();
        int H = sc.nextInt();

        sc.nextLine();

        int box[][][] = new int[H][N][M];
        for (int i = 0; i < H; i++) {
            for (int j = 0; j < N; j++) {
                String[] line = sc.nextLine().split(" ");
                for (int k = 0; k < M; k++) {
                    box[i][j][k] = Integer.parseInt(line[k]);
                }
            }
        }
        sc.close();

        int time = findDay(box, H, N, M);
        System.out.println(time);
    }

    static int findDay(int[][][] box,int H, int N, int M) {

        int minimalTime = 0;
        Queue<int[]> queue = new LinkedList<>();
        boolean[][][] visited = new boolean[H][N][M];

        int[][] directions = {{1, 0, 0}, {-1, 0, 0}, {0, 1, 0}, {0, -1, 0}, {0, 0, 1}, {0, 0, -1}};
        for (int i = 0; i < H; i++) {
            for (int j = 0; j < N; j++) {
                for (int k = 0; k < M; k++) {
                    if (box[i][j][k] == 1 && !visited[i][j][k]) {
                        queue.add(new int[]{i, j, k, 0});
                        visited[i][j][k] = true;
                    }
                }
            }
        }

        while (!queue.isEmpty()) {
            int[] cur = queue.poll();
            int high = cur[0];
            int col = cur[1];
            int row = cur[2];
            int time = cur[3];

            minimalTime = time;

            for (int[] dir : directions) {
                int newHigh = high + dir[0];
                int newCol = col + dir[1];
                int newRow = row + dir[2];

                if (newCol >= 0 && newCol < N && newRow >= 0 && newRow < M && newHigh >= 0 && newHigh < H && box[newHigh][newCol][newRow] == 0 && !visited[newHigh][newCol][newRow]) {
                    queue.add(new int[]{newHigh,newCol, newRow,time + 1});
                    box[newHigh][newCol][newRow] = 1;
                    visited[newHigh][newCol][newRow] = true;

                }
            }

        }
        boolean allRipe = true;

        for (int i = 0; i < H; i++) {
            for (int j = 0; j < N; j++) {
                for (int k = 0; k < M; k++) {
                    if (box[i][j][k] == 0) {
                        allRipe = false;
                        break;
                    }
                }
                if (!allRipe) {
                    break;
                }
            }
            if (!allRipe) {
                break;
            }
        }
        if (!allRipe) {
            minimalTime= -1;
        }

        return minimalTime;
    }
}

