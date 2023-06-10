package codingTest.platinum;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Run16930 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int N = sc.nextInt();
        int M = sc.nextInt();
        int K = sc.nextInt();


        char[][] maze = new char[N][M];

        sc.nextLine();

        for(int i=0; i<N; i++){
            String[] line = sc.nextLine().split("");
            for(int j=0; j<M; j++) {
                maze[i][j] = line[j].charAt(0);
            }
        }


        int x1 = sc.nextInt()-1;
        int y1 = sc.nextInt()-1;
        int x2 = sc.nextInt()-1;
        int y2 = sc.nextInt()-1;

        sc.close();

        int[] A = {x1, y1};
        int[] B = {x2, y2};

        int minimalTime = findMinimalTime(maze, K, A, B);

        System.out.println(minimalTime);
    }

    static int findMinimalTime(char[][] maze,int K, int[] A, int[] B){
        int N = maze.length;
        int M = maze[0].length;


        Queue<int[]> queue = new LinkedList<>();
        boolean[][] visited = new boolean[N][M];

        int startCol = A[0];
        int startRow = A[1];
        int endCol = B[0];
        int endRow = B[1];

        int[] directionCol = {0, 0, -1, 1};
        int[] directionRow = {-1, 1, 0, 0};

        queue.add(new int[]{startCol, startRow, 0});

        while (!queue.isEmpty()) {
            int[] cur = queue.poll();
            int col = cur[0];
            int row = cur[1];
            int time = cur[2];


            if (col == endCol && row == endRow) {
                return time;
            }


            for(int i=0; i<4; i++){
                for(int j=1; j<=K; j++){
                    int newCol = col + directionCol[i] * j;
                    int newRow = row + directionRow[i] * j;

                    if(newCol<0 || newCol>=N || newRow<0 || newRow>=M || maze[newCol][newRow]=='#'|| visited[newCol][newRow]){
                        break;
                    } else if(newCol>=0 && newCol<N && newRow>=0 && newRow<M && maze[newCol][newRow]=='.'&& !visited[newCol][newRow]){
                        queue.add(new int[]{newCol, newRow, time + 1});
                        visited[newCol][newRow] = true;
                    }
                }
                }
            }
          return -1;
        }
    }

