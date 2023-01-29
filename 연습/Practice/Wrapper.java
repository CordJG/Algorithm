package 연습.Practice;

public class Wrapper {
    public static void main(String[] args) {

        boolean a ;
        Integer num1 = new Integer(43);
        Integer num2 = new Integer("43");

        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num1+num2);
        int iNum1 = 43;
        int iNum2 = 43;
        //System.out.println(iNum1.compareTo(iNum2));   //-> 오류뜸
        System.out.println(num1.compareTo(num2));
        a= (num2==num1);
        System.out.println(a);

        Integer n1 = 4561;
        Integer n2 = 4561;
        if(n1==n2)
        System.out.println("헤헤");
    }
}
