package codingTest.silver;
import java.util.*;
public class Bj1259 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String[] line = sc.nextLine().split("");
            if (!line[0].equals("0")) {
                System.out.println(getAnswer(line));
            }
        }
    }

    static String getAnswer(String[] line) {
        boolean check = false;
        for (int i = 0; i < line.length; i++) {
            if (!line[i].equals(line[line.length - i-1])) {
                check=true;
            }
        }
        if (!check) {
            return "yes";
        } else {
            return "no";
        }
    }
}
