package 코플릿_Java.DailyCoding;

import java.util.Arrays;
import java.util.HashMap;
import java.util.*;
import java.util.Map.Entry;

public class converListToObject {
    public static void main(String[] args) {

        String[][] arr = new String[][]{{"1","2"}, {}, {"5","6"}};
        String[] str = new String[arr.length * arr[0].length];
        System.out.println(str.length);

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                str[arr[i].length * i + j] = arr[i][j];

            }
        }

        System.out.println(Arrays.toString(str));

        HashMap<String, String> map = new HashMap<>();
        for (int i = 0; i < str.length; i += 2) {
            map.put(str[i], str[i + 1]);
        }

        System.out.println(map);

        Set set = map.entrySet();
        Iterator iterator=set.iterator();
        while(iterator.hasNext()){
            Entry<String,String> entry = (Entry) iterator.next();
            String key = (String)entry.getKey();
            String value = (String) entry.getValue();
            System.out.println(key);
            System.out.println(value);
        }
    }
}
