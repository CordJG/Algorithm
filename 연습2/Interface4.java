package 연습2;

interface Cover {
    public abstract void call();
}
public class Interface4 {
    public static void main(String[] args) {
        User user = new User();
        user.callProvider(new Provider2());
    }
}

class User {
    public void callProvider(Cover cover){
        cover.call();
    }
}

class Provider implements Cover {
    public void call() {
        System.out.println("무야호~");
    }
}

class Provider2 implements Cover {
    public void call() {
        System.out.println("야호~");
    }
}