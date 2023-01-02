package app;

import app.product.*;
import java.util.Scanner;

public class OrderApp {

    public void start(){

        Scanner scanner= new Scanner(System.in);

        ProductRepository productRepository = new ProductRepository();
        Product[] products = productRepository.getAllProducts();
        Menu menu = new Menu(products);

        System.out.println("🍔 BurgerQueen Order Service");
        menu.printMenu();
        String input = scanner.nextLine();

    }
}
