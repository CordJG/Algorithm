package codingTest.silver.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class Bj2751 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] numbers = new int[N];

        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(br.readLine());
            if (!contains(numbers, i, num)) {
                numbers[i] = num;
            }
        }
        br.close();

        numbers = Arrays.copyOf(numbers, N); // 중복을 제거한 배열의 크기로 재조정
        quickSort(numbers, 0, numbers.length - 1);

        for (int num : numbers) {
            if (num != 0) {
                System.out.println(num);
            }

        }
    }

    private static boolean contains(int[] arr, int length, int target) {
        for (int i = 0; i < length; i++) {
            if (arr[i] == target) {
                return true;
            }
        }
        return false;
    }
    private static void quickSort(int[] arr, int left, int right) {
        if (left < right) {
            int pivot = partition(arr, left, right);
            quickSort(arr, left, pivot - 1);
            quickSort(arr, pivot + 1, right);
        }
    }

    private static int partition(int[] arr, int left, int right) {
        int pivot = arr[right];
        int i = left - 1;

        for (int j = left; j < right; j++) {
            if (arr[j] < pivot) {
                i++;
                swap(arr, i, j);
            }
        }

        swap(arr, i + 1, right);
        return i + 1;
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}

