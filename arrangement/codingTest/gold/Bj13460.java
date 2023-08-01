package codingTest.gold;

import java.util.*;

public class Bj13460 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[2];

        String[] numLine = sc.nextLine().split(" ");
        for (int i = 0; i < 2; i++) {
            num[i] = Integer.parseInt(numLine[i]);
        }

        int N = num[0];
        int M = num[1];

        char[][] board = new char[N][M];

        int[] red = new int[2];
        int[] blue = new int[2];

        for (int i = 0; i < N; i++) {
            String[] line = sc.nextLine().split("");
            for (int j = 0; j < M; j++) {
                board[i][j] = line[j].charAt(0);

                if (board[i][j] == 'R') {
                    red[0] = i;
                    red[1] = j;
                }
                if (board[i][j] == 'B') {
                    blue[0] = i;
                    blue[1] = j;
                }
            }
        }
        sc.close();

        int time = findMinimalNum(board, N, M, red, blue);
        System.out.println(time);
    }

    static int findMinimalNum(char[][] board, int N, int M, int[] red, int[] blue) {
        Queue<int[]> queue = new LinkedList<>();
        boolean[][][][] visited = new boolean[N][M][N][M];

        int[] dx = {1, -1, 0, 0};
        int[] dy = {0, 0, 1, -1};

        int ry = red[0];
        int rx = red[1];
        int by = blue[0];
        int bx = blue[1];

        queue.add(new int[]{ry, rx, by, bx, 0});
        visited[ry][rx][by][bx] = true;

        while (!queue.isEmpty()) {
            int[] cur = queue.poll();
            int curRy = cur[0];
            int curRx = cur[1];
            int curBy = cur[2];
            int curBx = cur[3];
            int time = cur[4];

            if (time >= 10) {
                return -1;
            }

            for (int i = 0; i < 4; i++) {
                int nextRy = curRy;
                int nextRx = curRx;
                int nextBy = curBy;
                int nextBx = curBx;
                boolean redReachedHole = false;
                boolean blueReachedHole = false;

                // Red 구슬 이동
                while (board[nextRy][nextRx] != '#' && board[nextRy][nextRx] != 'O') {
                    nextRy += dy[i];
                    nextRx += dx[i];
                }

                if (board[nextRy][nextRx] == 'O') {
                    redReachedHole = true;
                } else {
                    nextRy -= dy[i];
                    nextRx -= dx[i];
                }

                // Blue 구슬 이동
                while (board[nextBy][nextBx] != '#' && board[nextBy][nextBx] != 'O') {
                    nextBy += dy[i];
                    nextBx += dx[i];
                }

                if (board[nextBy][nextBx] == 'O') {
                    blueReachedHole = true;
                } else {
                    nextBy -= dy[i];
                    nextBx -= dx[i];
                }

                // 구슬 위치 조정
                if (redReachedHole && !blueReachedHole) {
                    return time + 1;
                }

                if (nextRy == nextBy && nextRx == nextBx && board[nextRy][nextRx]!='O' && board[nextBy][nextBx]!='O') {
                    int redDistance = Math.abs(nextRy - curRy) + Math.abs(nextRx - curRx);
                    int blueDistance = Math.abs(nextBy - curBy) + Math.abs(nextBx - curBx);

                    if (redDistance > blueDistance) {
                        nextRy -= dy[i];
                        nextRx -= dx[i];
                    } else {
                        nextBy -= dy[i];
                        nextBx -= dx[i];
                    }
                }

                if (!visited[nextRy][nextRx][nextBy][nextBx]) {
                    visited[nextRy][nextRx][nextBy][nextBx] = true;
                    queue.add(new int[]{nextRy, nextRx, nextBy, nextBx, time + 1});
                }
            }
        }

        return -1;
    }
}

