package codingTest.bronze.기타;

import java.util.Scanner;

public class Bj2530시간변환 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] line = sc.nextLine().split(" ");
        int hour = Integer.parseInt(line[0]);
        int minute = Integer.parseInt(line[1]);
        int second = Integer.parseInt(line[2]);

        int time = sc.nextInt();
        int H = time / 3600;
        int M = (time - H * 3600) / 60;
        int S = (time - H * 3600 - M * 60);

        if (second + S >= 60) {
            M = M + 1;
        }
        if (minute + M >= 60) {
            H = H + 1;
        }
        int resultS = (second + S) % 60;
        int resultM = (minute + M) % 60;
        int resultH = (hour + H) % 24;

        System.out.println(resultH + " " + resultM + " " + resultS);


    }
}
