package Algorithm;

import java.util.Arrays;

public class SelectionSort {

    /**
     * Swapping the values at positions i and j (Exchanging the values of array[j], which is the smallest value, and array[i])
     */
    public static void swapElements(int[] array , int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;

    }

    /**
     * Find the position of the minimum value starting from "start" (including start)
     *  go up to the last position of the array.
     */

    public static int indexLowest(int[] array, int start) {
        int lowIndex = start;
        for (int i = start; i < array.length; i++) {
            if (array[i] < array[lowIndex]) {
                lowIndex = i;
            }
        }
        return lowIndex;
    }

    /**
     * Sort the elements using the selection sort algorithm.
     */

    public static void selectionSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int j = indexLowest(array, i);
            swapElements(array, i, j);
        }
    }



    public static void main(String[] args) {
        int[] array = {10, 5, 7, 9, 1, 8, 2, 100, 42, 26, 32, 8, 11};
        selectionSort(array);
        System.out.println(Arrays.toString(array));

    }

    /**
     *     Result [1, 2, 5, 7, 8, 8, 9, 10, 11, 26, 32, 42, 100]
     */
}
