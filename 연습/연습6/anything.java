package 연습.연습6;
import java.util.*;

public class anything {
    public static void main(String[] args) {
        Integer[] arr = {1,2,3,4,5,6,7,8,9,10};
        List<Integer> list = Arrays.asList(arr);


        for(int i=0; i<5; i++){
            for(int j=9; j>1; j--){
                if(list.get(i)+list.get(j)<=6){
                    System.out.println(i);
                    System.out.println(j);
                    System.out.println(list.get(i));
                    System.out.println(list.get(j));
                }
            }
        }

        }
    }
