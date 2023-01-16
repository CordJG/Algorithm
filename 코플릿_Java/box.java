package 코플릿_Java;
import java.util.*;


public class box {
    public static void main(String[] args) {

        Integer[] boxes = new Integer[]{10,1,3,5,2,7,11,2,3,4,5,6,7,8,9,10};

        List<Integer> list = Arrays.asList(boxes);
        int num=0;
        int count =1;
        int count2 =1;

        for(int i=1; i<boxes.length; i++){
            if(boxes[0]>boxes[i]){
              count++;
              num=list.indexOf(i);
            }
        }
        for(int j=num; j<boxes.length; j++){
            if(boxes[num]>boxes[j+1]){
                count2++;
            }
        }

        int n = Math.max(count, count2);





//
//        Queue<Integer> queue = new LinkedList<>(list);




    }
}


//        int num2= list.get(0);
//        int count=1;
//        while(it.hasNext()){
//            int num=it.next();
//            if(num2>=num){
//                count++;
//            }else if(num2<num){
//                list.subList(list.get(num), list.size());
//                it=list.iterator();
//                num2=list.indexOf(num);
//                while(it.hasNext()){
//
//                }
//            }
//        }

