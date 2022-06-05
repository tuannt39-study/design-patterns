package vn.sapo.pattern.builder.gpcoder.builder;

import vn.sapo.pattern.builder.gpcoder.product.BreadType;
import vn.sapo.pattern.builder.gpcoder.product.Order;
import vn.sapo.pattern.builder.gpcoder.product.OrderType;
import vn.sapo.pattern.builder.gpcoder.product.SauceType;
import vn.sapo.pattern.builder.gpcoder.product.VegetableType;

public interface OrderBuilder {
    OrderBuilder orderType(OrderType orderType);

    OrderBuilder orderBread(BreadType breadType);

    OrderBuilder orderSauce(SauceType sauceType);

    OrderBuilder orderVegetable(VegetableType vegetableType);

    Order build();
}
