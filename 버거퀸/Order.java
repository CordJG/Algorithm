package 버거퀸;

import java.util.Scanner;

public class Order {
    Menu menu= new Menu();
    String ordnum;

    void order(){
        menu.menupan();
        Scanner scanner=new Scanner(System.in);
        String ordnum = Integer.toString((scanner.nextInt()));

        System.out.println("[📢] 메뉴를 선택해주세요 : "+ordnum);
        if(ordnum=="1" || ordnum=="2"){
            System.out.println("단품으로 주문하시겠어요? (1)_단품(3500) (2)_세트(4500원)");
        }else if(ordnum=="3" || ordnum=="4"){
            System.out.println("케첩은 몇개가 필요하신가요?");
        }else if(ordnum=="5" || ordnum=="6"){
            System.out.println("빨대가 필요하신가요? (1)_예 (2)_아니오");
        }else{
            System.out.println("없는 메뉴입니다!!");
        }



    }



}
