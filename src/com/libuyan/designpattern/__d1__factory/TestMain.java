package com.libuyan.designpattern.__d1__factory;

import com.libuyan.designpattern.__d1__factory.pizza.Pizza;
import com.libuyan.designpattern.__d1__factory.pizzaStore.ChicagoPizzaStore;
import com.libuyan.designpattern.__d1__factory.pizzaStore.NYPizzaStore;
import com.libuyan.designpattern.__d1__factory.pizzaStore.PizzaStore;

/**
 * @author libuyan
 * @date 2021/5/8 16:54
 */
public class TestMain {
    public static void main(String[] args) {
        PizzaStore nyPizzaStore = new NYPizzaStore();
        PizzaStore chicagoPizzaStore = new ChicagoPizzaStore();

        Pizza pizza = nyPizzaStore.orderPizza("cheesePizza");
        System.out.println("tom order a " + pizza.getName());

        Pizza cheesePizza = chicagoPizzaStore.orderPizza("cheesePizza");
        System.out.println("jack order a " + cheesePizza.getName());
    }
}
