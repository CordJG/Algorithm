package 연습2;

public class Interface {
    public static void main(String[] args) {
        Tiger tiger = new Tiger();
        Duck duck = new Duck();

        tiger.cry();
        tiger.play();
        duck.cry();
        duck.play();
    }
}

interface Animal{
    public abstract  void cry();
}

interface Pet {
    void play();
}

class Tiger implements Animal, Pet {
    public void cry(){
        System.out.println("어흥!");
    }

    public void play() {
        System.out.println("몸통 박치기");
    }
}

class Duck implements  Animal, Pet{
    public void cry(){
        System.out.println("꽥꽥");
    }

    public void play(){
        System.out.println("수영하기");
    }

}
