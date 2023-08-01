package 연습.연습1;

public class ConstructorExample {
    public static void main(String[] args) {

        Constructor consturctor1 = new Constructor();
        Constructor constructor2 = new Constructor("Hello World");
        Constructor constructor3 = new Constructor(5,10);
    }
}

class Constructor {
    Constructor() { // (1) 생성자 오버로딩
        System.out.println("1번 생성자");
    }

    Constructor(String str) {// (2)
        System.out.println("2번 생성자");
    }

    Constructor(int a, int b) {// (3)
        System.out.println("3번 생성자");
    }
}