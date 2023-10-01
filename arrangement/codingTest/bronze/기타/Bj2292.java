package codingTest.bronze.기타;
import java.util.*;
public class Bj2292 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.close();

        int count = 1; // 방 번호를 카운트하기 위한 변수
        int step = 1; // 순환마다 방의 개수가 증가하는 크기

        while (N > count) {
            count += 6 * step; // 다음 순환까지의 방의 개수를 더함
            step++; // 다음 순환으로 넘어감
        }

        System.out.println(step); // 순환의 개수 출력
    }
}
