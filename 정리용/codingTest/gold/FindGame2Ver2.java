package codingTest.gold;

import java.util.*;

public class FindGame2Ver2 {
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
        int[] distance = new int[100001];
        int[] count = new int[100001];
        Arrays.fill(distance, -1);
        distance[N] = 0;
        count[N] = 1;

        Queue<Integer> queue = new LinkedList<>();
        queue.offer(N);

        while (!queue.isEmpty()) {
            int current = queue.poll();

            if(current == K){
                break;
            }

            for (int next : new int[]{current - 1, current + 1, current * 2}) {
                if (next >= 0 && next <= 100000) {
                    if (distance[next] == -1) { // 아직 방문하지 않은 위치라면
                        queue.offer(next);
                        distance[next] = distance[current] + 1;
                        count[next] = count[current];
                    } else if (distance[next] == distance[current] + 1) { // 이미 방문한 위치이며 최단 경로로 도달한 경우
                        count[next] += count[current];
                    }
                }
            }
        }

        return new int[]{distance[K], count[K]};
    }
}
