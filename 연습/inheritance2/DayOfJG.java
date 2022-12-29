package 연습.inheritance2;

import 연습.inheritance2.person.*;
import 연습.inheritance2.car.*;

public class DayOfJG {
    public static void main(String[] args) {

        System.out.println("이재관의 하루");

        Car bongbogn = new Car("벤츠", 20);
        Programmer JG = new Programmer("이재관", bongbogn, "코드스테이츠");

        JG.introduce();
        JG.commute();
        JG.work();
        JG.eat();
        JG.sleep();
    }
}
