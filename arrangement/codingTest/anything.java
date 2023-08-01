package codingTest;

import java.util.Scanner;

public class anything {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String bigA = a.toUpperCase();
        String smallA = a.toLowerCase();
        StringBuilder newA= new StringBuilder();
        for(int i=0; i<a.length(); i++){
            if(a.charAt(i)!=bigA.charAt(i)){
                newA.append(bigA.charAt(i));
            }else if(a.charAt(i)!=smallA.charAt(i)){
                newA.append(smallA.charAt(i));
            }
        }

        System.out.println(newA);
    }
}
