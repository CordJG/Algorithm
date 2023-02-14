package 연습.연습6;

public class CordJgMethod {
    public static void main(String[] args) {
        Action action = new Action();
        Action.act();

        System.out.println(action.n);
        action.n= 100;

        System.out.println(action.n);

        Action.act();
    }
}
class Action{
    static int n=5;
    int num=5;
    static void act(){

        System.out.printf("클래스 변수는 값을 공유해서 기존 클래스 내의 필드변수의 값도 변하는가? %d \n",n);
        react();
    }

    static void react(){

        System.out.println("인스턴스 메서드는 사용이 불가능 하다?");
    }
}

