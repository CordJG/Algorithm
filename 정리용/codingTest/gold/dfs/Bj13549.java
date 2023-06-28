package codingTest.gold.dfs;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;

public class Bj13549 {
    static int[] time = new int[100001];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int K = Integer.parseInt(input[1]);

        findMinTime(N, K);
    }


    static void findMinTime(int N, int K) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(N);
        time[N]=1;


        while (!queue.isEmpty()) {

            int curX = queue.poll();


            if (curX == K) {
                System.out.println(time[curX]);
                break;
            }

            int[] nextXs = {curX + 1, curX - 1, 2 * curX};

            for (int i = 0; i < 3; i++) {
                int nextX = nextXs[i];
                if (nextX >= 0 && nextX <= 100000 && time[nextX]==0) {
                    if (i == 2) {
                        queue.add(nextX);
                        time[nextX] = time[curX];
                    } else {
                        queue.add(nextX);
                        time[nextX] = time[curX]+1;
                    }
                }
            }
        }
    }
}
