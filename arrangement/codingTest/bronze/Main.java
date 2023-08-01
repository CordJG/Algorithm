package codingTest.bronze;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            int N = sc.nextInt();
        }

//        int X = sc.nextInt();
        int[] nums = new int[8];
        String str ="";
//
//        sc.nextLine();



//        while(sc.hasNext()){

        String[] line = sc.nextLine().split(" ");
        sc.close();
        int plusCount=0;
        int minusCount=0;
        for (int i = 0; i < 8; i++) {
            nums[i] = Integer.parseInt(line[i]);
            if (nums[i] == i+1) {
                plusCount++;
            } else if (nums[i] == 8 - i) {
                minusCount++;
            }
        }


        if (plusCount==8) {
            str += "ascending";
        } else if (minusCount==8) {
            str += "descending";
        }else{
            str += "mixed";
        }
        System.out.println(str);

//        }
    }

}
