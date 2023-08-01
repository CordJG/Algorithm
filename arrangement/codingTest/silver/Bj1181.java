package codingTest.silver;
import java.util.*;
import java.util.stream.Collectors;

public class Bj1181 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            String line = sc.nextLine();
            list.add(line);
        }
        List<String> distinctList = list.stream()
                .distinct()
                .sorted(Comparator.comparingInt((String str) -> str.length())
                        .thenComparing(Comparator.naturalOrder()))
                        .collect(Collectors.toList());

        for (int i = 0; i < distinctList.size(); i++) {
            System.out.println(distinctList.get(i));
        }

    }
}
