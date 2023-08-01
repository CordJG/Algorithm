package 코플릿_Java.DailyCoding;

import java.util.Arrays;

public class quickSort {
    public static void main(String[] args) {
        int[] arr = new int[]{10,1,21,4,24,6,18};
        int[] sortedArr = sort(arr, 0, arr.length - 1);

        System.out.println(Arrays.toString(sortedArr));

    }
        static int[] sort ( int[] arr,int left, int right){
            if (left < right) {
                // 피벗 선택
                int pivotIndex = partition(arr, left, right);

                // 피벗을 기준으로 분할 및 정렬
                sort(arr, left, pivotIndex - 1);
                sort(arr, pivotIndex + 1, right);
            }
            return arr;
        }
        static int partition ( int[] arr, int left, int right){
            int pivot = arr[right]; // 마지막 요소를 피벗으로 선택
            int i = left - 1;

            for (int j = left; j < right; j++) {
                if (arr[j] < pivot) {
                    i++;
                    swap(arr, i, j);
                }
            }

            swap(arr, i + 1, right);
            return i + 1; // 피벗의 위치 반환
        }
        static void swap(int[] arr, int i, int j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }