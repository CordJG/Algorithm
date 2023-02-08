package 연습.Practice;

public class TimeComplexity {
    public static void main(String[] args) {


        O5 o5 = new O5();

        int num = o5.fibo(10);
        System.out.println(num);

    }
}

class O5{

    int x = 0;
    int y = 1;
    int sumNum =0;
    int fibo(int num) {

        if(num==0) return 0;
        if(num==1) return 1;

        for(int i=0; i<=num-2; i++) {
            sumNum = x + y;

            x = y;
            y = sumNum;
        }
        return sumNum ;
    }
}

