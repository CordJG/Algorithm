package codingTest.bronze;

import java.util.*;
import java.util.stream.Collectors;

public class Bj1157 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        String upStr =str.toUpperCase();

        ArrayList<Character> list = new ArrayList<>();

        for (int i = 0; i < upStr.length(); i++) {
            list.add(upStr.charAt(i));
        }
        // 문자 빈도수 계산
        Map<Character, Long> frequencyMap = list.stream()
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()));

        // 가장 많이 사용된 문자의 빈도수 찾기
        Long maxFrequency = Collections.max(frequencyMap.values());

        // 가장 많이 사용된 문자들 필터링
        List<Character> mostFrequentChars = frequencyMap.entrySet().stream()
                .filter(entry -> entry.getValue().equals(maxFrequency))
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());

        // 결과 출력
        if (mostFrequentChars.size() == 1) {
            System.out.println(mostFrequentChars.get(0));
        } else {
            System.out.println("?");
        }
    }
}