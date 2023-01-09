package 연습4;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class FileInputStreamExample {
    public static void main(String[] args) {
        try{
            FileInputStream fileInput = new FileInputStream("codestates.txt");
            BufferedInputStream bufferedInput = new BufferedInputStream(fileInput);
            int i = 0;
            while ((i = fileInput.read()) != -1) {
                System.out.println((char)i);
            }
            fileInput.close();
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
}
