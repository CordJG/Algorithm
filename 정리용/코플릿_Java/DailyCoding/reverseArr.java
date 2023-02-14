package 코플릿_Java.DailyCoding;

import java.util.Arrays;

public class reverseArr {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};

        A a= new A();


        System.out.println(Arrays.toString(a.reverseArr(arr)));


    }
}

class A {
    public int[] reverseArr(int[] arr){
        if(arr.length==0) return arr;
        //처음부터 다시 생각해보자
        // 재귀는 기본적으로 줄여나가야 한다
        // 줄이는 대상은 arr 배열이고
        // arr 을 계속 줄여나가면서 재귀를 해주면 된다....음
        // 아! Arrays.copyOfRange써서 줄이면?
        //계속 줄겠지? 오오..
        //0,arr.length-1
        int[] first = Arrays.copyOfRange(arr,arr.length-1 ,arr.length); // 끝부분을 땜
        int[] second = reverseArr(Arrays.copyOfRange(arr,0,arr.length-1)); //이러면 계속줄겄찌

        int[] all = new int[first.length+second.length];
        System.arraycopy(first, 0, all, 0, 1);
        System.arraycopy(second, 0, all, 1, second.length);
        return all;
    }
}
