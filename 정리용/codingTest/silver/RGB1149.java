package codingTest.silver;

import java.util.Arrays;
import java.util.Scanner;

public class RGB1149 {

    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        int houseNumb = sc.nextInt();
        int[][] RGB = new int[houseNumb][3];
        for(int i=0; i<houseNumb; i++){
            for(int j=0; j<3; j++){
                RGB[i][j]=sc.nextInt();
            }
        }



        int sum=0;


        for(int i=0; i<houseNumb; i++){
            int minNum =1000;
            int sumNum=0;
            int z=0;
            for(int j=0; j<3; j++) {

                if (RGB[i][j] < minNum) {
                    minNum = RGB[i][j];
                    sumNum = minNum;
                    z=j;
                }
            }

            if(minNum==RGB[i][z]) {
                if (i + 1 != houseNumb) {
                    RGB[i+1][z] = 1000;
                }
            }

            sum+=sumNum;
            System.out.println(sumNum);
        }

        System.out.println(Arrays.deepToString(RGB));

        System.out.println(sum);

    }
}
