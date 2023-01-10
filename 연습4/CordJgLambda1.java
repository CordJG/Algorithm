package 연습4;

interface LambdaJg3{
    void play3(String x);

}
interface LambdaJg2 {
    void play2();
}

interface LambdaJg1 {
    int play1(int x, int y);
}
public class CordJgLambda1 {
    public static void main(String[] args) throws Exception{

        LambdaJg2 aouda2 = () -> System.out.println("play() 호출");
        aouda2.play2();

        LambdaJg1 aouda1 = (x,y) -> x+y;
        int result1 = aouda1.play1(2,5);
        System.out.println(result1);

        LambdaJg3 aouda3 = (x) -> System.out.println(x);
        aouda3.play3("고양이");
    }
}


