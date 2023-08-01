package codingTest.silver;

import java.util.*;

public class Bj2606 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[][] nums = new int[M][2];

        sc.nextLine();


        for (int i = 0; i < M; i++) {
            String[] line = sc.nextLine().split(" ");
            for (int j = 0; j < 2; j++) {
                nums[i][j] = Integer.parseInt(line[j]);
            }
        }
        
        int maxNum = findvirus(nums,N);
        System.out.println(maxNum);
    }

    static int findvirus(int[][] nums,int N) {

        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{1});
        boolean[][] visited = new boolean[N+1][N+1];

        Set<Integer> set = new HashSet<>();

        while (!queue.isEmpty()) {
            int[] cur = queue.poll();
            int n = cur[0];

            for (int[] num : nums) {
                if (num[0] == n && !visited[num[0]][num[1]]) {
                    queue.add(new int[]{num[1]});
                    visited[num[0]][num[1]]=true;
                    set.add(num[1]);
                }
                if (num[1] == n && !visited[num[0]][num[1]]) {
                    queue.add(new int[]{num[0]});
                    visited[num[0]][num[1]]=true;
                    set.add(num[0]);
                }
            }
        }
        return set.size();
    }
}
