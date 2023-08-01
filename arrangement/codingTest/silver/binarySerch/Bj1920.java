package codingTest.silver.binarySerch;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Bj1920 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        String[] line = br.readLine().split(" ");
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(line[i]);
        }

        Arrays.sort(arr);

        int M = Integer.parseInt(br.readLine());

        line = br.readLine().split(" ");
        for (int i = 0; i < M; i++) {
            int target = Integer.parseInt(line[i]);
            int result = binarySearch(arr, target);

            System.out.println(result);

        }
    }

    static int binarySearch(int[] arr,int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (arr[mid] == target) {
                return 1; // 타겟을 찾았으므로 1 반환
            } else if (arr[mid] < target) {
                left = mid + 1; // 중간값보다 타겟이 크면 오른쪽 영역으로 탐색 범위 좁힘
            } else {
                right = mid - 1; // 중간값보다 타겟이 작으면 왼쪽 영역으로 탐색 범위 좁힘
            }
        }

        return 0; // 타겟을 찾지 못했으므로 0 반환
    }
}