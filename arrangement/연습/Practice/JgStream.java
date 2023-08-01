package 연습.Practice;
import java.util.*;
import java.util.stream.*;

public class JgStream {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};


        IntStream stream = Arrays.stream(arr);

        stream.filter(n->n>3)
                .map(n->n*2)
                        .forEach(System.out::println);
        System.out.println(Arrays.toString(arr));

        String[] strArr = {"ab","cd","ef"};

        Stream<String> stream2 = Arrays.stream(strArr);

        String[][] str = {{"ab"},{"cdf"},{"abcd"}};

    }
}
