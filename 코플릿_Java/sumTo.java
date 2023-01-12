package 코플릿_Java;

public class sumTo {
    public static int f(int num){
        if(num==1) return 1;
        else{

            return f(num-1)+num;

        }

    }
    public static void main(String[] args) {
        System.out.println(f(5));
    }
}
