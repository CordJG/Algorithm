package 코플릿_Java.DailyCoding;

import java.util.*;

public class fibonacci {
    public static void main(String[] args) {

        // f(n) = f(n-1)+f(n-2);
        // f(1) = 1
        // f(0) = 0



    }
}

class any{
    List<Integer> list = new ArrayList<>();


    int fibona(int num){
        list.add(0);
        list.add(1);
        if(num==0) return 0;
        if(num==1) return 1;

        return fibona(num-1)+fibona(num-2);

    }
}
