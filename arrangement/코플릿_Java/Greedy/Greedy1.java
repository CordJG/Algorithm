package 코플릿_Java.Greedy;
import java.util.*;

public class Greedy1 {
    public static void main(String[] args) {

        int[] stuff = {42,25,60,73,103,167};
        int limit = 187;

        Arrays.sort(stuff); //잠깐만 그냥 오름차순 하면 되는 거 같은데??
        List<Integer> list = new ArrayList<>(); //이러면 list 로 만들어주는 게 편하겠는데? 왜냐면 요소들을 제거하고 넣어주고 해야되니까
        for (int i: stuff){
            list.add(i);
        }
        System.out.println(list);
        //아... min 하는 게 아니네...
        //그러니까 60에서 쭉 돌렸을 때 더한 요소가 200보다 작은 것 중 제일 큰 수랑 같이 나가야돼

        int boxMin =stuff.length;


        for(int i=0; i<list.size(); i++) {
            for (int j = list.size()-1; j >0; j--) {
                if (list.get(i)+list.get(j) <= limit) {
                    list.remove(i);
                    list.remove(j-1);
                    boxMin-=1;
                    System.out.println(list);
                }
                }
            }
        System.out.println(boxMin);
    }
}
