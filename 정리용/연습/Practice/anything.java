package 연습.Practice;

import java.util.*;

public class anything {
    static int[] a = new int[]{};

    public static void main(String[] args) {

        System.out.println(Arrays.toString(CordJg(2,a)));

    }
    public static int[] CordJg(int coin,int[] b){
        int[] concatArray = new int[0];

        if(coin==0){

            return concatArray;

        }


        for(int i = 0; i < 3; i++) {

            int number = i;


            concatArray = Arrays.copyOf(b, b.length + 1);
            concatArray[concatArray.length - 1] = number;

            System.out.println(Arrays.toString(concatArray));



            CordJg(coin - 1, concatArray);


        }
        return concatArray;
    }
}


