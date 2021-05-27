package com.libuyan.designpattern.__d2__abstractFactory.ingredientFactory;

import com.libuyan.designpattern.__d2__abstractFactory.ingredient.Cheese;
import com.libuyan.designpattern.__d2__abstractFactory.ingredient.Clam;
import com.libuyan.designpattern.__d2__abstractFactory.ingredient.FreshClam;
import com.libuyan.designpattern.__d2__abstractFactory.ingredient.NYCheese;

/**
 * @author libuyan
 * @date 2021/5/8 19:07
 */
public class NYIngredientFactory implements IngredientFactory {
    @Override
    public Clam createClam() {
        return new FreshClam();
    }

    @Override
    public Cheese createCheese() {
        return new NYCheese();
    }
}
