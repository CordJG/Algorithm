package codingTest.bronze.기타;
import java.util.*;
public class Bj10250 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();

        int[] nums = new int[3];

        for (int i = 0; i < N; i++) {
            String[] line = sc.nextLine().split(" ");
            for (int j = 0; j < 3; j++) {
                nums[j] = Integer.parseInt(line[j]);

            }
            System.out.println(findRoom(nums));
        }
    }

    static int findRoom(int[] nums) {
        int H = nums[0];  //호텔 층 수
        int W = nums[1];  //각 층의 방 수
        int N = nums[2];  // n 번째 손님

        int q1 = N / H; // 몫
        double q2 = (double) N/ H;
        int r = N % H; // 나머지

        if(r==0){
            r = H;
        }
        if(q1!=q2){
            q1 = q1+1;
        }

        return r * 100 + q1;

    }
}
