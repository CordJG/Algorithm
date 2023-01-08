package 연습3;
import java.util.*;

public class FlatMap {
    public static void main(String[] args) {
        String[][] namesArray = new String[][]{{"박해커", "이자바"},{"김코딩", "나박사"},{"이재관"}};

        Arrays.stream(namesArray)
                .map(inner -> Arrays.stream(inner))
                .forEach(System.out::println);
        System.out.println();

        Arrays.stream(namesArray)
                .map(inner -> Arrays.stream(inner))
                .forEach(names -> names.forEach(System.out::println));
        System.out.println();

        Arrays.stream(namesArray).flatMap(Arrays::stream).forEach(System.out::println);
    }
}
