package 연습.Practice;

public class MathEx {
    public static void main(String[] args) {

        double num = 10.19;
        double half = Math.round(num);
        double up = Math.ceil(num);
        double down = Math.floor(num);

        double[] arr = {half, up, down};

        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }

        half = (Math.round(num*10)/10.0);
        System.out.println(half);
        half = (Math.round(num*100)/100.0);
        System.out.println(half);
    }
}
