package 코플릿_Java.DailyCoding;
import java.util.*;

public class robotPath {
    public static void main(String[] args) {

        List<int[]> list = new ArrayList<>();


        Robot robot = new Robot();
        int countNum = robot.play(list);

        System.out.println(countNum);


            }
        }











class Robot{
    int[][] room = new int[][]{
            {0, 0, 0, 0, 0, 0},
            {0, 1, 1, 0, 1, 0},
            {0, 1, 0, 0, 0, 0},
            {0, 0, 1, 1, 1, 0},
            {1, 0, 0, 0, 0, 0}
    };
    int[] src = new int[]{2,2};
    int[] dst = new int[]{4,2};

    int y = src[0];
    int x = src[1];

    int count=0;
    boolean ongoing=true;


    int left = room[y][x-1];

    int right = room[y][x+1];
    int up = room[y+1][x];
    int down = room[y-1][x];

    int play(List<int[]> list){

        Iterator<int[]> it = list.iterator();

        while(it.hasNext()){
            if(it.next()==src){
                it.remove();
                break;
            }
        }
        while(it.hasNext()){
            if(it.next()!=src){
                it.remove();
            }else{
                ongoing=false;
                break;
            }
        }
        if(ongoing==false && x>=0 && y>=0 && x<room[0].length && y<room.length) {
            if (left == 0 && x>0) {
                x = x - 1;
                src[0] = y;
                src[1] = x;
                list.add(src);
                count++;
            } else if (right == 0 && x<room[0].length) {
                x = x + 1;
                src[0] = y;
                src[1] = x;
                list.add(src);
                count++;
            } else if (up == 0 && y<room.length-1) {
                y = y + 1;
                src[0] = y;
                src[1] = x;
                list.add(src);
                count++;
            } else if (down == 0 && y>0) {
                y = y - 1;
                src[0] = y;
                src[1] = x;
                list.add(src);
                count++;
    }
}

        if(src==dst){

            return count;

        }else{
            play(list);
        }


        return count;
    }
}