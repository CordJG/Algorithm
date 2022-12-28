package 연습;

public class Car {
    public static void main(String[] args) {
        Car2 c = new Car2("Model X", "빨간색", 250);
        System.out.println("제 차는 " + c.getModelName() + "이고, 컬러는 " +  c.getColor()
                + "이며, 최대 속력은 " +c.maxSpeed()+ "입니다.");
    }
}

class Car2 {
    private String modelName;
    private String color;
    private int maxSpeed;

    public Car2(String modelName, String color, int maxSpeed) {
        this.modelName = modelName;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }

    public String getModelName() {
        return modelName;
    }

    public String getColor() {
        return color;
    }

    public int maxSpeed(){
        return maxSpeed;
    }
}