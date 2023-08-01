package 연습.Practice;

import java.util.Arrays;

public class CordJgToCharArray {
    public static void main(String[] args) {

        String str = "CordJg Cat Hungry";
        char[] charArr = str.toCharArray();
        System.out.println(Arrays.toString(charArr));

        String str2 = new String(charArr);
        System.out.println(str2);

        String[] str3 = {"abc","dfd","dada"};
        String str4 = new String(Arrays.toString(str3));
        System.out.println(str4);

        System.out.println(str4+str2);
        String str5 ="baby";
        System.out.println(str2+str5);

        System.out.println(str4.charAt(0));

    }
}
