package 코플릿_Java.DailyCoding;

public class compute {

    public static int f(double interestRate) {

        int n;


        //이자율^n = 2
        for (n = 1; n < 1000; n++) {
            if (Math.pow(interestRate, n) >= 2) {
                return n;
            }
        }
        return n;
    }

        public static void main (String[]args){
            System.out.println(f(1.1));
        }

    }


