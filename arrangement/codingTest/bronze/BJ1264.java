package codingTest.bronze;

import java.util.Scanner;

/**
 * 모음 개수 찾기 문제
 * 간단한 문제
 */
public class BJ1264 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String line = sc.nextLine().toLowerCase();
            if (line.equals("#")) {
                break;
            }
            String[] str = line.split("");
            int count=0;
            for (int i = 0; i < str.length; i++) {
                if (str[i].equals("i") || str[i].equals("e") || str[i].equals("o")
                        || str[i].equals("u") || str[i].equals("a")) {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
