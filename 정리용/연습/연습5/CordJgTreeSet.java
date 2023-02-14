package 연습.연습5;
import java.util.*;
public class CordJgTreeSet {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(1);
        treeSet.add(10);
        treeSet.add(5);
        treeSet.add(17);
        treeSet.add(-1);

        System.out.println(treeSet);
        System.out.println(treeSet.first());
        System.out.println(treeSet.last());
        System.out.println(treeSet.higher(5));
        System.out.println(treeSet.subSet(0,10));
        System.out.println(treeSet.subSet(0,18));
        System.out.println(treeSet.subSet(-1,10));



    }
}
