package codingTest.platinum;

import java.util.*;

public class RunVer3다익스트라 {
    static class Point implements Comparable<Point> {
        int x;
        int y;
        int time;

        public Point(int x, int y, int time) {
            this.x = x;
            this.y = y;
            this.time = time;
        }

        @Override
        public int compareTo(Point other) {
            return this.time - other.time;
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

        PriorityQueue<Point> queue = new PriorityQueue<>();
        int[][] dist = new int[N][M];
        for (int i = 0; i < N; i++) {
            Arrays.fill(dist[i], Integer.MAX_VALUE);
        }

        queue.add(new Point(x1, y1, 0));
        dist[x1][y1] = 0;

        while (!queue.isEmpty()) {
            Point cur = queue.poll();
            int x = cur.x;
            int y = cur.y;
            int time = cur.time;

            if (x == x2 && y == y2) {
                return time;
            }

            if (time > dist[x][y]) {
                continue;
            }

            for (int i = 0; i < 4; i++) {
                for (int j = 1; j <= K; j++) {
                    int nx = x + dx[i] * j;
                    int ny = y + dy[i] * j;

                    if (nx < 0 || nx >= N || ny < 0 || ny >= M || maze[nx][ny] == '#') {
                        break;
                    }

                    int newTime = time + 1;
                    if (newTime < dist[nx][ny]) {
                        dist[nx][ny] = newTime;
                        queue.add(new Point(nx, ny, newTime));
                    }
                }
            }
        }

        return -1;
    }
}
