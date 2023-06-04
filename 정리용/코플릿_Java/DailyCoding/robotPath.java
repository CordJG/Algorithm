package 코플릿_Java.DailyCoding;
import java.util.*;

public class robotPath {
    public static void main(String[] args) {

            int[][] room = new int[][]{
            {0, 0, 0, 0, 0, 0},
            {0, 1, 1, 0, 1, 0},
            {0, 1, 0, 0, 0, 0},
            {0, 0, 1, 1, 1, 0},
            {1, 0, 0, 0, 0, 0}
        };

            int[] src = {4,2};
            int[] dst = {0,5};

            int time = minimumTime(room,src,dst);

        System.out.println(time);

    }

    static int minimumTime(int[][] room, int[] src, int[] dst) {
        int srcY = src[0];
        int srcX = src[1];

        int dstY = dst[0];
        int dstX = dst[1];

        int y = room.length;
        int x = room[0].length;


        int[][] directions = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};

        boolean[][] visited = new boolean[y][x];

        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{srcY, srcX, 0});
        visited[srcY][srcX] = true;

        while(!queue.isEmpty()){
            int[] cur = queue.poll();
            int row = cur[0];
            int col = cur[1];
            int time= cur[2];

            if (row == dstY && col == dstX){
                return time;
            }

            for (int[] dir : directions) {
                int newRow = row + dir[0];
                int newCol = col + dir[1];

                if (newRow >=0 && newRow < y && newCol >=0 && newCol <x && room[newRow][newCol] ==0 && !visited[newRow][newCol]) {
                    queue.add(new int[]{newRow, newCol, time + 1});
                    visited[newRow][newCol] = true;
                }
            }
        }
        throw new IllegalArgumentException("Destination is unreachable.");
    }


//class Robot{
//    int[][] room = new int[][]{
//            {0, 0, 0, 0, 0, 0},
//            {0, 1, 1, 0, 1, 0},
//            {0, 1, 0, 0, 0, 0},
//            {0, 0, 1, 1, 1, 0},
//            {1, 0, 0, 0, 0, 0}
//    };
//    int[] src = new int[]{2,2};
//    int[] dst = new int[]{4,2};
//
//    int y = src[0];
//    int x = src[1];
//
//    int count=0;
//    boolean ongoing=true;
//
//
//    int left = room[y][x-1];
//
//    int right = room[y][x+1];
//    int up = room[y+1][x];
//    int down = room[y-1][x];
//
//    int play(List<int[]> list){
//
//        Iterator<int[]> it = list.iterator();
//
//        while(it.hasNext()){
//            if(it.next()==src){
//                it.remove();
//                break;
//            }
//        }
//        while(it.hasNext()){
//            if(it.next()!=src){
//                it.remove();
//            }else{
//                ongoing=false;
//                break;
//            }
//        }
//        if(ongoing==false && x>=0 && y>=0 && x<room[0].length && y<room.length) {
//            if (left == 0 && x>0) {
//                x = x - 1;
//                src[0] = y;
//                src[1] = x;
//                list.add(src);
//                count++;
//            } else if (right == 0 && x<room[0].length) {
//                x = x + 1;
//                src[0] = y;
//                src[1] = x;
//                list.add(src);
//                count++;
//            } else if (up == 0 && y<room.length-1) {
//                y = y + 1;
//                src[0] = y;
//                src[1] = x;
//                list.add(src);
//                count++;
//            } else if (down == 0 && y>0) {
//                y = y - 1;
//                src[0] = y;
//                src[1] = x;
//                list.add(src);
//                count++;
//    }
//}
//
//        if(src==dst){
//
//            return count;
//
//        }else{
//            play(list);
//        }
//
//
//        return count;
//    }
}