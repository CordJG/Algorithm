package 연습.연습5;

public class BankRate {
    public static int f(double rate) {

        int n=1;

        while(Math.pow(1+rate/100, n)<=5){
            n++;
        }

        return n;

    }

    public static void main(String[] args) {
        System.out.println(f(5));
    }
}
