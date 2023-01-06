package 연습.연습2;

import 연습.연습1.Parent;

    class Child extends Parent {  // package1으로부터 Parent 클래스를 상속
        public void printEach() {
            // System.out.println(a); // 에러 발생!
            // System.out.println(b);
            System.out.println(c); // 다른 패키지의 하위 클래스
            System.out.println(d);
        }
    }

    public class Parent2 {
        public static void main(String[] args) {
            Parent p = new Parent();
            Child c = new Child();

            c.printEach();

//        System.out.println(p.a); // public을 제외한 모든 호출 에러!
//        System.out.println(p.b);
//       System.out.println(p.c);
            System.out.println(p.d);
        }
    }
