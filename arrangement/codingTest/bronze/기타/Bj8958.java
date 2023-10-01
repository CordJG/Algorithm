package codingTest.bronze.기타;
import java.util.*;
public class Bj8958 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < N; i++) {
            String[] line = sc.nextLine().split("");
            System.out.println(getPoint(line));
        }
    }
    static int getPoint(String[] line){
        int sumPoint =0;
        int point =0;
        for (String str : line) {

            if (str.equals("O")) {
                point++;
                sumPoint += point;
            } else {
                point=0;
            }
        }
        return sumPoint;
    }
}
