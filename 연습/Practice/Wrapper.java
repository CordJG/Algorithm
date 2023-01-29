package 연습.Practice;
import java.util.*;

public class Wrapper {
    public static void main(String[] args) {


        String str ="3";

        Integer num = new Integer(str);

        Integer n1 = Integer.parseInt(str);
        int n2 = Integer.valueOf(str);

        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n1+n2);

    }
}
