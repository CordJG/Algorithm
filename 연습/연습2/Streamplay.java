package 연습.연습2;

import java.util.*;
import java.util.stream.*;

public class Streamplay {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5);
        Stream<Integer> stream = list.stream();
        stream.forEach(System.out::print);
    }
}
