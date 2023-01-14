package 코플릿_Java.DailyCoding;
import java.util.*;

public class firstCharacter {
    public static void main(String[] args) {

        String str = "cat dog monkey";
        String[] splitStr = str.split(" ");
        String str1 = splitStr[0];
//        System.out.println(Arrays.toString(splitStr));
//        System.out.println(str1);
        int i=0;
        String str2 ="";
        String result="" ;
        while(i<splitStr.length){

            result +=String.valueOf(splitStr[i].charAt(0));
            System.out.println(str2);
            i++;

        }
        System.out.println(result);





    }

}
