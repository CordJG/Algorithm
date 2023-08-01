package codingTest.silver.시간초과관련;


import java.io.*;
import java.util.*;

/**
 * List 의 indexof 메서드는 시간복잡도가 O(N) 이기 때문에 굉장히 무거운 아이다
 * 따라서 indexof를 쓰는 게 아닌 map을 통해 index를 찾아주는 방법이 필요하다!
 */

public class Bj1620ver2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int M = Integer.parseInt(input[1]);

        List<String> list = new ArrayList<>();
        Map<String, Integer> map = new HashMap<>();


        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            list.add(str);
            map.put(str, i);
        }

        for (int i = 0; i < M; i++) {
            String question = br.readLine();
            boolean isNumber = question.matches("\\d+");
            if (isNumber) {
                String answer = list.get(Integer.parseInt(question)-1);
                System.out.println(answer);
            } else {
                int answer = map.get(question)+1;
                System.out.println(answer);
            }
        }
    }
}
