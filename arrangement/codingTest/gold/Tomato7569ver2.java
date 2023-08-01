package codingTest.gold;

import java.util.*;
public class Tomato7569ver2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int M = sc.nextInt();
        int N = sc.nextInt();
        int H = sc.nextInt();

        sc.nextLine();

        int box[][] = new int[N*H][M];

        for (int i = 0; i < N*H; i++) {
            String[] line = sc.nextLine().split(" ");
            for (int j = 0; j < M; j++) {
                box[i][j] = Integer.parseInt(line[j]);
            }
        }
        sc.close();

        int time = findDay(box, H);
        System.out.println(time);
    }

    static int findDay(int[][] box, int H) {
        int N = box.length;
        int M = box[0].length;
        int K = box.length / H;

        int minimalTime = 0;
        Queue<int[]> queue = new LinkedList<>();
        boolean[][] visited = new boolean[N][M];
        int[][] directions = new int[4+(H-1)*2][2];

        directions[0] = new int[]{1, 0};
        directions[1] = new int[]{-1, 0};
        directions[2] = new int[]{0, 1};
        directions[3] = new int[]{0, -1};

        for (int i = 0; i < (H - 1) * 2; i+=2) {
            directions[i + 4] = new int[]{K * (1 + i / 2),0};

        }
        for (int i = 1; i < (H - 1) * 2; i += 2) {
            directions[i + 4] = new int[]{-K * (1 + (i - 1) / 2),0};
        }


        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (box[i][j] == 1 && !visited[i][j]) {
                    queue.add(new int[]{i, j, 0});
                    visited[i][j]=true;
                }
            }
        }
        if (queue.isEmpty()) {
            return 0;
        }

        while (!queue.isEmpty()) {
            int[] cur = queue.poll();
            int col = cur[0];
            int row = cur[1];
            int time = cur[2];

            minimalTime=time;

            for (int[] dir : directions) {
                int newCol = col + dir[0];
                int newRow = row + dir[1];

                if(newCol>=0 && newCol<N && newRow>=0 && newRow<M && box[newCol][newRow]==0 && !visited[newCol][newRow]){
                    queue.add(new int[]{newCol, newRow, time + 1});
                    box[newCol][newRow]=1;
                    visited[newCol][newRow]=true;

                }
            }

        }
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if(box[i][j]==0){
                    return -1;
                }
            }
        }
        return minimalTime;
    }
}
