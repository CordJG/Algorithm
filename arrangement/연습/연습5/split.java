package 연습.연습5;

import java.util.Arrays;

public class split {
    public static void main(String[] args) {

        String str = "cat dog monkey";
        String[] strSplit = str.split(" ");

        System.out.println(Arrays.toString(strSplit));
        int i=0;
        while(i< strSplit.length) {
            System.out.println(strSplit[i]);
            i++;
        }
    }
}
