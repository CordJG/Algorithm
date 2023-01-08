package 연습3;
import java.util.*;
import java.util.stream.IntStream;

public class StreamEX2 {
    public static void main(String[] args) {

        //Skip() 스트림의 일부 요소 건너뜀
        IntStream intStream = IntStream.rangeClosed(1,10);

        intStream.skip(5).forEach(System.out::println);
        System.out.println();

        //limit() 스트림의 일부를 자른다(maxSize를 두는 것)
        IntStream intStream2 = IntStream.rangeClosed(1, 10);
        intStream2.limit(5).forEach(System.out::println);
        System.out.println();

        //peak() 요소들을 순회하며 특정 작업 수행
        //peek() vs forEach() -> peek는 중간 연산자이기 때문에 여러번 연결하여 사용 가능, forEach는 최종 연산자이기에 마지막에만 사용
        //주로 코드의 에러를 찾기위한 디버깅용도로 종종 활용됨.
        IntStream intStream3 = IntStream.of(1,2,2,3,3,4,5,5,7,7,7,8);

        int sum = intStream3.filter(element -> element%2 ==0)
                .distinct()
                .peek(System.out::println)
                .sum();
        System.out.println("합계 = " + sum);

    }
}
