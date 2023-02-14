package 코플릿_Java;
import java.util.*;


public class box {
    public static void main(String[] args) {

        Integer[] boxes = new Integer[]{10,1,3,5,2,7,11,2,3,4,5,6,7,8,9,10};

        List<Integer> list = Arrays.asList(boxes);
        int length=0;

        List<Integer> lengthes = new ArrayList<>();

        for(int i=0; i<boxes.length; i++){
            int j=i+1;
            for(; j<boxes.length; j++)
                if(list.get(i)<list.get(j))
                    break;

                length=j-i;
                lengthes.add(length);
                i=j-1;
        }

        System.out.println(lengthes);
        int max = Collections.max(lengthes);
        System.out.println(max);





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

