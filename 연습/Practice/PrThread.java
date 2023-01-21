package 연습.Practice;

public class PrThread {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        a.play();
        System.out.println();
        b.play();

    }
}

class A {
    void play() {
        for (int i = 0; i < 4; i++) {
            System.out.println("첫번째 " + i + " 입니다");
        }
    }
}

    class B {
        void play() {
            for (int i = 0; i < 4; i++) {
                System.out.println("두번째 " + i + " 입니다");
            }
        }
    }

