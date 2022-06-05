package vn.sapo.pattern.builder.gpcoder.concretebuilder;

import vn.sapo.pattern.builder.gpcoder.builder.OrderBuilder;
import vn.sapo.pattern.builder.gpcoder.product.BreadType;
import vn.sapo.pattern.builder.gpcoder.product.Order;
import vn.sapo.pattern.builder.gpcoder.product.OrderType;
import vn.sapo.pattern.builder.gpcoder.product.SauceType;
import vn.sapo.pattern.builder.gpcoder.product.VegetableType;

public class FastFoodOrderBuilder implements OrderBuilder {

    private OrderType orderType;
    private BreadType breadType;
    private SauceType sauceType;
    private VegetableType vegetableType;

    @Override
    public OrderBuilder orderType(OrderType orderType) {
        this.orderType = orderType;
        return this;
    }

    @Override
    public OrderBuilder orderBread(BreadType breadType) {
        this.breadType = breadType;
        return this;
    }

    @Override
    public OrderBuilder orderSauce(SauceType sauceType) {
        this.sauceType = sauceType;
        return this;
    }

    @Override
    public OrderBuilder orderVegetable(VegetableType vegetableType) {
        this.vegetableType = vegetableType;
        return this;
    }

    @Override
    public Order build() {
        return new Order(orderType, breadType, sauceType, vegetableType);
    }

}
