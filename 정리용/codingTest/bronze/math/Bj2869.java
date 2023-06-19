package codingTest.bronze.math;
import java.io.*;


public class Bj2869 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] line = br.readLine().split(" ");
        int[] nums = new int[line.length];
        for (int i = 0; i < line.length; i++) {
            nums[i] = Integer.parseInt(line[i]);
        }

        int A = nums[0];
        int B = nums[1];
        int V = nums[2];

        int result = (V - B) / (A - B);
        if((A-B)*(result-1)+A == V){

            System.out.println(result);
        }else{
            System.out.println(result+1);
        }
    }
}
