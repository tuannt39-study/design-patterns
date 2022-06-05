package vn.sapo.pattern.builder.sourcemaking.director;

import vn.sapo.pattern.builder.sourcemaking.abstractbuilder.PizzaBuilder;
import vn.sapo.pattern.builder.sourcemaking.product.Pizza;

public class Waiter {
    private PizzaBuilder pizzaBuilder;

    public void setPizzaBuilder(PizzaBuilder pb) {
        pizzaBuilder = pb;
    }

    public Pizza getPizza() {
        return pizzaBuilder.getPizza();
    }

    public void constructPizza() {
        pizzaBuilder.createNewPizzaProduct();
        pizzaBuilder.buildDough();
        pizzaBuilder.buildSauce();
        pizzaBuilder.buildTopping();
    }
}
