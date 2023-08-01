package 코플릿_Java.DailyCoding;

public class computeSquareRoop {
    public static void main(String[] args) {

        int num = 1919299;
        double n = 1;
        while(true){
            if(n*n==num){
                n=n;
            }
            else if(n*n>num){
                n -= 1;
                break;
            }
            n++;
        }
        int count=0;
        double guess = num;
        String result="";
        while (true){
            count++;
            if(count==200){
                result=String.format("%.2f",guess);
                break;
            }
            guess = (guess + (num/guess))/2;
        }
//        int count=0;
//        double guess = n;
//        String result="";
//        while (true){
//            count++;
//            if(count==200){
//                result=String.format("%.2f",guess);
//                break;
//            }
//            guess = (guess + (num/guess))/2;
//        }
        System.out.println(result);
        System.out.println(Math.sqrt(num));

    }
}
