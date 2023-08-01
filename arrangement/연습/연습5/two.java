package 연습.연습5;

public class two {
    public static void main(String[] args) {
        int i=0;
        int n;
        long num= 64;
        int count=0;

        while(true){

            double num2= Math.pow(2,i);
            if(num==num2) count++;

            if(num<num2) break;
            i++;
        }

        if(count==1) System.out.println(num);
        else System.out.println("2의 거듭제곱이 아닙니다");

    }
}




