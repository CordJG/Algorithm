package 연습.연습4;

public class CordJgThread3 {
    public static void main(String[] args) {

        //익명 Runnable 구현 객체를 활용하여 스레드 생성
        //Thread thread1 = new Thread(new Runnable() {
            Thread thread2 = new Thread() {
                public void run() {
                    for (int i = 0; i < 100; i++) {
                        System.out.println("#");
                    }
                }
            };
       // });

        //thread1.start();
        thread2.start();

        for (int i=0; i< 100; i++) {
            System.out.println("@");
        }
    }
}
