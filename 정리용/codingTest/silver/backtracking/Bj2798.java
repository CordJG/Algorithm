package codingTest.silver.backtracking;

import java.io.*;

/**
 *  백트래킹 문제
 *  블랙잭 문제 !쉽다
 */


public class Bj2798 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static int N, M;
    static int[] cards;
    static int[] pickedCards;
    static boolean[] visited;
    static int maxPoint;
    public static void main(String[] args) throws IOException {


        String[] input = br.readLine().split(" ");
        N = Integer.parseInt(input[0]);
        M = Integer.parseInt(input[1]);

        input = br.readLine().split(" ");

        cards = new int[N];
        pickedCards = new int[3];
        visited = new boolean[N];

        maxPoint =0;
        int i=0;
        for (String str : input) {
            cards[i++] = Integer.parseInt(str);
        }

        generateCards(0);

        System.out.println(maxPoint);

    }

    static void generateCards(int depth) {
        int sumPoint = 0;
        if (depth == 3) {
            for (int pickedCard : pickedCards) {
                sumPoint += pickedCard;
            }
            if (sumPoint <= M) {
                maxPoint = Math.max(sumPoint, maxPoint);
            }
            return;
        }

        for (int i = 0; i < N; i++) {
            if (!visited[i]) {
                visited[i] = true;
                pickedCards[depth] = cards[i];
                generateCards(depth + 1);
                visited[i] = false;
            }
        }
    }
}
