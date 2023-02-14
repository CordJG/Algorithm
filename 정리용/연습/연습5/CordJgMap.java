package 연습.연습5;
import java.util.*;

public class CordJgMap {
    public static void main(String[] args) {

        HashMap<String, Object> idPassword = new HashMap<>();

        idPassword.put("고양이", "cuty" + 4 + '!');
        idPassword.put("강아지", "cuty" + 4 + '!');

        System.out.println(idPassword.put("고양이", "cuty" + 3 + '!'));

        Object password = idPassword.get("고양이");

        System.out.println(idPassword);

        System.out.println(password);

        System.out.println(idPassword.size());

        Set<Map.Entry<String, Object>> entrySet = idPassword.entrySet();

        Iterator<Map.Entry<String, Object>> entryIterator = entrySet.iterator();

        while (entryIterator.hasNext()) {
            Map.Entry<String, Object> entry = entryIterator.next();
            String id = entry.getKey();
            Object passnumber = entry.getValue();
            System.out.println(id + " : " + passnumber);
        }

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("아이디와 비밀번호를 입력해 주세요");
            System.out.println("아이디");
            String id = scanner.nextLine();

            System.out.println("비밀번호");
            String passN = scanner.nextLine();

            if (idPassword.containsKey(id)) {
                if (idPassword.get(id).equals(passN)) {
                    System.out.println("로그인 되었습니다.");
                    break;
                } else System.out.println("비밀번호가 일치하지 않습니다. ");
            } else System.out.println("입력하신 아이디가 존재하지 않습니다.");
        }
    }
}

