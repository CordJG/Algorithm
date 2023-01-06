package Example;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorExample {
    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int i = 1; i <= 10; arrayList.add(i++));

        System.out.println(arrayList);

        Iterator<Integer> it = arrayList.iterator();

        while (it.hasNext()) {
            System.out.println("num ======= " + it.next());
            it.remove();
            System.out.println("arrayList = " + arrayList);
            System.out.println("-".repeat(50));
        }


    }
}
