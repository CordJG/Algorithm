package codingTest.platinum;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Run16930 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] num = new int[3];

        String[] numLine = sc.nextLine().split(" ");
        for (int i = 0; i < 3; i++) {
            num[i] = Integer.parseInt(numLine[i]);
        }

        int N = num[0];
        int M = num[1];
        int K = num[2];


        char[][] maze = new char[N][M];


        for(int i=0; i<N; i++){
            String[] line = sc.nextLine().split("");
            for(int j=0; j<M; j++) {
                maze[i][j] = line[j].charAt(0);
            }
        }

        int[] xyNum = new int[4];

        String[] xyNumLine = sc.nextLine().split(" ");
        for (int i = 0; i < 4; i++) {
            xyNum[i] = Integer.parseInt(xyNumLine[i]);
        }
        int y1 = xyNum[0]-1;
        int x1 = xyNum[1]-1;
        int y2 = xyNum[2]-1;
        int x2 = xyNum[3]-1;


        sc.close();

        int[] A = {y1, x1};
        int[] B = {y2, x2};

        int minimalTime = findMinimalTime(maze, K, A, B);

        System.out.println(minimalTime);
    }

    static int findMinimalTime(char[][] maze,int K, int[] A, int[] B){
        int N = maze.length;
        int M = maze[0].length;
        int mintime =1000;

        Queue<int[]> queue = new LinkedList<>();
        boolean[][] visited = new boolean[N][M];

        int startCol = A[0];
        int startRow = A[1];
        int endCol = B[0];
        int endRow = B[1];

        int[] dirY = {0, 0, -1, 1};
        int[] dirX = {-1, 1, 0, 0};

        queue.add(new int[]{startCol, startRow, 0});

        while (!queue.isEmpty()) {
            int[] cur = queue.poll();
            int col = cur[0];
            int row = cur[1];
            int time = cur[2];

            if(col== endCol && row==endRow){

                mintime = Math.min(mintime, time);
            }


            for(int i=0; i<4; i++){

                    int newCol = col + dirY[i];
                    int newRow = row + dirX[i];
                    int count = 0;

                    while((newCol!=endCol || newRow != endRow) && newCol >= 0 && newCol < N && newRow >= 0 && newRow < M && maze[newCol][newRow] != '#' && count<K-1){

                        newCol += dirY[i];
                        newRow += dirX[i];
                        count++;
                    }
                    if(newCol < 0 || newCol >= N || newRow < 0 || newRow >= M || maze[newCol][newRow] == '#'){
                        newCol -= dirY[i];
                        newRow -= dirX[i];
                    }

                if(newCol >= 0 && newCol < N && newRow >= 0 && newRow < M && maze[newCol][newRow] != '#' && !visited[newCol][newRow]) {
                    queue.add(new int[]{newCol, newRow, time + 1});
                    visited[newCol][newRow] = true;
                }

                }
            }
          if(mintime==1000){
              return -1;
          }else{
              return mintime;
          }
        }
    }

