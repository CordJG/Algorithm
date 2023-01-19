package 연습.연습6;

public class CordJgWhat {
    public static void main(String[] args) {
        int n=10;
        double k=2;
        int count=0;
        for(double i =0; i<n; i++) {

            System.out.println(Math.pow(2,i));
            count++;
            if(Math.pow(2,i)>=8) break;
        }
        System.out.println("count ="+count);
    }
}
