package codingTest.silver.bfs;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;

/**
 * 숨바꼭질 문제 bfs문제
 * 여기서 헷갈렸던 건 boolean타입인 visited의 범위를 어디로 잡느냐이었는데
 * 처음에는 end 로 했다가 아! start 가 더 클 수도 있구나?
 * 하면서 Math.max(start,end)로 했었는데
 * 이것도 문제인게 x2로 도착지점을 넘어선 지점에 도착한 뒤에 -1로 하는 게 더 빠를 수 있기 때문에
 * 그냥 문제에서 주어진 최대 범위값을 넣어줘야함!
 */
public class Bj1697 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int start = Integer.parseInt(input[0]);
        int end = Integer.parseInt(input[1]);

        int minTime = getMinTime(start, end);
        System.out.println(minTime);

    }

    static int getMinTime(int start, int end) {
        Queue<int[]> queue = new LinkedList<>();
        boolean[] visited = new boolean[100001];

        queue.add(new int[]{start, 0});
        visited[start]=true;

        int result =0;
        while (!queue.isEmpty()) {
            int[] cur = queue.poll();
            int curX = cur[0];
            int time = cur[1];

            int minTime = Integer.MAX_VALUE;
            if (curX == end) {
                minTime = Math.min(minTime, time);
                result = minTime;
            }

            int[] nextXs = {curX + 1, curX - 1, curX * 2};
            for (int nextX : nextXs) {

                if (nextX >= 0 && nextX <= 100000 && !visited[nextX]) {

                        queue.add(new int[]{nextX, time + 1});
                        visited[nextX] = true;

                }
            }
        }
        return result;
    }
}
