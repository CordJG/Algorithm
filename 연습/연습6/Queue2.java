package 연습.연습6;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Queue2 {
    public static void main(String[] args) {

        int bufferSize ; //인쇄 목록 크기 즉 3칸이면

        int[] documents = new int[]{4, 7, 5, 3, 5, 10, 3, 5,4};
        Integer[] documents2 = new Integer[documents.length];
        for(int i = 0; i<documents.length; i++){
            documents2[i]= documents[i];
        }
        Queue<Integer> queue = new LinkedList<Integer>(Arrays.asList(documents2));
        int capacities = 10;

        int sec  =3;
        int firstFile = queue.poll();

        for(int i=0; i< documents.length-1; i++){
            int secondFile=queue.poll();
            if(firstFile+secondFile<=10){
                sec+=1;
            }
            if(firstFile+secondFile>10){
                sec+=2;
            }
          System.out.println(sec);

            firstFile=secondFile;
        }
        System.out.println(sec);
    }
}
