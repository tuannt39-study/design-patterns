package vn.sapo.pattern.builder.gpcoder.director;

import vn.sapo.pattern.builder.gpcoder.concretebuilder.FastFoodOrderBuilder;
import vn.sapo.pattern.builder.gpcoder.product.BreadType;
import vn.sapo.pattern.builder.gpcoder.product.Order;
import vn.sapo.pattern.builder.gpcoder.product.OrderType;
import vn.sapo.pattern.builder.gpcoder.product.SauceType;

public class Client {

    public static void main(String[] args) {
        Order order = new FastFoodOrderBuilder()
            .orderType(OrderType.ON_SITE).orderBread(BreadType.OMELETTE)
            .orderSauce(SauceType.SOY_SAUCE).build();
        System.out.println(order);
    }
}
