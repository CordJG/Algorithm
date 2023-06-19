package codingTest.gold.deque;
import java.util.*;
public class Bj5430Answer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt(); // 테스트 케이스 개수

        for (int i = 0; i < t; i++) {
            String functions = scanner.next(); // 수행할 함수
            int n = scanner.nextInt(); // 배열의 길이
            Deque<Integer> deque = new LinkedList<>();

            boolean reverse = false;
            boolean error = false;

            // 배열 초기화
            String input = scanner.next();
            input = input.substring(1, input.length() - 1); // 대괄호 제거
            if(!input.equals("")) {
                String[] nums = input.split(",");

                for (String num : nums) {
                    deque.addLast(Integer.parseInt(num.trim()));
                }
            }

            // 함수 수행


            for (char function : functions.toCharArray()) {
                if (function == 'R') {
                    reverse = !reverse;
                } else if (function == 'D') {
                    if (deque.isEmpty()) {
                        error = true;
                        break;
                    }
                    if (reverse) {
                        deque.removeLast();
                    } else {
                        deque.removeFirst();
                    }
                }
            }

            // 결과 출력
            if (error) {
                System.out.println("error");
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("[");
                if (!deque.isEmpty()) {
                    if (reverse) {
                        while (deque.size() > 1) {
                            sb.append(deque.removeLast()).append(",");
                        }
                        sb.append(deque.removeLast());
                    } else {
                        while (deque.size() > 1) {
                            sb.append(deque.removeFirst()).append(",");
                        }
                        sb.append(deque.removeFirst());
                    }
                }
                sb.append("]");
                System.out.println(sb.toString());
            }
        }
    }
}

