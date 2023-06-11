package codingTest.gold;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Tomato7576 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int N = sc.nextInt();


        sc.nextLine();

        int[][] box = new int[N][M];
        for (int i = 0; i < N; i++) {
            String[] line = sc.nextLine().split(" ");
            for (int j = 0; j < M; j++) {
                box[i][j] = Integer.parseInt(line[j]);
            }
        }

        sc.close();

        int time = findminimumTime(box);
        System.out.println(time);

    }

    static int findminimumTime(int[][] box) {
        int N = box.length;
        int M = box[0].length;
        int minimumTime = 0;

        Queue<int[]> queue = new LinkedList<>();
        boolean[][] visited = new boolean[N][M];

        int[][] directions = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};


        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (box[i][j] == 1) {
                    queue.add(new int[]{i, j,0});
                    visited[i][j] = true;
                }
            }
        }

                while (!queue.isEmpty()) {

                    int[] cur = queue.poll();
                    int col = cur[0];
                    int row = cur[1];
                    int time = cur[2];

                    minimumTime = time;


                    for (int[] dir : directions) {
                        int newCol = col + dir[0];
                        int newRow = row + dir[1];

                        if (newCol >= 0 && newCol < N && newRow >= 0 && newRow < M && box[newCol][newRow] == 0 && !visited[newCol][newRow]) {
                            queue.add(new int[]{newCol, newRow,time+1});
                            box[newCol][newRow] = 1;
                            visited[newCol][newRow] = true;
                        }


                    }
                }
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (box[i][j] == 0) {
                    return -1;
                }
            }
        }
        return minimumTime;
            }
        }

