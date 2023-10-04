package codingTest.bronze.기타;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bj5543 {
    static int inputN=5;
    static List<Integer> burgerList = new ArrayList<>();
    static List<Integer> drinkList = new ArrayList<>();
    static int minBurgerPrice;
    static int minDrinkPrice;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(inputN>0){
            int price = sc.nextInt();
            if (inputN > 2) {
                burgerList.add(price);
            } else {
                drinkList.add(price);
            }
            inputN-=1;
        }

        minBurgerPrice = 2000;
        minDrinkPrice = 2000;
        for (int burgerPrice : burgerList) {
            if (minBurgerPrice > burgerPrice) {
                minBurgerPrice = burgerPrice;
            }
        }

        for (int drinkPrice : drinkList) {
            if (minDrinkPrice > drinkPrice) {
                minDrinkPrice = drinkPrice;
            }
        }

        int setPrice = minBurgerPrice + minDrinkPrice -50;

        System.out.println(setPrice);
    }
}
