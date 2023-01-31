package 코플릿_Java.DailyCoding;

import java.util.*;

public class fibonacci {
    public static void main(String[] args) {
        Fibo fibo = new Fibo();

        int fiboNum= fibo.fibona(3);
        System.out.println(fiboNum);
    }
}

class Fibo{

    int fibona(int num){

        int[] arr = new int[1000];

        if(arr[num]!=0){
        }else{
            if(num==0) arr[num]=0;
            else if(num==1) arr[num]=1;
            else{
                arr[num] = fibona(num-1)+fibona(num-2);
            }
        }
        return arr[num];
    }
}

