package 연습3;
import java.util.*;

public class StreamFinal2 {
    public static void main(String[] args) {
        int[] intArray = {2,4,6};
        int[] Array = {1,2,3,4,5};

        //allMatch()
        boolean result = Arrays.stream(intArray).allMatch(element-> element %2 ==0);
        System.out.println("요소 모두 2의 배수인가요? " + result);

        // anyMatch()
        result = Arrays.stream(intArray).anyMatch(element-> element %3 ==0);
        System.out.println("요소 중 하나라도 3의 배수가 있나요? " + result);

        // noneMatch()
        result = Arrays.stream(intArray).noneMatch(element -> element % 3 ==0);
        System.out.println("요소 중 3의 배수가 하나도 없나요? " + result);

        long sum = Arrays.stream(Array).sum();
        System.out.println("Array 전체 요소 합 : " + sum);

        int sum1 = Arrays.stream(Array).map(element -> element *2)
                .reduce((a, b) -> a + b).getAsInt();
        System.out.println("초기값이 없는 reduce(): " + sum1);

        //초기값이 있는 reduce()
        int sum2 = Arrays.stream(Array).map(element -> element *2)
                .reduce(5, (a,b) -> a+b);
        System.out.println("초기값이 있는 reduce(): " + sum2);

    }
}
