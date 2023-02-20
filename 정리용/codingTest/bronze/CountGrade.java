package codingTest.bronze;

import java.util.Scanner;

class CountGrade {
    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);
        System.out.println("등급을 입력하시오 ");
        String str= sc.nextLine();

        System.out.println(printGrade(str));


    }

    static double printGrade(String str){
        double n =0;
        if(str.charAt(0)=='A'){
            if(str.charAt(1)=='+'){
                n= 4.3;
            }else if(str.charAt(1)=='0'){
                n= 4.0;
            }else{
                n= 3.7;
            }
        }
        if(str.charAt(0)=='B'){
            if(str.charAt(1)=='+'){
                n= 3.3;
            }else if(str.charAt(1)=='0'){
                n= 3.0;
            }else{
                n= 2.7;
            }

        }
        if(str.charAt(0)=='C'){
            if(str.charAt(1)=='+'){
                n= 2.3;
            }else if(str.charAt(1)=='0'){
                n= 2.0;
            }else{
                n= 1.7;
            }

        }
        if(str.charAt(0)=='D'){
            if(str.charAt(1)=='+'){
                n= 1.3;
            }else if(str.charAt(1)=='0'){
                n= 1.0;
            }else{
                n= 0.7;
            }

        }
        if(str.charAt(0)=='F'){
            n= 0.0;
        }
        return n;
    }
}


