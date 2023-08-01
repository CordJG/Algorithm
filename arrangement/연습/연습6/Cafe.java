package 연습.연습6;

public class Cafe {
    public static void main(String[] args) {

        Coffee americano = new Coffee(4000,true,true);
        Coffee cafelatte =  new Coffee(4500, false,true);
        Beverage strawberry = new Beverage(6000, true,true);
        Beverage chocolatte = new Beverage( 6000, false,false);

        Customer customer = new Customer();
        customer.buy(new Cafelatte());
        customer.buy(chocolatte);
        customer.buy(strawberry);
        customer.buy(new Americano());


    }
}


class Customer {
    int money = 50000;

    void buy(Drink drink) {
        if(money < drink.price){
            System.out.println("잔액이 부족합니다.");
            return;
        }
        money = money - drink.price;
        System.out.println(drink + "를 구입했습니다.");
        System.out.println(money);

    }
}


// 음료 클래스를 상속받는 여러종류의 음료를 만들거고 그 음료들의 가격은 다르게 만들거야
// 그리고 각 음료들 마다 큰 차이가 종류가 있다면 그걸 특색에 맞춰 바꿀거야
// 음료의 공통적인 특징은? 가격을 갖고 있다 , 사이즈를 갖고 있다.
// 커피  -> 아메리카노, 카페라떼, 자바초코칩프라페(휘핑크림옵션)
// 음료는 -> 완전달달초코,딸기라떼,바닐라라떼,콜라

class Drink{
     int price;
     boolean sizeUp;

    Drink(int price, boolean sizeUp){
        if(sizeUp==true){
            this.price=price+500;
        }
        this.price=price;
        this.sizeUp=sizeUp;
    }
}

class Coffee extends Drink {
     boolean ice;

    Coffee(int price, boolean sizeUp,boolean ice) {
        super(price, sizeUp); this.ice=ice;
    }

}

class Americano extends Coffee{
    public Americano(){
        super(4000,true,true);
    }

    public String toString() {return "아메리카노";}
}

class Cafelatte extends Coffee{
    public Cafelatte(){
        super(5000,false,false);
    }

    public String toString() {return "카페라떼";}
}

class Beverage extends Drink {

    private boolean cream;

    Beverage(int price, boolean sizeUp, boolean cream) {
        super(price, sizeUp); this.cream=cream;
    }

    public String toString() {return "음료수";}
}







