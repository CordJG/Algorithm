package 코플릿_Java.DailyCoding;

public class power {
    public static void main(String[] args) {

        int num=1;
        for(int i=1; i<=40; i++){
            num=num*3;
            if(num>94906249){
                num=num%94906249;
            }
        }
        System.out.println(num);
    }
}
