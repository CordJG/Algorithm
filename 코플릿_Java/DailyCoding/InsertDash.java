package 코플릿_Java.DailyCoding;

import java.awt.image.AreaAveragingScaleFilter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InsertDash {
    public static void main(String[] args)  {
        String str="454793";
        String[] str2=str.split("");
        // 그럼 1. list로변환시켜준다 (str을 split 해줘야 인덱스 사용가능)
//        List<String> list = Arrays.asList(str2);    //->
        List<String> list = new ArrayList<>(Arrays.asList(str2));
        System.out.println(list.size());
//         2.for문을 돌려준다
        for(int i=0; i<list.size(); i++) {
            // 3.i와 i+1 이 동시에 홀수면 i뒤에 -를 넣어준다(list.get(i).concat("-");
             if(i+1<list.size()){
                if (Integer.parseInt(list.get(i)) % 2 != 0 && Integer.parseInt(list.get(i + 1)) % 2 != 0 ) {  //어라...string이어서 나누기를 못하네? 음...아하! list.get(i)을 string to int로 바꾸자
                    list.add(i,list.get(i).concat("-"));
                    list.remove(i+1);
                    System.out.println(list);
                }
            }
        }
        String result="";
        for(int i=0; i<list.size(); i++){
            result+=list.get(i);
        }
        System.out.println(result);









    }
}
