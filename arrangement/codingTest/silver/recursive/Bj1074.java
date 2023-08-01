package codingTest.silver.recursive;

import java.util.*;

/**
 * 재귀함수 문제  + 분할 정복을 이용한 문제
 * 재귀함수의 기본적인 문제이면서 분할을 어떻게 해야하는지 어떻게 나누어야 하는지 생각할 수 있어야함
 */
public class Bj1074 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int r = scanner.nextInt();
        int c = scanner.nextInt();

        int size = (int) Math.pow(2, N);
        int result = visitOrder(N, r, c, size);

        System.out.println(result);
    }

    public static int visitOrder(int N, int r, int c, int size) {
        if (N == 0) {
            return 0;
        }

        int halfSize = size / 2;
        int area = halfSize * halfSize;

        if (r < halfSize && c < halfSize) {
            return visitOrder(N - 1, r, c, halfSize);
        } else if (r < halfSize && c >= halfSize) {
            return area + visitOrder(N - 1, r, c - halfSize, halfSize);
        } else if (r >= halfSize && c < halfSize) {
            return 2 * area + visitOrder(N - 1, r - halfSize, c, halfSize);
        } else {
            return 3 * area + visitOrder(N - 1, r - halfSize, c - halfSize, halfSize);
        }
    }
}

