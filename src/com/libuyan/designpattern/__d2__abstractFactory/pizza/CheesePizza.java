package com.libuyan.designpattern.__d2__abstractFactory.pizza;

import com.libuyan.designpattern.__d2__abstractFactory.ingredientFactory.IngredientFactory;

/**
 * @author libuyan
 * @date 2021/5/8 19:04
 */
public class CheesePizza extends Pizza {
    private IngredientFactory ingredientFactory;

    public CheesePizza(IngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
        name = "CheesePizza";
    }

    @Override
    public void prepare() {
        System.out.println("准备" + name);
        clam = ingredientFactory.createClam();
        cheese = ingredientFactory.createCheese();
    }
}
