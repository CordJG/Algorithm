package 연습.Practice;

import java.util.Arrays;

public class Copy {
    public static void main(String[] args) {
        Integer[][] CordJg = {{1,2},{4,5}};
        Integer[][] Cat = new Integer[CordJg.length][CordJg[0].length];

        for(int i=0; i< CordJg.length; i++){
            for(int j=0; j<CordJg[i].length; j++){
                Cat[i][j] = CordJg[i][j];
            }
        }

        System.out.println(Arrays.deepToString(Cat));

        Cat[0][0]= 100;

        System.out.println(Arrays.deepToString(Cat));
        System.out.println(Arrays.deepToString(CordJg));

        Integer[][] Dog = new Integer[CordJg.length][CordJg[0].length];

        for(int i=0; i< CordJg.length; i++){
            System.arraycopy(CordJg[i],0,Dog[i],0,Dog[i].length);
        }

        Dog[0][0]= 200;

        System.out.println(Arrays.deepToString(Dog));
        System.out.println(Arrays.deepToString(CordJg));
    }
}
