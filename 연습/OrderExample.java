package 연습;

interface Customer2 {
    public abstract String getOrder();


}
class CafeCustomer {
    public String CafeCustomerName;

    public void setCafeCustomerName(String CafeCustomerName){
        this.CafeCustomerName = CafeCustomerName;
    }
}

 class CafeCustomerA implements Customer2{
    public String getOrder(){
        return "a glass of iced americano" ;
    }


}
class CafeCustomerB implements  Customer2{
    public String getOrder(){
        return "a glass of strawberry latte" ;
    }


}

class CafeOwner {
    public void giveItem(Customer2 customer){
        System.out.println("Item : " + customer.getOrder());
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