package 연습.Practice;

import java.util.Arrays;

public class Copy {
    public static void main(String[] args) {
        int[] CordJg = {1,2,3,4,5};
        int[] Cat = CordJg.clone();

        System.out.println(Arrays.toString(Cat));

        Cat[4]= 100;

        System.out.println(Arrays.toString(Cat));
        System.out.println(Arrays.toString(CordJg));
    }
}
