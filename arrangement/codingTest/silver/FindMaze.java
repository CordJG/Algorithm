package codingTest.silver;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class FindMaze {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int M = scanner.nextInt();

        scanner.nextLine();

        int[][] maze = new int[N][M];
        for(int i=0; i< N; i++) {
            String[] line = scanner.nextLine().split("");
            for(int j=0; j<M; j++){
                maze[i][j] = Integer.parseInt(line[j]);
            }
        }
        scanner.close();

        int minimumCount = minimumNum(maze);
        System.out.println(minimumCount);

    }

    static int minimumNum(int[][] maze){
        int N = maze.length;
        int M = maze[0].length;
        Queue<int[]> queue = new LinkedList<>();
        boolean[][] check = new boolean[N][M];

        queue.add(new int[]{0, 0, 1});
        check[0][0] = true;

        int[][] directions = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};

        while(!queue.isEmpty()){
            int[] cur = queue.poll();
            int row = cur[0];
            int col = cur[1];
            int time = cur[2];

            if(row == N-1 && col == M-1) {
                return time;
            }

            for(int[] dir : directions) {
                int newRow = row + dir[0];
                int newCol = col + dir[1];

                if(newRow >=0 && newRow < N && newCol >=0 && newCol <M
                    && maze[newRow][newCol]==1 && check[newRow][newCol]==false){
                    queue.add(new int[]{newRow, newCol, time + 1});
                    check[newRow][newCol] = true;

                }
            }
        }
        throw new IllegalArgumentException("Destination is unreachable.");
    }
}
