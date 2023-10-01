package codingTest.bronze.기타;
import java.util.*;
public class Bj2884 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int M = sc.nextInt();

        sc.close();

        int[] time = findTime(H, M);

        System.out.println(time[0] + " " + time[1]);


    }

    static int[] findTime(int H, int M) {
        int[] time = new int[2];
        if(M<45){
                H = H - 1;
                if(H<0){
                    H=23;
                }
                M = M - 45 + 60;
        } else{
            M = M - 45;
        }

        time[0] = H;
        time[1] = M;
        return time;
    }
}
