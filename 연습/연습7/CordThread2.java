package 연습.연습7;

public class CordThread2 extends Thread {
    String skill_name;

    public CordThread2(String cmd) { // 생성자
        skill_name = cmd;
    }

    public void run() { // start() 메소드 사용 시
        System.out.println("시전한 스킬 : " + skill_name);

        for(int i = 1; i<=3; i++) {
            System.out.println(skill_name + " 스킬을 " + i + "초간 시전 중입니다..");
        }

        System.out.println("시전 끝난 스킬 : " + skill_name);
    }

    public static void main(String[] args) {
        String[] cmd = new String[] {"Q", "W", "E"};

        for(int i = 0; i<cmd.length; i++) {
            CordThread2 a = new CordThread2(cmd[i]);
            a.start(); // extends Thread 후 start() 메소드 사용 시 run() 메소드 수행하게 됨
        }
    }
}

