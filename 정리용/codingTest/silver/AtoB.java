package codingTest.silver;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class AtoB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        sc.close();

        int minimumNum = countNum(A, B);
        System.out.println(minimumNum);


    }

//    static int countNum(int A, int B) {              //비효율적 시간복자도 O(B-A)
//        Queue<int[]> queue = new LinkedList<>();
//        queue.add(new int[]{A,1});
//        int time = 1;
//
//
//        while(!queue.isEmpty()){
//            int[] cur = queue.poll();
//            int num = cur[0];
//            time = cur[1];
//
//            if(num==B){
//                return time;
//            }
//
//            int doubleCur = num*2;
//            int plusedOneCur = num*10+1;
//
//
//            if(doubleCur<=B) {
//                queue.add(new int[]{doubleCur, time + 1});
//            }
//            if(plusedOneCur<=B) {
//                queue.add(new int[]{plusedOneCur, time + 1});
//            }
//        }
//
//        return -1;
//    }
static int countNum(int A, int B) {              //효율적 시간복잡도 O(log(B/A))
    Queue<int[]> queue = new LinkedList<>();
    queue.add(new int[]{B, 0});

    while (!queue.isEmpty()) {
        int[] cur = queue.poll();
        int num = cur[0];
        int time = cur[1];

        if (num == A) {
            return time + 1;
        }

        if (num % 2 == 0 && num / 2 >= A) {
            queue.add(new int[]{num / 2, time + 1});
        }
        if (num % 10 == 1 && num / 10 >= A) {
            queue.add(new int[]{num / 10, time + 1});
        }
    }

    return -1;
}
}
