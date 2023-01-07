package 연습3;
import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamRandom {
    public static void main(String[] args) {
        // 난수 생성
        //IntStream ints = new Random().ints(5);
        IntStream ints = new Random().ints().limit(5);
        ints.forEach(System.out::println);
    }
}
