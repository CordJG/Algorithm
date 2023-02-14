package 연습.연습1;

public class Basket <T>{
    private T item;

    public Basket(T item){
        this.item = item;
    }

    public T getItem() {
        return item;
    }

    public void setItem(T item){
        this.item = item;
    }
}

class Item{
    String item;

    public static void main(String[] args) {


        Basket<Boolean> basket = new Basket<Boolean>(true);

        System.out.println(basket.getItem());





    }
}
