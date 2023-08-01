package 연습.연습4;

import java.io.FileOutputStream;
import java.util.*;

public class FileInputStreamExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            FileOutputStream fileOutput = new FileOutputStream("codestates2.txt");

            System.out.println("다이어리에 넣을 내용을 입력 하세요 ");
            String word = sc.nextLine();


            byte b[] = word.getBytes();
            fileOutput.write(b);
            fileOutput.close();
            }
        catch (Exception e) {
            System.out.println(e);
        }
    }
}
