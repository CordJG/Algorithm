package 연습5;

public class Factorial {

    public static int f(int num){
        if(num==1) return 1;
        else {
            return num*f(num-1);
        }
    }

    public static void main(String[] args) {
        System.out.println("10 팩토리얼의 값은 " +f(10)+ " 이다");
    }
}
