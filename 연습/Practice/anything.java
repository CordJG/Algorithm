package 연습.Practice;

import 연습.연습4.CordJg;

public class anything {
    static int num;
    static int sum;

    public static void main(String[] args) {

        System.out.println(CordJg(0));

    }
    public static int CordJg(int count){

        if(count==5){
           sum = num;
           return sum;
        }

        num=num+1;
        System.out.println(num);
        CordJg(count+1);
        return sum;
    }
}

