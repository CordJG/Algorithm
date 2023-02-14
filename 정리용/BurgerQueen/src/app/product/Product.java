package app.product;

public class Product {

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

    public Product(String name, int price, int kcal){
        this.name = name;
        this.price=price;
        this.kcal = kcal;
    }
    public void setId(int id) {
        this.id = id;

    }
    public int getId() {
        return id;

    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setPrice(int price){
        this.price = price;
    }

    public int getPrice(){
        return price;
    }

    public void setKcal(int kcal){
        this.kcal = kcal;
    }

    public int getKcal(){
        return kcal;
    }
}

