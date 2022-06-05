package vn.sapo.pattern.builder.sourcemaking.abstractbuilder;

import vn.sapo.pattern.builder.sourcemaking.product.Pizza;

public abstract class PizzaBuilder {
    protected Pizza pizza;

    public Pizza getPizza() {
        return pizza;
    }

    public void createNewPizzaProduct() {
        pizza = new Pizza();
    }

    public abstract void buildDough();
    public abstract void buildSauce();
    public abstract void buildTopping();
}
