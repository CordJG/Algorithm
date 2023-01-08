package 연습3;
import java.util.Arrays;
import java.util.List;


public class StreamFilter {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("김코딩", "이자바", "박해커", "김코딩", "박해커", "김코딩", "이재관이", "김민주이");

        names.stream()
                .distinct() //중복 제거
                .forEach(element -> System.out.println(element));
        System.out.println();

        names.stream()
                .filter(element -> element.startsWith("김")) //김씨 성을 가진 요소만 필터링
                .forEach(element -> System.out.println(element));
        System.out.println();

        names.stream()
                .distinct() //중복제거
                .filter(element -> element.startsWith("김"))
                .forEach(element -> System.out.println(element));
        System.out.println();

        names.stream()
                .filter(string -> string.length()>3)
                .forEach(string -> System.out.println(string));


    }

}
