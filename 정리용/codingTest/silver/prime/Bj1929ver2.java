package codingTest.silver.prime;

import java.util.*;
public class Bj1929ver2 {
    public static List<Integer> getPrimes(int n) {
        boolean[] primes = new boolean[n + 1];
        Arrays.fill(primes, true); // 모든 수를 소수로 초기화

        for (int p = 2; p * p <= n; p++) {
            // 아직 소수로 체크되지 않은 수라면
            if (primes[p]) {
                // p의 배수들을 소수가 아닌 것으로 체크
                for (int i = p * p; i <= n; i += p) {
                    primes[i] = false;
                }
            }
        }

        List<Integer> primeNumbers = new ArrayList<>();
        // 소수인 숫자들을 리스트에 추가
        for (int i = 2; i <= n; i++) {
            if (primes[i]) {
                primeNumbers.add(i);
            }
        }

        return primeNumbers;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        sc.close();

        List<Integer> primes = getPrimes(M);

        for (int primeNum : primes) {
            if (primeNum >= N) {
                System.out.println(primeNum);
            }
        }

    }
}

