package 연습.연습3;
import java.util.stream.IntStream;

public class StreamRandom {
    public static void main(String[] args) {
        // 난수 생성
        //IntStream ints = new Random().ints(5);
        //IntStream ints = new Random().ints().limit(5);
        //ints.forEach(System.out::println);

        //특정 범위의 정수
        IntStream intStream = IntStream.rangeClosed(1, 20);
        intStream.forEach(System.out::println);
    }
}
