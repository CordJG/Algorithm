package 코플릿_Java;

public class powerOfTwo {
    public static void main(String[] args) {
        int i=0;
        long num = 128;

        while(i<10000){
            i++;

            double num2= Math.pow(2,i);

            if(num==num2) System.out.println(num);


        }

    }
}

