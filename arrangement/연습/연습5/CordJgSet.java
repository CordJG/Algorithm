package 연습.연습5;
import java.util.*;

public class CordJgSet {
    public static void main(String[] args) {

        HashSet<Integer> hashSet = new HashSet<>(10);

        hashSet.add(10);

        System.out.println(hashSet.add(20));
        Iterator<Integer> iter = hashSet.iterator();
        while(iter.hasNext()){
            int num = iter.next();
            System.out.println(num);
        }
        System.out.println(hashSet);
    }
}
