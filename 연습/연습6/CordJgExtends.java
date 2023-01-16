package 연습.연습6;

public class CordJgExtends {
    public static void main(String[] args) {
        Cat cat = new Cat();

    }
}

class Jg{
    Jg(){
        System.out.println("오류는 나올 수가 없네 애초에 ㄷㄷ");
    }
}


class Cat extends Jg{
    Cat(){
        super();
        System.out.println("진짜 오류 나오냐?");
    }
}