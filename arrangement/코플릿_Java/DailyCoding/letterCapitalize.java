package 코플릿_Java.DailyCoding;
import java.util.*;


public class letterCapitalize {
    public static void main(String[] args) {
        String str = "i love java  really ";
        String result ="";

        String[] str2 = str.split(" ");
        if(str2.length==0) str=result;
        else {
            System.out.println(Arrays.toString(str2));
            List<String> str3 = Arrays.asList(str2);
            Iterator<String> it = str3.iterator();

            String str4First = "";
            String str4Remain = "";
            while (it.hasNext()) {
                String str4 = it.next();

                if (str4.length() != 0) {
                    str4First = str4.substring(0, 1);
                    str4First = str4First.toUpperCase();
                    str4Remain = str4.substring(1);
                    str4 = str4First + str4Remain;
                }
                result += str4 + " ";

            }
        }
        result = result.substring(0, str.length());

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
