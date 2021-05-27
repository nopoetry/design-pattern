package com.libuyan.designpattern.__d2__abstractFactory.pizza;

import com.libuyan.designpattern.__d2__abstractFactory.ingredientFactory.IngredientFactory;

/**
 * @author libuyan
 * @date 2021/5/8 19:12
 */
public class ClamPizza extends Pizza {
    private IngredientFactory ingredientFactory;

    public ClamPizza(IngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
        name = "ClamPizza";
    }

    @Override
    public void prepare() {
        clam = ingredientFactory.createClam();
        cheese = ingredientFactory.createCheese();
    }
}
