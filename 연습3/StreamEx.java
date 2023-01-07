package 연습3;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamEx {
    public static void main(String[] args) {

        //ArrayList
        List<String> fruitList = new ArrayList<>();
        fruitList.add("바나나 ");
        fruitList.add("사과 ");
        fruitList.add("오렌지 ");

        //배열
        String[] fruitArray = {"바나나 ", "사과 ", "오렌지 "};

        // 각각 스트림 생성
        Stream<String> ListStream = fruitList.stream();
        Stream<String> ArrayStream = Arrays.stream(fruitArray);

        //출력
        ListStream.forEach(System.out::print);
        ArrayStream.forEach(System.out::print);
    }
}
