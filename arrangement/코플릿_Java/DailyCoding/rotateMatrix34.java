package 코플릿_Java.DailyCoding;

import java.util.Arrays;

public class rotateMatrix34 {
    public static void main(String[] args) {
        int[][] matrix = new int[][]{
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };

        int[][] rotatedMatrix = rotateMatrix(matrix,4);
        System.out.println(Arrays.deepToString(rotatedMatrix));
        System.out.println(rotatedMatrix[0][0]);

    }


    static int[][] rotateMatrix(int[][] matrix, int K){
        int M = matrix.length;
        int N = matrix[0].length;
        int[][] rotatedMatrix = matrix;

        if(matrix==null || matrix.length==0){
            return matrix;
        }

        for(int k = 0; k< K; k++) {
            int[][] tempMatrix = new int[M][N];
            for (int i = 0; i < M; i++) {
                for (int j = 0; j < N; j++) {
                    tempMatrix[j][N - 1 - i] = rotatedMatrix[i][j];

                }
            }
            rotatedMatrix = tempMatrix;

        }
        return  rotatedMatrix;
    }

}
