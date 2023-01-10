package 연습4;
import java.util.*;

public class CordJgArray {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,2,3,4,5);

        int size = list.size();

        int num = list.get(2);

        int i=0;
        while(i<list.size()){
            int numz = list.get(i);
            System.out.println(i+"번 인덱스의 객체 : "+numz);
            i++;

        }

        for(int numz : list) {
            System.out.println(numz);
        }


    }
}
