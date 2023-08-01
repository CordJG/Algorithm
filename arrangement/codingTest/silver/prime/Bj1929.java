package codingTest.silver.prime;

import java.util.*;

public class Bj1929 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        ArrayList<Integer> primeList = findPrime(N, M);
        for (int primeNum : primeList) {
            System.out.println(primeNum);
        }

    }

    static ArrayList<Integer> findPrime(int N, int M) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = N; i <= M; i++) {
            if (checkPrime(i)) {
                list.add(i);
            }
        }
        return list;
    }

    static boolean checkPrime(int n) {
        boolean checkPrime=true;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                checkPrime=false;
                break;
            }
        }
        return checkPrime;
    }
}
