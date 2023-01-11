package 연습.연습3;
import java.util.*;

public class StreamMap {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("kimcoding", "LeeJaeGwan", "GwAqEwTt", "javautile");
        names.stream()
                .map(element -> element.toUpperCase())
                .forEach(element-> System.out.println(element));
        System.out.println();

        List<Integer> list = Arrays.asList(1, 3, 6, 9);

        list.stream()
                .map(number -> number * 3).forEach(System.out::println);
        System.out.println();

        list.stream()
                .map(number -> number *4).forEach(number-> System.out.println(number));

    }

}
