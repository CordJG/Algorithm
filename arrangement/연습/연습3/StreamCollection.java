package 연습.연습3;
import java.util.*;
import java.util.stream.Stream;

public class StreamCollection {
    public static void main(String[] args) {
        //요소들을 리스트
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
        Stream<Integer> stream = list.stream();

        stream.forEach(System.out::print);
    }
}
