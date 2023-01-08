package 연습3;
import java.util.*;

public class FlatMap {
    public static void main(String[] args) {
        String[][] namesArray = new String[][]{{"박해커", "이자바"},{"김코딩", "나박사"}};

        Arrays.stream(namesArray)
                .map(inner -> Arrays.stream(inner))
                .forEach(System.out::println);
    }
}
