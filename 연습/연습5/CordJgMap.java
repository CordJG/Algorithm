package 연습.연습5;
import java.util.*;

public class CordJgMap {
    public static void main(String[] args) {

        HashMap<String,Object> idPassword = new HashMap<>();

        idPassword.put("고양이","cuty"+4+'!');
        idPassword.put("강아지","cuty"+4+'!');

        System.out.println(idPassword.put("고양이", "cuty"+3+'!'));

        Object password = idPassword.get("고양이");

        System.out.println(idPassword);

        System.out.println(password);

        System.out.println(idPassword.size());

        Set<Map.Entry<String,Object>> entrySet = idPassword.entrySet();

        Iterator<Map.Entry<String,Object>> entryIterator = entrySet.iterator();

        while(entryIterator.hasNext()){
            Map.Entry<String,Object> entry = entryIterator.next();
            String id= entry.getKey();
            Object passnumber = entry.getValue();
            System.out.println(id + " : " + passnumber);
        }


    }
}
