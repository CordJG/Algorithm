package 연습.연습6;

public class CordJgReverse {
    public static void main(String[] args) {
        String str = "I love java really";
        int num = 2;

        StringBuilder strBuild = new StringBuilder(str);
        String reverseStr = strBuild.reverse().toString();

        System.out.println(reverseStr);
    }
}
