package 코플릿_Java.DailyCoding;
import java.util.*;
import java.util.stream.*;

public class powerSet {
    public static void main(String[] args) {
        Solution solution= new Solution();

        System.out.println(solution.play("abcd").size());

    }

}

class Solution{
    List<String> list = new ArrayList<>();


    StringBuilder result = new StringBuilder();

    ArrayList<String> play(String str){
        result.append("");

        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        str = new String(chars);


        for(int i=0; i<str.length(); i++) {
            result.append(str.charAt(i));
            list.add(result.toString());

            for (int m = i + 1; m < str.length(); m++) {
                for (int j = m; j < str.length(); j++) {
                        for (int k = j; k < str.length(); k++) {

                            if (result.charAt(result.length() - 1) != str.charAt(k)) {

                                result.append(str.charAt(k));
                                list.add(result.toString());
                                result.delete(result.length() - 1, result.length());
                                System.out.println(list);

                            }

                        }
                    if (result.charAt(result.length() - 1) != str.charAt(j)) {
                        result.append(str.charAt(j));

                    }


                    }
                result.delete(1, result.length());

                }
            result.delete(0, result.length());
            }

        list.add("");
        Stream<String> stream = list.stream();
        List<String> newList =stream.sorted()
                .distinct()
                .collect(Collectors.toList());

        ArrayList<String> arrList = new ArrayList<String>();
        arrList.addAll(newList);


        return arrList;
        }

    }


