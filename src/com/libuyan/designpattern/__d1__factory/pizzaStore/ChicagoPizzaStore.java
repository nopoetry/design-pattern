package com.libuyan.designpattern.__d1__factory.pizzaStore;

import com.libuyan.designpattern.__d1__factory.pizza.ChicagoStyleCheesePizza;
import com.libuyan.designpattern.__d1__factory.pizza.Pizza;

/**
 * @author libuyan
 * @date 2021/5/8 16:49
 */
public class ChicagoPizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String name) {
        if ("cheesePizza".equals(name)) {
            return new ChicagoStyleCheesePizza();
        }
        return null;
    }
}
