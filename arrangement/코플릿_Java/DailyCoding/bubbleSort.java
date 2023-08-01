package 코플릿_Java.DailyCoding;

import java.util.Arrays;

public class bubbleSort {
    public static void main(String[] args) {

        int[] arr = {1042,1000,800,762,482,142,133,489,127,48,59,1050,130,48,20,19,2000,5};

        int count=0;
        int count2=0;
        while (true) {

            count++;


            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    int bigNum = arr[i];
                    int smallNum = arr[i + 1];
                    arr[i + 1] = bigNum;
                    arr[i] = smallNum;
                    count2++;
                }
            }
            if(count2==0) break;
            if(count==arr.length) break;
        }

        System.out.println(Arrays.toString(arr));
    }
}
