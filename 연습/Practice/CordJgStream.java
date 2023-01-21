package 연습.Practice;
import java.util.*;
import java.util.stream.*;

public class CordJgStream {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5};
        IntStream intStream = Arrays.stream(arr);

        System.out.println(intStream.average());

        List<Integer> list = Arrays.asList(1,2,3,4,5);
        Stream<Integer> stream = list.stream();

        stream.forEach(System.out::println);

        IntStream ints = new Random().ints().limit(2);
        ints.forEach(System.out::println);

        IntStream intStream1 =IntStream.rangeClosed(1,5);
        intStream1.forEach(System.out::println);

    }
}
