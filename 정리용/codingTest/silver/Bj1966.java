package codingTest.silver;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;


public class Bj1966 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());


        for (int i = 0; i < N; i++) {
            String[] line = br.readLine().split(" ");
            int M = Integer.parseInt(line[0]);
            int K = Integer.parseInt(line[1]);

            int[] nums = new int[M];
            String[] line2 = br.readLine().split(" ");
            for (int j = 0; j < M; j++) {
                nums[j] = Integer.parseInt(line2[j]);
            }
            System.out.println(findOrderN(nums, K));
        }



    }

    static int findOrderN(int[] nums, int K) {
        Queue<int[]> queue = new LinkedList<>();
        int i=0;
        for (int num : nums) {
            queue.add(new int[]{num,i});
            i++;
        }

        int count =0;

        while (!queue.isEmpty()) {
            int[] cur = queue.poll();
            int curN = cur[0];
            int orderN = cur[1];

            boolean check = false;
            for (int j = 0; j < queue.size(); j++) {
                int[] next = queue.poll();
                int nextN = next[0];

                queue.add(next);

                if (nextN > curN) {
                    check=true;

                }
            }
            if (check) {
                queue.add(cur);
            } else {
                count++;
                if (orderN == K) {
                    return count;
                }

            }
        }
        return -1;
    }
}
