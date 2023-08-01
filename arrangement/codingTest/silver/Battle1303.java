package codingTest.silver;


import java.util.*;

public class Battle1303 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int M = sc.nextInt();
        int N = sc.nextInt();
        sc.nextLine();
        String[][] arr = new String[N][M];


        for (int i = 0; i < N; i++) {
            String[] line = sc.nextLine().split("");
            for (int j = 0; j < M; j++) {
               arr[i][j] = line[j];
            }
        }
        int[] power = getPower(arr);
        int wPower = power[0];
        int bPower = power[1];

        System.out.println(wPower);
        System.out.println(bPower);

    }
    static int[] getPower(String[][] arr){
        int N = arr.length;
        int M = arr[0].length;

        int wPower=0;
        int bPower=0;

        Queue<int[]> queue = new LinkedList<>();
        boolean[][] visited = new boolean[N][M];
        int[][] directions = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};

        for(int i=0; i<N ; i++) {
            for(int j=0; j<M; j++){
                int wBigestPower=0;
                int bBigestPower=0;
                if(!visited[i][j]) {
                    queue.add(new int[]{i, j});
                    if(arr[i][j].equals("W")) {
                        wBigestPower +=1;
                    }else{
                        bBigestPower +=1;
                    }
                    visited[i][j] = true;
                }
                while (!queue.isEmpty()) {
                    int[] cur = queue.poll();
                    int col = cur[0];
                    int row = cur[1];


                    for (int[] dir : directions) {
                        int newCol = col + dir[0];
                        int newRow = row + dir[1];


                        if (newCol >= 0 && newCol < N && newRow >= 0 && newRow < M && arr[col][row].equals(arr[newCol][newRow])&& !visited[newCol][newRow]) {
                            queue.add(new int[]{newCol, newRow});
                            if(arr[newCol][newRow].equals("W")) {
                                wBigestPower +=1;
                            }else{
                                bBigestPower +=1;
                            }
                            visited[newCol][newRow]=true;
                        }
                    }
                }
                wPower += wBigestPower * wBigestPower;
                bPower += bBigestPower * bBigestPower;
            }
        }

        int[] power = new int[]{wPower, bPower};
        return power;
    }
}

