package 연습.연습1;

import java.util.*;

public class HashtableExample {
    public static void main(String[] args){

        Hashtable<String, String> map = new Hashtable<String, String>();

        map.put("Spring", "345");
        map.put("Summer", "678");
        map.put("Fall", "91011");
        map.put("Winter", "1212");

        System.out.println(map);

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("아이디와 비밀번호를 입력해 주세요");
            System.out.println("아이디");
            String id = scanner.nextLine();

            System.out.println("비밀번호");
            String password = scanner.nextLine();

            if (map.containsKey(id)) {
                if (map.get(id).equals(password)) {
                    System.out.println("로그인 되었습니다.");
                    break;
                }
                else System.out.println("비밀번호가 일치하지 않습니다. ");
            }
            else System.out.println("입력하신 아이디가 존재하지 않습니다.");
        }
    }
}