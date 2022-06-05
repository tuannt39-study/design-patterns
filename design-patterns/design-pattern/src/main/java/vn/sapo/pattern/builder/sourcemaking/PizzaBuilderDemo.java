package vn.sapo.pattern.builder.sourcemaking;

import vn.sapo.pattern.builder.sourcemaking.abstractbuilder.PizzaBuilder;
import vn.sapo.pattern.builder.sourcemaking.concrete.HawaiianPizzaBuilder;
import vn.sapo.pattern.builder.sourcemaking.concrete.SpicyPizzaBuilder;
import vn.sapo.pattern.builder.sourcemaking.director.Waiter;
import vn.sapo.pattern.builder.sourcemaking.product.Pizza;

public class PizzaBuilderDemo {

    public static void main(String[] args) {
        Waiter waiter = new Waiter();
        PizzaBuilder hawaiianPizzabuilder = new HawaiianPizzaBuilder();
        PizzaBuilder spicyPizzaBuilder = new SpicyPizzaBuilder();

        waiter.setPizzaBuilder( hawaiianPizzabuilder );
        waiter.constructPizza();

        Pizza pizza = waiter.getPizza();
        System.out.println(pizza);
    }
}
