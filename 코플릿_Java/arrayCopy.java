package 코플릿_Java;
import java.util.*;

public class arrayCopy {

    static int[] a = {1,2,3,4,5};
    static int[] b = {6,7,8,9,10};

    static int[] c = new int[a.length+b.length];

    public static void main(String[] args) {
        System.arraycopy(a,0,c,0,a.length);
        System.arraycopy(b,0,c,a.length,b.length);


        for(int i=0; i<c.length; i++){
            System.out.println(c[i]);
        }

        System.out.println(Arrays.toString(c));
    }
}
