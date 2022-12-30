package 연습;

class CafeCustomer {
    public String CafeCustomerName;

    public void setCafeCustomerName(String CafeCustomerName){
        this.CafeCustomerName = CafeCustomerName;
    }
}

 class CafeCustomerA extends CafeCustomer{


}
class CafeCustomerB extends CafeCustomer{


}

class CafeOwner {
    public void giveItem(CafeCustomerB cafeCustomerB){
        System.out.println("give a glass of strawberry latte to CafeCustomer B");
    }

    public void giveItem(CafeCustomerA cafeCustomerA) {
        System.out.println("give a glass of iced americano to CafeCustomer A");
    }
}

public class OrderExample {
    public static void main(String[] args) throws Exception {
        CafeOwner cafeowner = new CafeOwner();
        CafeCustomerA a = new CafeCustomerA();
        CafeCustomerB b = new CafeCustomerB();

        cafeowner.giveItem(a);
        cafeowner.giveItem(b);

    }
}