package 코플릿_Java;
import java.util.*;

public class peperoGame {
    public static void main(String[] args) {
        // 공약수
        //공약수의 수만큼이 배열의 요소값이되네
        int M = 4;
        int N = 8;
        int comNum ;
        ArrayList<Integer[]> list = new ArrayList<>();
        for(int i=1; i<=M && i<=N; i++)
        {
            if(M%i==0 && N%i==0)
            {
                comNum = i;
                list.add(new Integer[]{i, M / i, N / i});
            }
        }
    }
}
