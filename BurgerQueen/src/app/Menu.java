package app;
import app.product.*;
import app.product.subproduct.*;


public class Menu {
    private final Product[] products;

    public Menu(Product[] products) {
        this.products = products;
    }

    public void printMenu(){
        System.out.println("[🔻] 메뉴");
        System.out.println("-".repeat(60));

        printHamburgers(true);
        printSides(true);
        printDrinks(true);

        System.out.println(" ");
        System.out.println("🛒 (0) 장바구니");
        System.out.println("💰 (+) 주문하기");
        System.out.println("-".repeat(60));
        System.out.println("[📢] 메뉴를 선택해주세요 : ");
    }

    protected void printDrinks(boolean printPirce) {
        System.out.println("🥤 음료");
        for(Product product : products){
            if(product instanceof Drink){
                printEachMenu(product, printPirce);
            }
        }

        System.out.println(" ");
    }

    protected void printSides(boolean printPirce) {
        System.out.println("🍟 사이드");
        for(Product product : products){
            if(product instanceof Side){
                printEachMenu(product,printPirce);
            }
        }
        System.out.println("   ");
    }

    protected void printHamburgers(boolean printPirce) {
        System.out.println("🍔 햄버거");
        for(Product product : products) {
            if(product instanceof Hamburger) {
                printEachMenu(product,printPirce);
            }
        }
        System.out.println("                                             ");
    }

    private static void printEachMenu(Product product, boolean printPrice) {
        if(printPirce) System.out.printf("   (%d) %s %5dKcal %5d원\n", product.getId(), product.getName(), product.getKcal(), product.getPrice());
        else System.out.printf("   (%d) %s %5dKcal\n", product.getId(), product.getName(), product.getKcal());

    }
}
