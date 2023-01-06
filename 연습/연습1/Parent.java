package 연습.연습1;

class Modifier {
    public static void main(String[] args) {
        Parent p = new Parent();

        p.printEach();

        //System.out.println(p.a);
        System.out.println(p.b);
        System.out.println(p.c);
        System.out.println(p.d);
    }
}

public class Parent{
    private int a = 2;
    int b = 3;
    protected int c = 4;
    public double d = 5.0;

    public void printEach(){
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }


}
