package 연습.Practice;

public class Thread3 implements Runnable {

    @Override
    public void run() {
        System.out.println("안녕");
    }

    public static void main(String[] args) {
        Thread thread = new Thread(new Thread3());
        thread.start();
    }
}
