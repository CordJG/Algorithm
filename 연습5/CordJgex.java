package 연습5;

public class CordJgex {

    public static int f(int n){
        if(n<=2) return 1;
        else{
            return f(n-1)+f(n-2);
        }
    }

    public static int f2(int n) {
        int num1 = 1;
        int num2 = 1;
        int sumNum = 1;

        for (int i = 1; i <= n; i++) {
            if (i <= 2) sumNum = 1;
            else {
                num1 = num2;
                num2 = sumNum;
                sumNum = num1 + num2;

            }

        }
        return sumNum;
    }


    public static void main(String[] args) {
        System.out.println(f(30));
        System.out.println(f2(30));
    }
}
