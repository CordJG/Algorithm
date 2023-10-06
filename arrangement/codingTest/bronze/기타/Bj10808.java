package codingTest.bronze.기타;

import java.util.Scanner;

/**
 *  알파벳이 아스키모드로 숫자임을 생각해서
 *  알파벳 배열을 만들 수 있다.
 *  또 이걸 생각해서 각 알파벳의 차이로
 *  새로운 인덱스에 값을 추가할 수 있다는 생각
 *
 */
public class Bj10808 {

    static int[] alphabetCount = new int[26];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();


        for (int i = 0; i < S.length(); i++) {
            char c = S.charAt(i);

            int index = c - 'a';
            alphabetCount[index] ++;
        }

        for (int i = 0; i < 25; i++) {
            System.out.print(alphabetCount[i] + " ");
        }
        System.out.print(alphabetCount[25]);
    }
}
