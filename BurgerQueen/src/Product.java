class Product {

    private int id;
    private String name;
    private int price;
    private int kcal;

    public Product(int id, String name, int price, int kcal) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.kcal = kcal;
    }
}


class Hamburger extends Product {

    boolean isBurgerSet;
    int burgerSetPrice;
}

class Side extends  Product{

    int ketchup;
}

class Drink extends Product {

    boolean straw;
}

class Burgerset extends Product {

    Hamburger hamburger;    //포함 관계
    Side side;
    Drink drink;
}
