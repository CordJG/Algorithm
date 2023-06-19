package codingTest.gold;


import java.util.*;
public class Bj1107 {
    static boolean[] button = new boolean[10]; // 고장난 버튼 체크 배열
    public static void main(String[] args)   {
        Scanner sc = new Scanner((System.in));

        int N = sc.nextInt(); // 이동하려는 채널

        int M = sc.nextInt(); // 고장난 버튼 개수

        for (int i = 0; i < M; i++) {
            int broken = sc.nextInt();// 고장난 버튼
            button[broken] = true;
        }

        // 초기값은 100번에서 + 또는 - 버튼으로 이동하는 횟수
        int answer = Math.abs(N - 100);//

        // 0부터 1,000,000까지의 모든 숫자를 탐색하면서
        // 해당 숫자로 이동 가능한지 체크하고, 가능하다면 최소 이동 횟수를 갱신
        for (int i = 1000000; i >= 0; i--) {
            if (M == 10 ) {
                break;
            }
            int c = i;
            int len = possible(c); // 숫자 c로 이동 가능한지 체크
            if (len > 0) {
                int press = Math.abs(N - c); // 숫자 c에서 N으로 + 또는 - 버튼으로 이동하는 횟수
                if (answer > len + press) {
                    answer = len + press; // 최소 이동 횟수 갱신
                }
            }
        }

        System.out.println(answer);

    }

    // 숫자 c로 이동 가능한지 체크하는 함수
    public static int possible(int c) {
        if (c == 0) {
            if (button[0]) {
                return 0; // 0버튼이 고장났을 경우 이동 불가능
            } else {
                return 1; // 0버튼이 정상적으로 동작하므로 이동 가능
            }
        }

        int len = 0;
        while (c > 0) {
            if (button[c % 10]) {
                return 0; // 고장난 버튼이 있으면 이동 불가능
            }
            len += 1; // 버튼을 누르는 횟수 증가
            c /= 10; // 다음 자릿수로 이동
        }

        return len; // 이동 가능한 버튼을 모두 누른 횟수 반환
    }

    static int getN(int c) {

        while (c > 10) {
            c /= 10;
        }
        return c;
    }
}