package codingTest.silver;

import java.util.*;


public class Bj1743 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int K = sc.nextInt();

        sc.nextLine();

        int[][] arr = new int[N][M];
        for(int i=0; i<N; i++){
            Arrays.fill(arr[i], 0);
        }

        for(int i=0; i<K; i++){
            String[] line = sc.nextLine().split(" ");
            int y = Integer.parseInt(line[0])-1;
            int x = Integer.parseInt(line[1])-1;
            arr[y][x] = 1;
            }

        int MaxNum = findMaxTrash(arr);

        System.out.println(MaxNum);

        }


        static int findMaxTrash(int[][] arr){
            int N = arr.length;
            int M = arr[0].length;
            int MaxNum =0;

            Queue<int[]> queue = new LinkedList<>();
            boolean[][] visited = new boolean[N][M];
            int[][] directions = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};

            for(int i=0; i<N; i++ ){
                for(int j=0; j<M; j++){
                    int num =0;
                    if(arr[i][j]==1 && !visited[i][j]){
                        queue.add(new int[]{i, j,1});
                        num +=1;
                        if (MaxNum < num) {
                            MaxNum = num;
                        }
                        visited[i][j]=true;
                    }

                    while(!queue.isEmpty()){
                        int[] cur = queue.poll();
                        int col = cur[0];
                        int row = cur[1];
                        int count = cur[2];

                        for (int[] dir : directions) {
                            int newCol = col + dir[0];
                            int newRow = row + dir[1];


                            if(newCol>=0 && newCol <N && newRow>=0 && newRow<M && arr[newCol][newRow]==1 && !visited[newCol][newRow]){
                                queue.add(new int[]{newCol, newRow,count+1});
                                num+=1;
                                if (MaxNum < num) {
                                    MaxNum = num;
                                }
                                visited[newCol][newRow]=true;

                            }
                        }
                    }
                }
            }
            return MaxNum;
    }
}
