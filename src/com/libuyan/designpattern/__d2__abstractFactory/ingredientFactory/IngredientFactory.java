package com.libuyan.designpattern.__d2__abstractFactory.ingredientFactory;

import com.libuyan.designpattern.__d2__abstractFactory.ingredient.Cheese;
import com.libuyan.designpattern.__d2__abstractFactory.ingredient.Clam;

/**
 * @author libuyan
 * @date 2021/5/8 19:05
 */
public interface IngredientFactory {
    Clam createClam();

    Cheese createCheese();
}
