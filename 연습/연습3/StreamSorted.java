package 연습.연습3;
import java.util.*;

public class StreamSorted {
    public static void main(String[] args) {

        List<String> animals = Arrays.asList("Tiger", "Lion", "Monkey", "Duck", "Horse", "Cow");
        List<String> names = Arrays.asList("이재관", "조영현", "김민주", "이수지", "최진영");

        animals.stream()
                .sorted()
                .forEach(System.out::println);
        System.out.println();

        animals.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
        System.out.println();

        names.stream().sorted().forEach(System.out::println);
        System.out.println();
        names.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
    }
}
