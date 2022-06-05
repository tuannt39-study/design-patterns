package vn.sapo.pattern.builder.sourcemaking.concrete;

import vn.sapo.pattern.builder.sourcemaking.abstractbuilder.PizzaBuilder;

public class HawaiianPizzaBuilder extends PizzaBuilder {
    public void buildDough() {
        pizza.setDough("cross");
    }

    public void buildSauce() {
        pizza.setSauce("mild");
    }

    public void buildTopping() {
        pizza.setTopping("ham+pineapple");
    }

}
