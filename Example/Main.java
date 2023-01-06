public class Main {
    public static void main(String[] args) {

        Person younghyun = new Person() {

            private void work() {
                System.out.println("근무 시작!");
                System.out.println("퇴근!");
            }

            @Override
            public void live() {
                super.wake();
                super.eat();
                work();
                super.sleep();
            }
        };

        Workable minsang = new Workable() {

            private void workOverTime() {
                System.out.println("야근 중...ㅠㅠ");
            }

            @Override
            public void work() {
                System.out.println("수업 중...");
                workOverTime();
            }
        };

        younghyun.live();
        minsang.work();
    }
}

interface Workable {
    void work();
}

class Person {

    public void wake() {
        System.out.println("기상!");
    }

    public void eat() {
        System.out.println("냠냠냠");
    }

    public void sleep() {
        System.out.println("쿨쿨쿨...zzZ");
    }

    public void live() {
        wake();
        eat();
        sleep();
    }
}

/*
* 익명 객체 : 이름이 없는 일회용 객체
*
* - 익명 자식 객체
*   -> 부모클래스를 상속 받아서 생성
*   -> 부모 타입의 참조변수에 할당 가능
*   -> 익명 자식 객체를 만들 때, 중괄호 블록 내에는 보통
*      상위 클래스의 메서드를 재정의하는 코드가 작성된다.
*
*
* - 익명 구현 객체
*   -> 인터페이스를 구현해서 생성
*   -> 인터페이스 타입의 참조변수에 할당할 수 있다.
*   -> 익명 구현 객체를 만들 때, 중괄호 블록 내에는 인터페이스의
*      추상 메서드를 구현하는 코드가 작성된다.
* */