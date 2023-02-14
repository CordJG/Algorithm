package 연습.연습5;

import java.util.ArrayList;
import java.util.random.*;

public class List {
    public static void main(String[] args) {
        boolean babo=false;
        ArrayList<Boolean> list = new ArrayList<>(20);
        list.add(true);
        list.add(babo);
        list.add(false);

        for(int i=1; i<=17 ; i++){
            int num= (int)(Math.random()*2+1);
            if(num==1) list.add(true);
            else list.add(false);
        }
        for(boolean bool : list) {

            System.out.println(String.valueOf(bool));
        }
        System.out.println(list);
    }
}
