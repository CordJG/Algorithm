package 연습.연습6;
import java.util.*;

public class CordJgStack {
    public static void main(String[] args) {

        Stack<String> prevStack = new Stack<>();
        Stack<String> nextStack = new Stack<>();
        Stack<String> current = new Stack<>();
        ArrayList<Stack> result = new ArrayList<>();

        String[] actions= new String[]{"b","c","-1","1","d","-1","-1"};
        String start = "a";

        ArrayList<String> list = new ArrayList<String>(Arrays.asList(actions));

        current.push(start);
        Iterator<String> it = list.iterator();
        while(it.hasNext()){
            String str =it.next();

            if(str!="1" && str!="-1"){
                prevStack.push(current.pop()); current.push(str); nextStack.clear();
            }
            if(prevStack.size()!=0){
                if(str=="-1"){
                    nextStack.push(current.pop()); current.push(prevStack.pop());
                }
            }
            if(nextStack.size()!=0){
                if(str=="1"){
                    prevStack.push(current.pop()); current.push(nextStack.pop());
                }
            }
        }
        result.add(0,prevStack);
        result.add(1,current);
        result.add(2,nextStack);
        System.out.println(result);
    }
}
