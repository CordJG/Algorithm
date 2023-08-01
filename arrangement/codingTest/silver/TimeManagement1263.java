package codingTest.silver;

import java.util.*;

public class TimeManagement1263 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] times = new int[n][2];
        for (int i = 0; i < n; i++) {
            times[i][0] = sc.nextInt(); // 업무를 끝내야 하는 시간
            times[i][1] = sc.nextInt(); // 업무를 수행하는데 필요한 시간
        }
        Arrays.sort(times, new Comparator<int[]>() { // 업무를 끝내야 하는 시간 기준으로 정렬
            public int compare(int[] a, int[] b) {
                return b[0] - a[0];
            }
        });
        int end = times[0][0] - times[0][1]; // 첫 번째 업무의 시작 시간
        for (int i = 1; i < n; i++) {
            int curEnd = times[i][0] - times[i][1]; // 현재 업무를 시작할 수 있는 가장 늦은 시간
            end = Math.min(end, curEnd); // 시작 시간 갱신
        }
        System.out.println(end >= 0 ? end : -1); // 결과 출력
    }
}