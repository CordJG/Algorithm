package codingTest.silver.시간초과관련;


import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Bj1620 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int M = Integer.parseInt(input[1]);

        Map<String, Integer> map = new HashMap<>();

        for (int i = 1; i <= N; i++) {
            String str = br.readLine();
            map.put(str, i);
        }
        for (int i = 0; i < M; i++) {
            String question = br.readLine();
            boolean isNumber = question.matches("\\d+");
            if (isNumber) {
                List<String> list = map.entrySet().stream()
                        .filter(entry -> entry.getValue() == Integer.parseInt(question))
                        .map(entry -> entry.getKey())
                        .collect(Collectors.toList());

                String answer = list.get(0);
                System.out.println(answer);
            } else {
                int answer = map.get(question);
                System.out.println(answer);
            }
        }
    }
}
