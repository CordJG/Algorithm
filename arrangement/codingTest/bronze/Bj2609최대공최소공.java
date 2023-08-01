package codingTest.bronze;

import java.util.Scanner;

public class Bj2609최대공최소공 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] line = sc.nextLine().split(" ");
        int num1 = Integer.parseInt(line[0]);
        int num2 = Integer.parseInt(line[1]);

        int commonMaxNum = getMaxCommonNum(num1, num2);
        int commonMinNum = getMinCommonNum(num1, num2);

        System.out.println(commonMaxNum);
        System.out.println(commonMinNum);


    }

    static int getMaxCommonNum(int num1, int num2) {
        int criteria = Math.min(num1, num2);
        int commonMaxNum = -1;
        for (int i = criteria; i > 0; i--) {
            if (num1 % i == 0 && num2 % i == 0) {
                commonMaxNum = i;
                break;
            }
        }
        return commonMaxNum;
    }

    static int getMinCommonNum(int num1, int num2) {
        int commonMaxNum =getMaxCommonNum(num1, num2);

        int commonMinNum = num1 / commonMaxNum * num2;

        return commonMinNum;
    }
}
