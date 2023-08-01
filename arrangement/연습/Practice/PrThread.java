package 연습.Practice;

public class PrThread extends Thread {

    String name ;

    public PrThread(String a){name=a;}

    public void run() {

        System.out.println("내 이름은 "+name+"입니다");
        for (int i = 0; i < 4; i++) {
            System.out.println("첫번째 " + i + " 입니다");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        String[] a = {"이재관","고양이","코딩"};
        for(int i=0; i<a.length; i++) {
            PrThread pr = new PrThread(a[i]);
            pr.start();
            System.out.println();
        }
    }
}




