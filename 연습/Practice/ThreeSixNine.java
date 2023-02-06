package 연습.Practice;

import java.util.*;

public class ThreeSixNine {
    public static void main(String[] args) {

      Play play = new Play();

        System.out.println(play.call2(66));

    }
}

class Play{

    List<String> list = new ArrayList<>();
    String call(int num){
        String str = String.valueOf(num);
        char[] chars = new char[str.length()];

        for(int i=0; i<str.length(); i++){
            chars[i]= str.charAt(i);

        }

        char[] nums = new char[]{'3','6','9'};
        int count=0;

        for(int j=0; j<chars.length; j++){
            for(int k=0; k<nums.length; k++){
                if(chars[j] == nums[k]){
                    count++;
                    break;
                }
            }
        }
        String result= "짝";
        if(count==0) return "x";

        return result.repeat(count);

    }

    List<String> call2(int num){
        for(int i=1; i<=num; i++){
            list.add(call(i));
        }
        return list;
    }
}
