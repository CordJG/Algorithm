package 연습.연습6;

public class CordJgExtends {
    public static void main(String[] args) {

        Jg jg = new Jg();



    }
}

class Jg {

    public String toString() {

        return "이렇게?";


    }
}


class Cat extends Jg{
    Cat(){
        super();
        System.out.println("진짜 오류 나오냐?");
    }
}