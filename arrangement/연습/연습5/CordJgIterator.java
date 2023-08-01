package 연습.연습5;
import java.util.*;
public class CordJgIterator {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <= 3; i++) {
            list.add(i);
        }
        System.out.println(list.size());
        System.out.println();

       Iterator<Integer> iterator = list.iterator();
        while(iterator.hasNext()){
            int num = iterator.next();
            iterator.remove();
            System.out.println(num);
        }
        System.out.println();
        System.out.println(list.size());


    }
}
