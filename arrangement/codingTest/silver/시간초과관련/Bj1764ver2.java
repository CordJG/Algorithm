package codingTest.silver.시간초과관련;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

/**
 * list stream을 활용해 필터로 중복되어 있는 요소들만 구분해서 list를 만들 경우 시간초과가 나옴
 *
 */

public class Bj1764ver2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int M = Integer.parseInt(input[1]);


        List<String> list = new ArrayList<>();
        HashSet<String> usique = new HashSet<>();

        int count=0;
        for (int i = 0; i < N+M; i++) {
            String str = br.readLine();

                list.add(str);

        }

        List<String> sortedList = list.stream().filter(i -> Collections.frequency(list, i) > 1)
                .distinct()
                .sorted()
                .collect(Collectors.toList());

        System.out.println(sortedList.size());
        for (String str : sortedList) {
            System.out.println(str);
        }
    }
}
