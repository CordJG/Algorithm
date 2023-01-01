package 버거퀸;

import java.util.Scanner;

public class Order {
    Basket ba = new Basket();
    Food food = new Food();
    Menu menu = new Menu();
    int setopt;
    int sideopt;
    int drinkopt;
    int ketchupopt;
    int strawopt;



    void order() {
        Scanner scanner = new Scanner(System.in);

            menu.menupan();
            food.num = Integer.parseInt((scanner.nextLine()));
            System.out.println("[📢] 메뉴를 선택해주세요 : " + food.num);
            if (food.num == 1 || food.num == 2) {
                System.out.println("단품으로 주문하시겠어요? (1)_단품(3500) (2)_세트(4500원)");
                setopt = Integer.parseInt((scanner.nextLine()));
                if (setopt == 1) {
                    if (food.num == 1) {
                        System.out.println("[📢] " + menu.burger1.type + "를(을) 장바구니에 담았습니다.");


                    } else if (food.num == 2) {
                        System.out.println("[📢] " + menu.burger2.type + "를(을) 장바구니에 담았습니다.");

                    } else {
                        System.out.println("잘못 누르셨습니다!!");

                    }


                } else if (setopt == 2) {
                    System.out.println("사이드를 골라주세요");
                    System.out.println("🍟 사이드");
                    System.out.println("   " + "(" + menu.side1.num + ")" + " " + menu.side1.type + "   " + menu.side1.kcal + "Kcal");
                    System.out.println("   " + "(" + menu.side2.num + ")" + " " + menu.side2.type + "   " + menu.side2.kcal + "Kcal");
                    sideopt = Integer.parseInt((scanner.nextLine()));
                    System.out.println("  ");
                    System.out.println(sideopt);
                    System.out.println("케첩은 몇개가 필요하신가요?");
                    ketchupopt = Integer.parseInt((scanner.nextLine()));
                    System.out.println(ketchupopt);
                    System.out.println("음료를 골라주세요");
                    System.out.println("🥤 음료");
                    System.out.println("   " + "(" + menu.drink1.num + ")" + " " + menu.drink1.type + "   " + menu.drink1.kcal + "Kcal");
                    System.out.println("   " + "(" + menu.drink2.num + ")" + " " + menu.drink2.type + "   " + menu.drink2.kcal + "Kcal");
                    System.out.println("  ");
                    drinkopt = Integer.parseInt((scanner.nextLine()));
                    System.out.println(drinkopt);
                    System.out.println("빨대가 필요하신가요? (1)_예 (2)_아니오");
                    strawopt = Integer.parseInt((scanner.nextLine()));
                    System.out.println(strawopt);

                }
            } else if (food.num == 3 || food.num == 4) {
                System.out.println("케첩은 몇개가 필요하신가요?");
                ketchupopt = Integer.parseInt((scanner.nextLine()));
                System.out.println(ketchupopt);
                if (food.num == 3) {
                    System.out.println("[📢] " + menu.side1.type + "를(을) 장바구니에 담았습니다.");

                } else if (food.num == 4) {
                    System.out.println("[📢] " + menu.side2.type + "를(을) 장바구니에 담았습니다.");

                } else {
                    System.out.println("잘못 누르셨습니다!!");

                }
            } else if (food.num == 5 || food.num == 6) {
                System.out.println("빨대가 필요하신가요? (1)_예 (2)_아니오");
                strawopt = Integer.parseInt((scanner.nextLine()));
                System.out.println(strawopt);
                if (food.num == 5) {
                    System.out.println("[📢] " + menu.drink1.type + "를(을) 장바구니에 담았습니다.");

                } else if (food.num == 6) {
                    System.out.println("[📢] " + menu.drink2.type + "를(을) 장바구니에 담았습니다.");

                } else {
                    System.out.println("잘못 누르셨습니다!!");

                }
            } else if (food.num == 0) {
                ba.basket();
            } else if (food.num == Integer.parseInt("+")){
                System.out.println("결제완료");

            } else{
                System.out.println("없는 번호입니다");
            }


            }


        }





