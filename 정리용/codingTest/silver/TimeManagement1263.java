package codingTest.silver;

import java.util.*;

public class TimeManagement1263 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int toDoNum = sc.nextInt();

        //음...2차원배열로 하는 게 제일 편할듯

        int[][] timeTable = new int[toDoNum][2];
        for (int i = 0; i < toDoNum; i++) {
            timeTable[i][0] = sc.nextInt();
            timeTable[i][1] = sc.nextInt();
        }

        Arrays.sort(timeTable, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return Integer.compare(o1[1], o2[1]);
            }
        });

        System.out.println(Arrays.deepToString(timeTable));

        int sleepTime = 0;
        for (int i = 1; i < toDoNum; i++) {

            int startTime = timeTable[i][1] - timeTable[i][0];
            if (startTime >= sleepTime) {
                sleepTime = startTime;
            } else {
                sleepTime -= timeTable[i][0];
                sleepTime = Math.max(sleepTime, startTime);
            }
        }
        System.out.println(sleepTime);
    }
}
