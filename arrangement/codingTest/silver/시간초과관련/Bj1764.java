package codingTest.silver.시간초과관련;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

/**
 * HashSet 에 값을 추가할 때 (HashSet.add()) -> 중복된 건 넣으면 안 되기 때문에 출력되는 값이 boolean 타입임
 * 이걸 활용해서 만약 값이 들어가진다면 true를 반환하고 이 값은 중복된 값이 아니라는 말임
 * 즉 이걸 이용하면 중복되지 않은 값만 넣읋 수도 있고, 중복된 값만 넣을 수도 있음
 * HashSet -> O(1)
 * for루프 -> O(N+M)
 * stream연산 sorted -> O(N+M)log(N+M)
 * collect() 메서드 -> O(N+M)
 */

public class Bj1764 {
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

            if (!usique.add(str)) {
                count++;
                list.add(str);
            }
        }

        List<String> sortedList = list.stream().sorted().collect(Collectors.toList());

        System.out.println(count);
        for (String str : sortedList) {
            System.out.println(str);
        }
    }
}
