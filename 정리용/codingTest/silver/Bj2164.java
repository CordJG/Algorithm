package codingTest.silver;

import java.util.*;

/**
 * Queue 문제 카드2
 */
public class Bj2164 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        Queue<Integer> queue = new LinkedList<>();

        // 카드 번호를 큐에 넣기
        for (int i = 1; i <= N; i++) {
            queue.offer(i);
        }

        while (queue.size() > 1) {
            // 제일 위에 있는 카드를 버림
            queue.poll();

            // 제일 위에 있는 카드를 제일 아래로 옮김
            int card = queue.poll();
            queue.offer(card);
        }

        // 마지막에 남은 카드 번호 출력
        System.out.println(queue.peek());
    }
}