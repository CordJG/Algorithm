package codingTest.bronze.기타;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * 1. 숫자로 들어오는 값 처리할 때 int[] scores = new int[studentNum] 처럼 배열 크기에 값 할당하여 활용
 * 2. double 소수점 자리 처리  ( DecimalFormat 을 활용 할 수 있다 ) 상당히 편리
 * 3. 복잡한 계산 과정은 Method 를 따로 작성하는 게 직관적으로도, 기능적으로도 좋다
 */
public class Bj4344 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int caseNum = sc.nextInt();

        while (caseNum > 0) {
            int studentNum = sc.nextInt();
            int[] scores = new int[studentNum];

            for (int i = 0; i < studentNum; i++) {
                scores[i] = sc.nextInt();
            }

            double averageScore = calculateAverage(scores);

            double aboveStudentRatio = calculateAboveStudentRatio(scores, averageScore);

            DecimalFormat df = new DecimalFormat("#.000");
            df.setRoundingMode(RoundingMode.HALF_UP);
            String formattedValue = df.format(aboveStudentRatio)+"%";
            System.out.println(formattedValue);

            caseNum --;
        }
    }

    private static double calculateAverage(int[] scores) {
        int totalScore = 0;
        for (int score : scores) {
            totalScore += score;
        }

        return (double) totalScore / scores.length;
    }

    private static double calculateAboveStudentRatio(int[] scores, double averageScore) {

        int aboveStudentCount = 0;
        for (int score : scores) {
            if (score > averageScore) {
                aboveStudentCount ++;
            }
        }

        return (double) aboveStudentCount  / scores.length * 100 ;
    }
}
