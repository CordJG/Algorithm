package codingTest.silver;

import java.util.*;
public class Bj1436 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.close();

        int num = findNum(N);
        System.out.println(num);

    }

    static int findNum(int N) {

        int count=0;
        int num = 666;

        while (count < N) {
            if (String.valueOf(num).contains("666")) {
                count++;
            }
            if(count ==N) {
                break;
            }
            num++;
        }
        return num;
    }

}
