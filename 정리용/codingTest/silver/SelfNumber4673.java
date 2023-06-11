package codingTest.silver;

import java.util.*;
public class SelfNumber4673 {
    public static void main(String[] args) {

        List<Integer> list = findSelfNum();
        for(int i=0; i<list.size(); i++) {
            System.out.println(list.get(i));
        }

    }

    static List<Integer> findSelfNum() {
        int[] arrNum = new int[100001];
        List<Integer> list = new ArrayList<>();

        for (int i = 1; i <= 10000; i++){
            list.add(i);
        }

        for (int i = 1; i <= 10000; i++) {


            String str = String.valueOf(i);
            int result = i;

            for (int j = 0; j < str.length(); j++) {
                result += Integer.parseInt(String.valueOf(str.charAt(j)));
            }

            if(result <= 10000) {
                list.remove(Integer.valueOf(result));
            }
        }

        return list;
    }
}
