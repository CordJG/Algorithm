package 코플릿_Java.DailyCoding;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.*;

public class numberSearch {
    public static void main(String[] args) {

        String str = "Hello6 9World 2,";

        String intStr = str.replaceAll("[^0-9]", "");

        String str2 = str.replaceAll(" ","");
        String str3 = str2.replaceAll("[0-9]","");
        System.out.println(str3);

        System.out.println(intStr);

        int[] numbers = new int[intStr.length()];
        for(int i=0; i<intStr.length(); i++){
            numbers[i] = Integer.parseInt(String.valueOf(intStr.charAt(i)));
        }

        System.out.println();

        List<Integer> list = new ArrayList<>();
        for(int i=0; i<intStr.length(); i++){
            list.add(Integer.parseInt(String.valueOf(intStr.charAt(i))));
        }

        System.out.println(list);

        Iterator<Integer> it = list.iterator();
        double sum=0;
        while(it.hasNext()){
            int num=it.next();
            sum+=num;
        }
        System.out.println(sum);
        int result = (int) Math.round(sum/str3.length());
        System.out.println(result);

    }
}
