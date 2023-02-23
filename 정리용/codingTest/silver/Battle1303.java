package codingTest.silver;

import java.security.BasicPermission;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Battle1303 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int M = sc.nextInt();
        int N = sc.nextInt();
        sc.nextLine();
        char[][] arr = new char[N][M];


        for (int i = 0; i < N; i++) {
            String str =sc.nextLine().replaceAll("\\\"", "");
            for (int j = 0; j < M; j++) {
                if (str.length() == 0) {
                } else {
                    arr[i][j] = str.charAt(j);
                }
            }
        }

        int bPower = 0;
        int wPower = 0;
        for (int x = 0; x < N; x++) {
            for (int y = 0; y < M; y++) {

                int count = 1;

                int n1 = x + 1;
                int n2 = x - 1;
                int n3 = y + 1;
                int n4 = y - 1;

                if (n1 > N - 1) n1 = x;
                if (n2 < 0) n2 = x;
                if (n3 > M - 1) n3 = y;
                if (n4 < 0) n4 = y;


                if (arr[n1][y] == arr[x][y]) {
                    count++;
                    if (n1 == x) count--;
                }

                if (arr[n2][y] == arr[x][y]) {
                    count++;
                    if (n2 == x) count--;
                }

                if (arr[x][n3] == arr[x][y]) {
                    count++;
                    if (n3 == y) count--;
                }

                if (arr[x][n4] == arr[x][y]) {
                    count++;
                    if (n4 == y) count--;
                }


                if (arr[x][y] == 'B') {
                    bPower += count * count;
                } else if (arr[x][y] == 'W') {
                    wPower += count * count;
                }



            }
        }

        System.out.println(wPower + " " + bPower);

    }
}

