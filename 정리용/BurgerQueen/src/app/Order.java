package app;

import discountCondition.CozDiscountCondition;
import discountCondition.DiscountCondition;
import discountCondition.KidDiscountCondition;
import discountPolicy.FixedAmountDiscountPolicy;
import discountPolicy.FixedRateDiscountPolicy;
import discount.*;

public class Order {
    private Cart cart;

    private Discount discount;


    public Order(Cart cart, Discount discount){
        this.cart = cart;
        this.discount   = discount;
    }

    public void makeOrder(){

        discount.checkAllDiscountConditions();

        int sumPrice = cart.calculateTotalPrice();
        int finalPrice = discount.discount(sumPrice);



        System.out.println("[📢] 주문이 완료되었습니다. ");
        System.out.println("[📢] 주문 내역은 다음과 같습니다. ");
        System.out.println("-".repeat(60));

        cart.printCartItemDetails();

        System.out.println("-".repeat(60));
        System.out.printf("금액 합계       : %d원\n",sumPrice);
        System.out.printf("할인 금액       : %d원\n",finalPrice-sumPrice);
        System.out.printf("최종 금액       : %d원\n",finalPrice);
    }


}
