package 연습4;
import java.io.IOException;
import java.util.*;


public class FileReader {
    public static void main(String[] args) {
        try {
            String fileName = "aouda.txt";
            FileReader file = new FileReader(fileName);

            int data = 0;

            while((data=file.read()) != -1) {
                System.out.println((char)data);
            }
            file.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
