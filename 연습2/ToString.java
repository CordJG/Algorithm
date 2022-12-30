package 연습2;

public class ToString {
    public static void main(String[] args) {
        Plus plus = new Plus(3, 5, 8);
        System.out.println(plus);
        System.out.println(plus.toString());
    }

    static class Plus {

        private int a;
        private int b;
        private int c;

        Plus(int a, int b, int c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }
        public String toString(){
            return ("("+a+"+"+b+")"+"="+c);
        }

    }
}





