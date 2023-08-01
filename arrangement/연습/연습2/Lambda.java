package 연습.연습2;

public class Lambda {

    public static void main(String[] args) throws Exception{

       MyFunctionalInterface example;
       example = (x,y) -> {
           int result = x + y;
           return result;
       };
       int result1 = example.accept(2, 5);
        System.out.println(result1);

       example = (x,y) -> {
           return x + y ; };
       int result2 = example.accept(2, 5);
        System.out.println(result2);

        example = (x , y) -> x+y; //return 문만 있을 경우, 중괄호 {} 와 return 문 생략가능
        int result3 = example.accept(2, 5);
        System.out.println(result3);

        example = (x,y) -> sum(x, y);
        int result4 = example.accept(2, 5);
        System.out.println(result4);
    }

    public static int sum(int x, int y) {
        return x+y;
    }
}

interface MyFunctionalInterface {
    int accept(int x, int y);
}




