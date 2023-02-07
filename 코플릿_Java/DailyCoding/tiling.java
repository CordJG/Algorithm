package 코플릿_Java.DailyCoding;

import java.util.Arrays;

public class tiling {
    public static void main(String[] args) {

        // row면 뒤에 rowed
        // column 이면 뒤에 row or column
        String[] newArray = {};
        newArray = new String[newArray.length+1];

        newArray[newArray.length-1] = "a";

        System.out.println(Arrays.toString(newArray));
    }
}
