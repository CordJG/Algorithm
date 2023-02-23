package codingTest.silver;

import java.util.Scanner;

public class Battle1303Ver2 {

    static int n, m;
    static char[][] arr;
    static boolean[][] visited;
    static int[] dx = {0, 0, 1, -1};
    static int[] dy = {1, -1, 0, 0};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        arr = new char[m][n];
        visited = new boolean[m][n];

        for (int i = 0; i < m; i++) {
            arr[i] = sc.next().toCharArray();
        }

        int wPower = 0, bPower = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (!visited[i][j]) {
                    visited[i][j] = true;
                    int count = dfs(i, j);
                    if (arr[i][j] == 'W') {
                        wPower += count * count;
                    } else {
                        bPower += count * count;
                    }
                }
            }
        }
        System.out.println(wPower + " " + bPower);
    }

    static int dfs(int x, int y) {
        int count = 1;
        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (nx < 0 || nx >= m || ny < 0 || ny >= n) {
                continue;
            }
            if (visited[nx][ny] || arr[nx][ny] != arr[x][y]) {
                continue;
            }
            visited[nx][ny] = true;
            count += dfs(nx, ny);
        }
        return count;
    }
}
