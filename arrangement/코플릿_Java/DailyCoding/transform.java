package 코플릿_Java.DailyCoding;
import java.util.*;

public class transform {
    public static HashMap<String, String> f(String x) {


        HashMap<String, String> map = new HashMap<>();
        String[] arr = new String[]{"고양이", "강아지", "귀여워", x};

        for (int i = 0; i < arr.length/2 ; i++) {
            map.put(arr[i], arr[arr.length - i - 1]);
        }
        Set<String> keySet = map.keySet();
        Iterator<String> keyIterator = keySet.iterator();
        while (keyIterator.hasNext()) {
            String key = keyIterator.next();
            String value = map.get(key);
            System.out.println(key + " : " + value);

        }
        return map;
    }
        public static void main (String[]args){
            System.out.println(f("짱귀여워"));
            }

        }




