public class Example {
    public static void main(String[] args) {


        Hello hello = () -> System.out.println("hello!");

        hello.sayHi();
    }

    public void example() {
        System.out.println("hello!");
    }
}

interface Hello {

    void sayHi();
}

/*
* 람다식
* -> 메서드를 하나의 식으로 표현한 것
*
* */