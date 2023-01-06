package 연습2;

public class Lambda {

    public static void main(String[] args) throws Exception{


       MyFunctionalInterface example;
       example = (x) -> {
           int result = x * 5;
           System.out.println(result);
       };
       example.accept(2);

       example = (x) -> System.out.println(x * 5);
       example.accept(2);



    }
}

interface MyFunctionalInterface {
    void accept(int x);
}




