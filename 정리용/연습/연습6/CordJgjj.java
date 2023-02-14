package 연습.연습6;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.*;

public class CordJgjj {
    public static void main(String[] args) {

    Integer[] boxes = new Integer[]{5,1,4,6,4,3,2,5,10,4,2,3};
    Queue<Integer> queue = new LinkedList<>(Arrays.asList(boxes));
    Queue<Integer> result = new LinkedList<>();
    int first = boxes[0];
    int max=0;

    for(int i=0; i<boxes.length; i++){
        int temp = queue.poll();
        if(first>=temp){
            result.add(temp);
        }
        else if(first<temp){
            if(max<result.size()){
                max=result.size();
            }
            result.clear();
            result.add(temp);
            first=temp;
        }

    }
    if(max<result.size()){
        max = result.size();
    }
        System.out.println(max);
}
}
