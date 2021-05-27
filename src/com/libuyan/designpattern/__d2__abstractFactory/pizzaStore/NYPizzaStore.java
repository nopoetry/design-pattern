package com.libuyan.designpattern.__d2__abstractFactory.pizzaStore;

import com.libuyan.designpattern.__d2__abstractFactory.ingredientFactory.IngredientFactory;
import com.libuyan.designpattern.__d2__abstractFactory.ingredientFactory.NYIngredientFactory;
import com.libuyan.designpattern.__d2__abstractFactory.pizza.CheesePizza;
import com.libuyan.designpattern.__d2__abstractFactory.pizza.ClamPizza;
import com.libuyan.designpattern.__d2__abstractFactory.pizza.Pizza;

/**
 * @author libuyan
 * @date 2021/5/8 16:49
 */
public class NYPizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String name) {
        IngredientFactory ingredientFactory = new NYIngredientFactory();
        if ("cheesePizza".equals(name)) {
            return new CheesePizza(ingredientFactory);
        } else if ("clamPizza".equals(name)) {
            return new ClamPizza(ingredientFactory);
        }
        return null;
    }
}
