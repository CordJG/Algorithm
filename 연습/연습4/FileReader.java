package 연습.연습4;
import java.io.FileWriter;
import java.io.IOException;


public class FileReader {
    public static void main(String[] args) {
        try {
            String fileName = "aouda.txt";
            FileWriter writer = new FileWriter(fileName);

            String str = "written!";
            writer.write(str);
            writer.close();

        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}
