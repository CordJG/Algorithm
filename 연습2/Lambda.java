package 연습2;

public class Lambda {

    public static void main(String[] args) throws Exception{


        Jg jg = new Jg();

        MyFunctionalInterface example = () -> System.out.println("accept() 호출");
        example.accept();
        jg.accept();



    }
}

interface MyFunctionalInterface {
    void accept();
}

class Jg implements MyFunctionalInterface{
    @Override
    public void accept() {
        System.out.println("이게 뭐냐구");

    }
}




