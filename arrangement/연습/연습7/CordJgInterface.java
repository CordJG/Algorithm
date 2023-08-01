package 연습.연습7;
import java.util.*;
public class CordJgInterface {
    public static void main(String[] args) {

        CafeOwner cafeOwner = new CafeOwner();
        Customer A = new CustomerA();
        Customer B = new CustomerB();
        Menu menu = new Menu();
        Drink coffee = new Coffee("americano",4000,true);
        Drink beverage = new Bevarage("caffelatte",5000,true);


        menu.menuOpen();
        A.order();
        coffee.orderDrink();
        cafeOwner.giveItem(A);
        menu.menuOpen();
        B.order();
        beverage.orderDrink();
        cafeOwner.giveItem(B);
    }
}
//해결방법
// 메뉴에는 진짜 그냥 메뉴 오픈 기능만 넣는 느낌으로 하고
// 음료수의 가격,특수 정보 같은 건 인터페이스로 기본 음료 조건만든뒤
// 그 인터페이스를 implements 한 각종 음료에 넣는다
// 그리고 메뉴판에 불러온다.
// 그리고 다른 오더메서드에 인터페이스를 인자로 넣으면 될듯?
class Menu  {

    Coffee coffee = new Coffee("americano",4000,true);
    Bevarage beverage = new Bevarage("caffelatte",5000,true);



    public void menuOpen(){
        System.out.println("-".repeat(50));
        System.out.printf("1 : %s 가격 : %d ice (o,x)\n",coffee.getName(),coffee.getPrice());
        System.out.printf("2 : %s 가격 : %d ice (o,x)",beverage.getName(),beverage.getPrice());
        System.out.println();
        System.out.println();
        System.out.println("-".repeat(50));
    }
}

interface Drink{

    void orderDrink();

}

class Coffee implements Drink{
    Scanner sc = new Scanner(System.in);
    String name;
    int price;
    boolean ice;

    public Coffee(String name, int price, boolean ice){
        this.name = name;
        this.price = price;
        this.ice = ice;
    }

    public void orderDrink(){
        if(ice==true) name = "ice "+name;
        System.out.printf("%s 의 가격은 %d 입니다\n",name,price);

    }

    public String getName(){
        return name;
    }

    public int getPrice(){
        return price;
    }
}

class Bevarage implements Drink{
    Scanner sc = new Scanner(System.in);
    String name;
    int price;
    boolean ice;

    public Bevarage(String name, int price, boolean ice){
        this.name = name;
        this.price = price;
        this.ice = ice;
    }

    public void orderDrink(){
        if(ice==true) name = "ice"+name;
        System.out.printf("%s 의 가격은 %d 입니다\n",name,price);

    }

    String getName(){
        return name;
    }

    int getPrice(){
        return price;
    }
}

interface Customer{

    public void order();
    public void setName(String name);
    public String getName();

}

class CustomerA implements Customer {

    private String name = "고양이 키우고 싶은 남자";
    Scanner sc = new Scanner(System.in);

    public void order() {
        System.out.println("음료를 고르세요");
        int num = sc.nextInt();
        System.out.println(num + "번을 고르셨습니다");

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class CustomerB implements Customer{
    private String name = "노래 추천 괴물 윤아";

    Scanner sc = new Scanner(System.in);
    public void order(){
        System.out.println("음료를 고르세요");
        int num= sc.nextInt();
        System.out.println(num+"번을 고르셨습니다");
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class CafeOwner{

    public void giveItem(Customer customer){

        System.out.printf("%s 손님 음료 나왔습니다\n",customer.getName());
    }


}


