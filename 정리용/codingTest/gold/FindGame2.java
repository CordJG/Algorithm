package codingTest.gold;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class FindGame2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();

        sc.close();

        int[] answer = findTimeAndNum(N, K);

        System.out.println(answer[0]);
        System.out.println(answer[1]);
    }

    static int[] findTimeAndNum(int N, int K) {
        Queue<int[]> queue = new LinkedList<>();
        boolean[] visited = new boolean[100001];

        queue.add(new int[]{N, 1});
        int[] directions = {1, -1};
        int[] answer = new int[]{0, 0};
        int minimumTime = -1;


        while (!queue.isEmpty()) {

            int[] cur = queue.poll();
            int num = cur[0];
            int time = cur[1];

            if(num==K){
                if(minimumTime == -1){
                    minimumTime =time;
                    answer[0]= time;
                }
                if(time==minimumTime){
                    answer[1]+=1;
                } else if (time > minimumTime) {
                    break;
                }
            }

                for (int dir : directions) {
                    int nextNum = num + dir;
                    if (nextNum >= 0 && nextNum <= 100000 && !visited[nextNum]) {
                        queue.add(new int[]{nextNum, time + 1});
                        visited[nextNum] = true;
                    }
                }

            int doubleNum = num*2;
                if (doubleNum <=100000 && !visited[doubleNum]) {
                    queue.add(new int[]{doubleNum, time + 1});
                    visited[doubleNum] = true;
                }
        }

        return answer;
    }
}
