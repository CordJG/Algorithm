package 코플릿_Java.DailyCoding;

import java.util.*;

public class fibonacci {
    public static void main(String[] args) {
        Fibo fibo = new Fibo();

        int fiboNum= fibo.fibona(9);
        System.out.println(fiboNum);
    }
}
class Fibo{

    int x=0;
    int y=1;

    int fibona(int num){

        if(num==0) return 0;
        if(num==1) return 1;

        int sumNum= x+y;
        x=y;
        y=sumNum;
        if(num==2) return sumNum;

        num=num-1;



        return fibona(num);
    }
}