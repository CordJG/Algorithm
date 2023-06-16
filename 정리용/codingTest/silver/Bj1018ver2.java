package codingTest.silver;

import java.util.*;
public class Bj1018ver2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        scanner.nextLine(); // 개행 문자 제거

        char[][] board = new char[N][M];
        for (int i = 0; i < N; i++) {
            String row = scanner.nextLine();
            board[i] = row.toCharArray();
        }

        int minCount = Integer.MAX_VALUE;

        for (int i = 0; i <= N - 8; i++) {
            for (int j = 0; j <= M - 8; j++) {
                int count = calculateMinCount(board, i, j);
                minCount = Math.min(minCount, count);
            }
        }

        System.out.println(minCount);
    }

    private static int calculateMinCount(char[][] board, int startRow, int startCol) {
        int count = 0;
        char startColor = board[startRow][startCol];

        for (int i = startRow; i < startRow + 8; i++) {
            for (int j = startCol; j < startCol + 8; j++) {
                if (board[i][j] != startColor) {
                    count++;
                }
                startColor = (startColor == 'W') ? 'B' : 'W';
            }
            startColor = (startColor == 'W') ? 'B' : 'W'; // 행이 바뀔 때 시작 색깔 변경
        }

        return Math.min(count, 64 - count);
    }
}
