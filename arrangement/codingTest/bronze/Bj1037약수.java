package codingTest.bronze;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Bj1037약수 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();
        ArrayList<Integer> list = new ArrayList<>();
        String[] line = sc.nextLine().split(" ");
        for (int i = 0; i < N; i++) {
            list.add(Integer.parseInt(line[i]));
        }

        List<Integer> sortedList = list.stream().sorted().collect(Collectors.toList());
        if (N != 1) {
            System.out.println(sortedList.get(0) * sortedList.get(N - 1));
        } else {
            System.out.println(list.get(0)*list.get(0));
        }
    }
}
