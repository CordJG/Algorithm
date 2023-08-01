package 연습.연습1;

public class InterfaceExample {
    public static void main(String[] args) {
        User user = new User();
        user.callProvider(new Provider());
    }
}

class User {
    public void callProvider(Provider provider){
        provider.call();
    }
}

class Provider {
    public void call() {
        System.out.println("무야호~");
    }
}
