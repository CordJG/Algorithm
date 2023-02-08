package 연습.Practice;

import  java.util.*;
public class FruitProject {
    public static void main(String[] args) {

        Fruit fruit = new Fruit();
        Repository repo = new Repository();

        System.out.println(repo.addList());

        System.out.println(repo.Apple.getName());



        }


}


class Repository{
    Fruit Apple = new Fruit("사과","빨강",1000);
    Fruit Grape = new Fruit("포토","보라",1500);
    Fruit Mango = new Fruit("망고", "노랑",2000);

    Fruit[] fruits = new Fruit[]{Apple,Grape,Mango};

    List<Fruit> list = new ArrayList<>();

    void addRepo(Fruit fruit) {
        list.add(fruit);
    }

    List<Fruit> addList() {
        for (int i = 0; i < fruits.length; i++) {

            addRepo(fruits[i]);
        }
        return list;
    }

    void printRepo(){
        System.out.println("-".repeat(50));
        for(lists : lis){
            if(a instanceof )
        }

    }


}




class Apple extends Fruit{

    public Apple(String name,String color, int price){
        super(name, color, price);

    }
}

class Grape extends Fruit{

    public Grape(String name,String color, int price){
        super(name, color, price);

    }
}

class Mango extends Fruit{
    public Mango(String name,String color, int price){
        super(name, color, price);
    }
}


class Fruit{
    private String name;
    private String color;
    private int price;

    public Fruit(String name, String color, int price){
        this.name = name;
        this.color =color;
        this.price = price;
    }

    public Fruit(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}