package codingTest.bronze;

import java.util.*;
public class Bj1152 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] line = sc.nextLine().split(" ");
        int result = line.length;
        for(String str : line){
            if (str.equals("")) {
                result--;
            }
        }

        System.out.println(result);
    }
}
