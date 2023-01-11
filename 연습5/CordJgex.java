package 연습5;

public class CordJgex {

    public static int f(int n){
        if(n<=2) return 1;
        else{
            return f(n-1)+f(n-2);
        }
    }

    public static void main(String[] args) {
        System.out.println(f(40));
    }
}
