package codingTest.platinum;

import java.util.*;

public class RunVer2 {
    static class Point {
        int x;
        int y;
        int time;

        public Point(int x, int y, int time) {
            this.x = x;
            this.y = y;
            this.time = time;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        int K = sc.nextInt();

        sc.nextLine();

        char[][] maze = new char[N][M];

        for (int i = 0; i < N; i++) {
            String line = sc.nextLine();
            for (int j = 0; j < M; j++) {
                maze[i][j] = line.charAt(j);
            }
        }

        int x1 = sc.nextInt() - 1;
        int y1 = sc.nextInt() - 1;
        int x2 = sc.nextInt() - 1;
        int y2 = sc.nextInt() - 1;

        sc.close();

        int minimalTime = findMinimalTime(maze, K, x1, y1, x2, y2);

        System.out.println(minimalTime);
    }

    static int findMinimalTime(char[][] maze, int K, int x1, int y1, int x2, int y2) {
        int N = maze.length;
        int M = maze[0].length;
        int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, -1, 1};

        Queue<Point> queue = new LinkedList<>();
        boolean[][][] visited = new boolean[N][M][K + 1];

        queue.add(new Point(x1, y1, 0));
        visited[x1][y1][0] = true;

        while (!queue.isEmpty()) {
            Point cur = queue.poll();
            int x = cur.x;
            int y = cur.y;
            int time = cur.time;

            if (x == x2 && y == y2) {
                return time;
            }

            for (int i = 0; i < 4; i++) {
                for (int j = 1; j <= K; j++) {
                    int nx = x + dx[i] * j;
                    int ny = y + dy[i] * j;

                    if (nx < 0 || nx >= N || ny < 0 || ny >= M || maze[nx][ny] == '#') {
                        break;
                    }

                    if (!visited[nx][ny][j]) {
                        visited[nx][ny][j] = true;
                        queue.add(new Point(nx, ny, time + 1));
                    }
                }
            }
        }

        return -1;
    }
}
