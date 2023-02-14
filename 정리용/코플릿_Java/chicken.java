package 코플릿_Java;
import java.util.*;
public class chicken {
    public static void main(String[] args) {

        int[] stuffArr = {1, 10, 11000, 1111};

        List<Integer> list = new ArrayList<>(0);
        for (int i = 0; i < stuffArr.length; i++) {
            list.add(stuffArr[i]);
        }
        int choiceNum = 2;
        int count = 0;

        for (int i = 0; i < list.size(); i++) {
            String str = Integer.toString(list.get(i));
            char[] chars = str.toCharArray();
            for (int j = 0; j < chars.length; j++) {
                if (chars[j] == '0') {
                    count++;
                }
            }
            if (count >= 3) {
                list.remove(i);
            }
            count = 0;
        }
        System.out.println(list);
        //조합할 수 있는 경우의 수
        //list(size)p choiceNum
        //이것도 재귀네...
        //...흠
        //빈 배열을만들고 +해주면서
        //빈배열에 list값을넣어줌

        Integer[] arr = {};
        ArrayList<Integer[]> IntList = new ArrayList<>();
        Integer[] arr2 = new Integer[0];
        for (int i = 0; i < list.size(); i++) {
            int a = list.get(i);
            arr2 = Arrays.copyOf(arr, arr.length + 1);
            arr2[arr.length] = a;
        }
        System.out.println(Arrays.toString(arr2));
    }
}
