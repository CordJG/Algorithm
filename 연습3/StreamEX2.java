package 연습3;
import java.util.*;
import java.util.stream.IntStream;

public class StreamEX2 {
    public static void main(String[] args) {

        //Skip()
        IntStream intStream = IntStream.rangeClosed(1,10);

        intStream.skip(5).forEach(System.out::println);
    }
}
