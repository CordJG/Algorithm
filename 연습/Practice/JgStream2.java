package 연습.Practice;
import java.util.*;
import java.util.stream.*;
public class JgStream2 {
    public static void main(String[] args) {

        String[] arr = new String[]{"고양이","호랑이","설날"};

        Stream<String> stream =Stream.of(arr);

        stream.forEach(System.out::println);


    }
}
