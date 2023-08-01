package 연습.연습1;

public class Super {
    public static void main(String[] args) {
    Student s = new Student();
    }
}

class Human {
    Human() {
        System.out.println("휴먼 클래스 생성자");
    }
}

class Student extends Human { // Human 클래스로부터 상속
    Student() {
        super(); // Human 클래스의 생성자 호출
        System.out.println("학생 클래스 생성자");
    }
}


