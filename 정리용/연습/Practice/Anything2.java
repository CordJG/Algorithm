package 연습.Practice;

import java.util.ArrayList;
import java.util.List;

public class Anything2 {
    public static void main(String[] args) {
        List<Integer> listMain =new ArrayList<>();
        for(int i=0; i<10; i++) {
            listMain.add(i);
        }
        List<Integer> list = new ArrayList<>();
        list.addAll(listMain);
        for(Integer num : list){
            System.out.println(num);
        }

    }
}
