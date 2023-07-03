package codingTest.mergeSort;

import java.io.*;

/**
 * 병합정렬
 */

public class MergeSort {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());


        int[] nums = new int[N];

        for (int i = 0; i < N; i++) {
            nums[i] = Integer.parseInt(br.readLine());
        }

        mergeSort(nums);



        for (int num : nums) {
            bw.write(num + "\n");
        }

        bw.flush();
        bw.close();
        br.close();

    }

    static void mergeSort(int[] array) {
        if (array == null || array.length <= 1) {
            return; // 배열이 비어있거나 원소가 하나 이하인 경우 정렬할 필요가 없으므로 종료
        }

        int[] tempArray = new int[array.length];
        mergeSort(array, tempArray, 0, array.length - 1);
    }

    static void mergeSort(int[] array, int[] tempArray, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2; // 중간 인덱스 계산

            mergeSort(array, tempArray, left, mid); // 왼쪽 부분 배열 정렬
            mergeSort(array, tempArray, mid + 1, right); // 오른쪽 부분 배열 정렬

            merge(array, tempArray, left, mid, right); // 정렬된 두 부분 배열 병합
        }
    }

    static void merge(int[] array, int[] tempArray, int left, int mid, int right) {
        // 두 부분 배열의 시작 인덱스 설정
        int leftStart = left;
        int rightStart = mid + 1;
        int tempIndex = left; // 임시 배열의 인덱스

        // 두 부분 배여을 비교하여 적은 값을 임시 배열에 병함
        while (leftStart <= mid && rightStart <= right) {
            if (array[leftStart] <= array[rightStart]) {
                tempArray[tempIndex] = array[leftStart];
                leftStart++;
            } else {
                tempArray[tempIndex] = array[rightStart];
                rightStart++;
            }
            tempIndex++;
        }
//         왼쪽 부분 배열의 나머지 원소를 임시 배열에 복사
        while (leftStart <= mid) {
            tempArray[tempIndex] = array[leftStart];
            leftStart++;
            tempIndex++;
        }

        // 오른쪽 부분 배열의 나머지 원소를 임시 배열에 복사
        while (rightStart <= right) {
            tempArray[tempIndex] = array[rightStart];
            rightStart++;
            tempIndex++;
        }

        // 임시 배열의 내용을 원래 배열에 복사
        for (int i = left; i <= right; i++) {
            array[i] = tempArray[i];
        }
    }
}

