package 연습.Practice;

import java.sql.SQLOutput;

public class CordJgStringBuilder {
    public static void main(String[] args) {

        StringBuilder sb =new StringBuilder();
        sb.append("고");
        sb.append("양");
        sb.append("이");
        System.out.println(sb.toString());

        sb.insert(2,"삼");
        System.out.println(sb.toString());
        sb.setCharAt(2,'이');
        System.out.println(sb.toString());
        sb.replace(2,4,"이다");
        System.out.println(sb.toString());

    }
}
