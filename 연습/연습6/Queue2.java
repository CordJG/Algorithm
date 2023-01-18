package 연습.연습6;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Queue2 {
    public static void main(String[] args) {

        //인쇄 목록 크기 즉 3칸이면
        //음... queue 타입 스택을 하나 만들어 준다 , 그 스택에는 capacities 합이 넘어가면
        //documents 요소들이 들어가지 못한다.
        // 하나의 요소가 들어가면 buffersize 만큼의 이동이 필요적이고 그 이동이 끝난 후
        // 요소를 스택에서 뺴준다( 어떻게 구현? )
        // 내가 원하는 건 while(queue.size()>0) 조건 하에
        // 반복횟수를 계속 더해주는 것
        // 그럴러면 반복할 때마다 요소들이 버퍼사이즈를 줄이는 매커니즘을 구현해야 한다.
        // 오
        // 처음 꺼를 넘기고 만약 스택에 새로운 게 들어오면 다시 버퍼사이즈만큼 움직이게한다
        // 또 스택에 새로운 게 들어오면 버퍼사이즈만큼 움직인다.
        // 마지막 스택이 들어오면 버퍼사이즈만큼 움직임
        // stack 의 크기는 스택 안의 들어온 애들의 합<=capacities
        // 구하는 건 두가지 방식이 있다.
        //1. 첫번쨰는 하나가 들어오고 카운트 다운을 해서 다음 게 들어오면 다시 카운트 다운하는 방식으로
        //그러니까 첫 요소가 들어오고 다음요소가 들어오기까지를 카운트 하고
        // 그 카운트값들을 전부 더한다 그리고 마지막 size(0)이 되면 buffersize+1을 더해준다
        //2. 두번째는 스택 사이즈가 꽉차서 한 타이밍 늦게 들어올 때마다 +1초가 추가된다는 걸 이용
        // 그러니까 바로 들어올 경우는 +1초 늦게 들어올 수록 +1초가 증가됨
        // 이 값들을 추가 , 기본 시간은 buffersize+1 시간
        //일단 스택안에 들어있는 요소들의 합을 구하자 => 구함
        int[] documents = new int[]{7, 4, 5, 6, 10, 15, 8, 20, 5};
        Integer[] documents2 = new Integer[documents.length];
        for (int i = 0; i < documents.length; i++) {
            documents2[i] = documents[i];
        }
        Queue<Integer> queue = new LinkedList<Integer>(Arrays.asList(documents2));
        Queue<Integer> stack = new LinkedList<>();

        int bufferSize = 5;
        for (int i = 0; i < bufferSize; i++) {
            stack.add(0);
        }
        int capacities = 30;
        int count = 0;
        int sum = 0;

        while (queue.size() > 0 || stack.size() != 0) {
            count++;
            if (queue.peek() == null) {
                if (sum <= capacities) {
                    stack.poll();
                } else if (sum > capacities) {
                    sum -= stack.peek();
                    stack.poll();
                }
            } else {
                if (sum + queue.peek() <= capacities) {
                    stack.poll();
                    stack.add(queue.peek());
                    sum += queue.poll();
                } else if (sum + queue.peek() > capacities) {
                    sum -= stack.peek();
                    stack.poll();
                    stack.add(0);
                }
//                if (sum == 0) {
//                    break;
//                }
            }
            System.out.println(stack);
            System.out.println(queue);
        }
        System.out.println(count);
    }
}



//        int capacities = 10;
//        int sec  =3;
//        int firstFile = queue.poll();
//
//        for(int i=0; i< documents.length-1; i++){
//            int secondFile=queue.poll();
//            if(firstFile+secondFile<=10){
//                sec+=1;
//            }
//            if(firstFile+secondFile>10){
//                sec+=2;
//            }
//          System.out.println(sec);
//
//            firstFile=secondFile;
//        }
//        System.out.println(sec);
//    }
//}
