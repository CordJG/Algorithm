package 코플릿_Java.DailyCoding;

import java.util.Arrays;

public class isIsogram {
    public static void main(String[] args) {
        //이중포문으로 첫번째 문자랑 같은 게 있는지 ~ if 같은 게 있다면 false
        String str = "moOse";
        String lowerStr = str.toLowerCase();

        boolean a = true;

        char[] chars = lowerStr.toCharArray();

        System.out.println(Arrays.toString(chars));

        for(int i=0; i<chars.length; i++){
            for(int j=i+1; j<chars.length; j++){
                if(chars[i]==chars[j]){
                    a = false;
                    break;
                }
            }
        }

        System.out.println(a);


    }
}
