package 코플릿_Java.DailyCoding;
import java.sql.SQLOutput;
import java.util.*;
import java.util.stream.IntStream;

public class removeExtremes {
    public static void main(String[] args) {
        String[] arr = {"abcc","cdddd","defadawdw","ab"};

        List<String> list = new ArrayList<>();
        for(int i=arr.length-1; i>=0; i--){
            list.add(arr[i]);
        }

        int maxNum=0;
        int minNum=arr[0].length();
        for(int i=0; i<arr.length; i++){
            if(maxNum<arr[i].length()){
                maxNum=arr[i].length();
            }
            if(minNum>arr[i].length()){
                minNum=arr[i].length();
            }
        }
        System.out.println(maxNum);
        System.out.println(minNum);

        Iterator<String> it = list.iterator();

        while(it.hasNext()) {
            String str = it.next();
            if (str.length() == minNum) {
                it.remove();
                break;
            }
        }
        System.out.println(list);

        while(it.hasNext()) {
            String str = it.next();
            if (str.length() == maxNum) {
                it.remove();
                break;
            }

        }

        Collections.reverse(list);
        System.out.println(list);

        String[] arr2 = new String[list.size()];
        list.toArray(arr2);

        System.out.println(Arrays.toString(arr2));
    }
}
