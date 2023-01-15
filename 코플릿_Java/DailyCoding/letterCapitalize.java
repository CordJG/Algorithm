package 코플릿_Java.DailyCoding;
import java.util.*;


public class letterCapitalize {
    public static void main(String[] args) {

        String str = "i love  java";
        String a=String.valueOf(str.charAt(2)).toUpperCase();
        System.out.println(a);


        String[] str2 = str.split(" ");

        List<String> str3 = Arrays.asList(str2);
        Iterator<String> it = str3.iterator();
        String result ="";
        String word="";
        while(it.hasNext()) {
            String str4 = it.next();
            if (str4 != " ")
                for (int i = 1; i < str4.length(); i++) {
                    word += String.valueOf(str4.charAt(0)).toUpperCase() + str4.charAt(i);
                }
                    result += word + " ";

        }
        System.out.println(result);




//        for (int i = 0; i < str2.length; i++) {
//
//            String.valueOf(str2[i].charAt(0)).toUpperCase();
//
//            System.out.println(Arrays.toString(str2));
//
//        }
    }
}
