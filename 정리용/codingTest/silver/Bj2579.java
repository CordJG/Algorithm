package codingTest.silver;

import java.util.*;

public class Bj2579 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int[] nums = new int[N];
        for (int i = 0; i < N; i++) {
            nums[i] = sc.nextInt();
        }

        int maxPoint = findMaxN(nums);
        System.out.println(maxPoint);
    }

    static int findMaxN(int[] nums) {
        int N = nums.length;
        int[] directions = {1, 2};
        Queue<int[]> queue = new LinkedList<>();
        int[] stairs = new int[N+1];
        int maxPoint =0;

        queue.add(new int[]{0, 0, 0});

        int index =1;
        for (int num : nums) {
            stairs[index] = num;
            index++;
        }
        while (!queue.isEmpty()) {
            int[] cur = queue.poll();
            int point = cur[0];
            int x = cur[1];
            int check = cur[2];

            if(x==N){
                if(point>maxPoint){
                    maxPoint = point;
                }
                continue;
            }

            for (int dir : directions) {
                int newX = x+dir;
                int newCheck = check;
                int newPoint = point;
                if (dir == 1) {
                    newCheck += 1;
                    if(newX>N || newCheck>=3) {
                        break;
                    }
                    newPoint += stairs[newX];
                } else {
                    newCheck = 0;
                    if(newX>N) {
                        break;
                    }
                    newPoint += stairs[newX];
                }
                queue.add(new int[]{newPoint, newX, newCheck});
                }
            }
        return maxPoint;
        }
    }

