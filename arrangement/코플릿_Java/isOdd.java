package 코플릿_Java;

public class isOdd {
    public static boolean f(int num) {


        if (num == 0) return false;
        if (num == 1) return true;

        if (num < 0)
            num = -num;

        if (num > 0) {
            return f(num - 2);
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(f(100));
    }
}


