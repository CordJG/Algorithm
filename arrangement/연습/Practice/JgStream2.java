package 연습.Practice;
import java.util.*;
import java.util.stream.*;
public class JgStream2 {
    public static void main(String[] args) {

       int[] intArr = {10,20,30,50};
       IntStream intStream = Arrays.stream(intArr);

        System.out.println("평균은 = " +intStream.average().getAsDouble());

    }
}
