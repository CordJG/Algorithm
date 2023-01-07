package 연습3;
import java.util.stream.Stream;
import java.util.*;

public class StreamArray {
    public static void main(String[] args) {
        //문자열 배열 선언 및 할당
        String[] arr = new String[]{"김코딩", "이자바", "박해커"};

        // 문자열 스트림 생성
        Stream<String> stream = Arrays.stream(arr);

        // 출력
        stream.forEach(System.out::println);

    }
}
