package 코플릿_Java.Greedy;

import java.sql.SQLOutput;
import java.util.Arrays;

public class Greedy3 {
    public static void main(String[] args) {
        int[][] board = {{0,0,0,0,0},{0,0,1,0,0},{0,0,0,0,0},{0,0,0,1,0},{0,0,0,0,0}};
        String operation="DDRRRUDUDUD";
        int length = board.length;

        int[] newBoard = new int[length*length];
        for(int i=0; i<length; i++) {
            for (int j = 0; j < length; j++) {
                newBoard[i * length + j] = board[i][j];
            }
        }
        System.out.println(Arrays.toString(newBoard));
            int n=0;
            Integer count=0;

            for(int i=0; i<operation.length(); i++){
                if(operation.charAt(i)=='L') n=n-1;
                else if(operation.charAt(i)=='R') n=n+1;
                else if(operation.charAt(i)=='U') n=n-length;
                else if(operation.charAt(i)=='D'){n=n+length;}
                if(n<0 || n>newBoard.length) break;
                count+=newBoard[n];

            }
        System.out.println(count);
        }
    }


