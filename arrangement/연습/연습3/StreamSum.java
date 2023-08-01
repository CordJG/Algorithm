package 연습.연습3;
import java.util.*;

public class StreamSum {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1,3,6,7,8,11);

        int sum =
                numbers.stream()
                        .filter(number -> number >4 && (number % 2 == 0))
                        .mapToInt(number -> number)
                        .sum();

        System.out.println("선언형 프로그래밍을 상요한 합계 : " + sum);
    }
}
