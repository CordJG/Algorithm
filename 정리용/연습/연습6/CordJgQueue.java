package 연습.연습6;

import java.util.*;

public class CordJgQueue {
    public static void main(String[] args) {

        Integer[] boxes = new Integer[]{10, 5, 4, 11, 5, 3, 4, 5,12,7,4,3,2,1,10,5,4,3};

        Queue<Integer> queue = new LinkedList<>(Arrays.asList(boxes));

        Queue<Integer> stack = new LinkedList<>();

        int maxSize = 0;
        int boxN = boxes[0];


        for (int i = 0; i < boxes.length; i++) {
            int num = queue.poll();
            if (boxN >= num) {
                stack.add(num);
                if (queue.size()==0){
                    if(stack.size()> maxSize){
                        maxSize =stack.size();
                    }
                }
            }
            if (boxN < num) {
                if (stack.size() > maxSize) {
                    maxSize = stack.size();
                }
                System.out.println(stack);
                stack.clear();
                stack.add(num);
                boxN = num;
            }

        }
        System.out.println(stack);
        System.out.println(maxSize);
    }
}


