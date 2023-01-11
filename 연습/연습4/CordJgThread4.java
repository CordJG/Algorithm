package 연습.연습4;

public class CordJgThread4 {
    public static void main(String[] args) {

        Runnable threadTask3= new ThreadTask3();
        Thread thread3_1 = new Thread(threadTask3);
        Thread thread3_2 = new Thread(threadTask3);

        thread3_1.setName("김코딩");
        thread3_2.setName("박자바");

        thread3_1.start();
        thread3_2.start();

    }
}

class Account {

    //잔액을 나타내는 변수
    private int balance = 1000;

    public int getBalance() {
        return balance;
    }

    //인출 성공 시 true, 실패 시 false 반환
    public synchronized boolean withdraw(int money) {

        // 인출 가능 여부 판단 : 잔액이 인출하고자 하는 금액보다 같거나 많아야 합니다.
        if(balance >= money) {

            //if 문의 실행부에 진입하자마자 해당 스레드를 일시 정지 시키고,
            //다른 스레드에게 제어권을 강제로 넘깁니다.
            //일부러 문제 상황을 발생시키기 위해 추가한 코드입니다.
            try {
                Thread.sleep(1000);
            } catch (Exception error) {
            }

            // 잔액에서 인출금을 깎아 새로운 잔액을 기록합니다.
            balance -= money;

            return true;
        }
        return false;

    }
}

class ThreadTask3 implements Runnable {
    Account account = new Account();
    CordJgThread4 thread4 = new CordJgThread4();

    public void run() {
        while (account.getBalance() > 0) {

            // 100~300원의 인출금을 랜덤으로 정합니다.
            int money = (int) (Math.random() * 3 + 1) * 100;

            // withdraw를 실행시키는 동시에 인출 성공 여부를 변수에 할당합니다.
            boolean denied = !account.withdraw(money);

            // 인출 결과 확인
            // 만약, withraw가 false를 리턴하였다면, 즉 인출에 실패했다면,
            // 해당 내역에 -> DENIED를 출력합니다.
            System.out.println(String.format("Withdraw %d$ By %s. Balance : %d %s",
                    money, Thread.currentThread().getName(), account.getBalance(), denied ? "-> Denied" : "")
            );



        }
    }
}