package 연습.Practice;

class Coffee {
    private String name;
    private int price;


    public Coffee(String name, int price) {
        this.name = name;
        this.price = price;
    }

}


public class JsonExample {
        public static void main(String[] args) {
            Coffee coffee = new Coffee("아메리카노", 3000);
//            Gson gson = new Gson();
//            String jsonString = gson.toJson(coffee);

//            System.out.println(jsonString);
        }
    }