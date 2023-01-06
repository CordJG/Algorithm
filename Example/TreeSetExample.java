package Example;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<>();

        for (int i = 1; treeSet.size() < 6; i++) {
            int num = (int) (Math.random() * 10) + 1;
            System.out.println(i + "번째 num = " + num);
            treeSet.add(num);

            try { Thread.sleep(1000); } catch(Exception e) {}
        }

        System.out.println("당첨 번호 : " + treeSet);
    }
}
