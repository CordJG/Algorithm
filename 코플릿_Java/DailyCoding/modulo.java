package 코플릿_Java.DailyCoding;

public class modulo {
    public static void main(String[] args) {
        //num2를 1~ 계속 곱해주는데 만약 num2*i가 num1을 넘어서는 순간 break를 걸어주고
        // 우리가 원하는 값은  break 됐을 때 num2-(num2*i-25)
        int num2 = 4;
        int num1 = 25;
        int i=1;

        while(num2*i<num1){
            i++;
        }
        System.out.println(num2-(num2*i-num1));

    }
}
