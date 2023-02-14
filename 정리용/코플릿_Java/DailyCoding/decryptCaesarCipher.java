package 코플릿_Java.DailyCoding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.*;

public class decryptCaesarCipher {
    public static void main(String[] args) {

        String[] chars = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};


        System.out.println(chars.length);

        List<String> list = new ArrayList<>();

        String str = "khoor zruog";
        int secret = 3;

        for(int i=0; i<str.length(); i++){
            for(int j=0; j<chars.length; j++){

                int num = j-secret;

                if(num<0) num=26+j-secret;

                if(String.valueOf(str.charAt(i)).equals(" ")){
                    list.add(i," ");
                    break;
                }

                else if(String.valueOf(str.charAt(i)).equals(chars[j])) list.add(i,chars[num]);
            }
        }

        System.out.println(list);

        String result ="";

        Iterator<String> it = list.iterator();
        while(it.hasNext()){
            result+=it.next();
        }
        System.out.println(result);
    }
}
