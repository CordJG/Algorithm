package 연습.Practice;
import java.util.*;
import java.util.stream.*;


public class JgStream3 {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(10, 20, 50, 70, 100);
        Stream<Integer> stream = list.stream();

        stream.forEach(System.out::println);
        System.out.println();

        HashSet<Integer> set = new HashSet<>();

        set.add(10); set.add(20); set.add(30); set.add(40);
        Stream<Integer> stream2 = set.stream();

        stream2.forEach(System.out::println);

    }
}
