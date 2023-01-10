package 연습4;

public class CordJgThread {
    public static void main(String[] args) {

        // Runnable 인터페이스를 구현한 객체 생성
        Runnable task1 = new ThreadTask1();

        // Runnable 구현 객체를 인자로 전달하면서 Thread 클래스를 인스턴스화하여 스레드를 생성
        Thread thread1 = new Thread(task1);

        // 위의 두 줄을 아래와 같이 한 줄로 축약할 수도 있습니다.
        // Thread thread1 = new Thread(new ThreadTask1());

        //작업 스레드를 실행시켜, run() 내부의 코드를 처리하도록 합니다.

        thread1.start();

        for (int i = 0; i< 100; i++) {
            System.out.println("@");
        }


    }
}

// Runnable 인터페이스를 구현하는 클래스
class ThreadTask1 implements Runnable {
    public void run() {

        // run() 메서드 바디에 스레드가 수행할 작업 내용 작성
            for (int i = 0; i< 100; i++) {
                System.out.println("#");
            }
    }
}
