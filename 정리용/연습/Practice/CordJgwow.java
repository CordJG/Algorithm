package 연습.Practice;

public class CordJgwow {
    public static void main(String[] args) {

        double n1 = 6.2;
        double n2 = 3.4;
        double result = n1/n2;

        double Number;

        Number = Math.round(result);
        System.out.println(Number);

        Number = Math.round(result * 1000) / 1000.0;
        System.out.println(Number);

    }
}
