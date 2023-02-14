package 내가만든버거퀸;

public class Menu {

    Food[] foods = new Food[]{

    };

    Burger burger1 = new Burger(1, "새우버거", 500, 3500);
    Burger burger2 = new Burger( 2, "치킨버거", 600, 4000);
    Side side1 = new Side(3, "감자튀김", 300, 1000);
    Side side2 = new Side(4,"어니언링",300,1000);
    Drink drink1 = new Drink(5, "코카콜라", 200, 1000);
    Drink drink2 = new Drink(6, "제로콜라", 0, 1000);

    Basket basket = new Basket();

    void menupan(){
        System.out.println("🍔 BurgerQueen Order Service");
        System.out.println("[🔻] 메뉴");
        System.out.println("-".repeat(50));
        System.out.println("🍔 햄버거");
        System.out.println("   "+"("+burger1.num+")"+" "+burger1.type+"   "+burger1.kcal+"Kcal"+"  "+burger1.price+"원");
        System.out.println("   "+"("+burger2.num+")"+" "+burger2.type+"   "+burger2.kcal+"Kcal"+"  "+burger2.price+"원");
        System.out.println("                                             ");
        System.out.println("🍟 사이드");
        System.out.println("   "+"("+side1.num+")"+" "+side1.type+"   "+side1.kcal+"Kcal"+"  "+side1.price+"원");
        System.out.println("   "+"("+side2.num+")"+" "+side2.type+"   "+side2.kcal+"Kcal"+"  "+side2.price+"원");
        System.out.println("   ");
        System.out.println("🥤 음료");
        System.out.println("   "+"("+drink1.num+")"+" "+drink1.type+"   "+drink1.kcal+"Kcal"+"  "+drink1.price+"원");
        System.out.println("   "+"("+drink2.num+")"+" "+drink2.type+"   "+drink2.kcal+"Kcal"+"  "+drink2.price+"원");
        System.out.println("");
        System.out.println("");
        System.out.println("🛒 ("+basket.basket+") 장바구니");
        System.out.println("💰 ("+basket.buy+") 주문하기");
        System.out.println("-".repeat(50));
        System.out.println("[📢] 메뉴를 선택해주세요 : ");

     }
}
