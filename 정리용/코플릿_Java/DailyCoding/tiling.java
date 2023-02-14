package 코플릿_Java.DailyCoding;

import java.util.Arrays;

public class tiling {
    public static void main(String[] args) {

        CordJg cordJg = new CordJg();
        int n = cordJg.play(15);
        System.out.println(n);


    }
}

class CordJg {
    int x = 1;
    int y = 2;
    int sum =0;
    int play(int num) {

        if(num==1) return 1;
        if(num==2) return 2;
        for(int i=1; i<=num-2; i++) {
            sum = x + y;

            x = y;
            y = sum;
        }

        return sum ;
    }
}
