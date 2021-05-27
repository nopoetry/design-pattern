package com.libuyan.designpattern.__d2__abstractFactory.pizzaStore;


import com.libuyan.designpattern.__d2__abstractFactory.pizza.Pizza;

/**
 * @author libuyan
 * @date 2021/5/8 16:41
 */
public abstract class PizzaStore {
    public Pizza orderPizza(String name) {
        Pizza pizza = createPizza(name);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

    /**
     * 根据名字 创建pizza的工厂
     * @param name pizza的名字
     * @return pizza
     */
    public abstract Pizza createPizza(String name);
}
