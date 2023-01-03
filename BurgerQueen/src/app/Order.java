package app;

import discountCondition.CozDiscountCondition;
import discountCondition.DiscountCondition;
import discountCondition.KidDiscountCondition;
import discountPolicy.FixedAmountDiscountPolicy;
import discountPolicy.FixedRateDiscountPolicy;

public class Order {
    private Cart cart;
    private DiscountCondition[] discountConditions;

    public Order(Cart cart, DiscountCondition[] discountConditions){
        this.cart = cart;
        this.discountConditions = discountConditions;
    }

    public void makeOrder(){


        int sumPrice = cart.calculateTotalPrice();
        int finalPrice = sumPrice;

        for(DiscountCondition discountCondition : discountConditions){
            discountCondition.checkDiscountCondition();
            if (discountCondition.isSatisfied()) finalPrice = discountCondition.applyDiscount(finalPrice);
        }



        System.out.println("[📢] 주문이 완료되었습니다. ");
        System.out.println("[📢] 주문 내역은 다음과 같습니다. ");
        System.out.println("-".repeat(60));

        cart.printCartItemDetails();

        System.out.println("-".repeat(60));
        System.out.printf("금액 합계       : %d원\n",sumPrice);
    }


}
