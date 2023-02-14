package app;

import app.product.Product;
import app.product.ProductRepository;
import discount.Discount;
import discountCondition.CozDiscountCondition;
import discountCondition.DiscountCondition;
import discountCondition.KidDiscountCondition;
import discountPolicy.FixedAmountDiscountPolicy;
import discountPolicy.FixedRateDiscountPolicy;

public class AppConfigurer {

    private Cart cart = new Cart(productRepository(), menu());

    public ProductRepository productRepository() {
        return new ProductRepository();
    }

    public Menu menu() {
        return new Menu(productRepository().getAllProducts());
    }


    public Cart cart() {
        return cart ;
    }

    public Discount discount() {
        return new Discount(
                new DiscountCondition[]{
                        new CozDiscountCondition(new FixedRateDiscountPolicy(10)),
                        new KidDiscountCondition(new FixedAmountDiscountPolicy(500))
                });
    }

    public Order order() {
        return new Order(cart(), discount());
    }


}

