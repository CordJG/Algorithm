package 연습.연습1;

public class Test {
    public static void main(String[] args) {
        Example example = new Example();
        Example example2 = new Example(5);
        Example example3 = new Example('c');
    }
}

class Example  {
    public Example() {


        System.out.println("Example의 기본 생성자 호출!!");
    };

    public Example(int x) {
        this();

        System.out.println("Example의 두 번째 생성자 호출!");
    }

    public Example(char y){
        this(2);
        System.out.println("Example의 세 번째 생성자 호출!");
    }
}
