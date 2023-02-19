package 연습.Practice;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexExample {
    public static void main(String[] args) {
        // 검색할 문자열
        String text = "Hello, my phone number is 123-456-7890. Please call me back " +
                " My email is example123@gmail.com. Please contact me.";


        // 패턴 지정
        String patternPhone = "\\d{3}-\\d{3}-\\d{4}";
        String patternEmail = "\\b[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}\\b";

        // 패턴 객체 생성
        Pattern p = Pattern.compile(patternPhone);
        Pattern e = Pattern.compile(patternEmail);

        // 문자열에서 패턴 검색
        Matcher m1 = p.matcher(text);
        Matcher m2 = e.matcher(text);

        // 검색된 패턴 추출
        while (m1.find()) {
            String phoneNumber = m1.group();
            System.out.println("Phone number found: " + phoneNumber);
        }
        while (m2.find()){
            String email=m2.group();
            System.out.println("Email found " + email);
        }
    }
}
