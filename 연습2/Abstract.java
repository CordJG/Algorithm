package 연습2;

abstract class Abstract {
    public String kind;
    public abstract void sound();

}

class Dog extends Abstract{
    public Dog(){
        this.kind ="포유류";
    }
    public void sound() {
        System.out.println("멍멍");
    }

}

class Cat extends Abstract{
    public Cat() {
        this.kind = "포유류";
    }

    public void sound() {
        System.out.println("야옹");
    }
}

class DogExample {
    public static void main(String[] args) throws Exception {
        Abstract dog = new Dog();
        dog.sound();

        Cat cat = new Cat ();
        cat.sound();

    }
}