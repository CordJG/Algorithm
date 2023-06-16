package codingTest.silver;
import java.util.*;
public class Bj1018 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        String[][] board = new String[N][M];

        sc.nextLine();

        for (int i = 0; i < N; i++) {
            String[] line = sc.nextLine().split("");
            for (int j = 0; j < M; j++) {
                board[i][j] = line[j];
            }
        }
        int result = getNum(board);
        System.out.println(result);
    }

    static int getNum(String[][] board) {

        String[][][] boards = getBoards(board);

        int result =Integer.MAX_VALUE;

        for (String[][] b : boards) {
            Queue<int[]> queue = new LinkedList<>();
            boolean[][] visited = new boolean[8][8];
            int[][] directions = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};

            queue.add(new int[]{0, 0});
            visited[0][0]=true;

            int minCount = Integer.MAX_VALUE;
            int count =0;


            while (!queue.isEmpty()) {
                int[] cur = queue.poll();
                int col = cur[0];
                int row = cur[1];

                int bCount =0;
                int wCount =0;

                if (col == 7  && row == 7 ) {
                    if (minCount > count) {
                        minCount = count;
                    }
                }

                if (b[col][row].equals("B")) {
                    bCount++;
                }else{
                    wCount++;
                }
                for (int[] dir : directions) {
                    int newCol = col + dir[0];
                    int newRow = row + dir[1];


                    if (newCol >= 0 && newCol < 8 && newRow >= 0 && newRow < 8) {
                        if (b[newCol][newRow].equals("B")) {
                            bCount++;
                        } else {
                            wCount++;
                        }
                    }
                }
                if(bCount>wCount){
                    if (!b[col][row].equals("W") ) {
                        b[col][row] = "W";
                        count++;
                    }
                    for (int[] dir : directions) {
                        int newCol = col + dir[0];
                        int newRow = row + dir[1];

                        if (newCol >= 0 && newCol < 8  && newRow >= 0 && newRow < 8 &&!visited[newCol][newRow]) {

                                if (!b[newCol][newRow].equals("B")) {
                                    b[newCol][newRow] = "B";
                                    count++;
                                }
                                queue.add(new int[]{newCol, newRow});
                                visited[newCol][newRow] = true;

                        }
                    }
                }else{
                    if (!b[col][row].equals("B")) {
                        b[col][row] = "B";
                        count++;
                    }
                    for (int[] dir : directions) {
                        int newCol = col + dir[0];
                        int newRow = row + dir[1];

                        if (newCol >= 0 && newCol < 8 && newRow >=0 && newRow < 8 ) {
                            if (!visited[newCol][newRow]) {
                                if (!b[newCol][newRow].equals("W")) {
                                    b[newCol][newRow] = "W";
                                    count++;
                                }
                                queue.add(new int[]{newCol, newRow});
                                visited[newCol][newRow] = true;
                            }
                        }
                    }

                }


            }
            if(result>minCount){
                result = minCount;
            }
        }
        return result;
    }

    static String[][][] getBoards(String[][] board) {
        int N = board.length;
        int M = board[0].length;
        int K = (N - 8) * (M - 8);

        String[][][] boards = new String[K][8][8];

        for (int i = 0; i < K; i++) {

            for (int j = 0; j < 8; j++) {
                for (int m = 0; m < 8; m++) {
                    boards[i][j][m] = board[j+i/(M-8)][m+i/(N-8)];
                }
            }
        }
        return boards;
    }
}
