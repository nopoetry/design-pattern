package com.libuyan.designpattern.__d2__abstractFactory;

import com.libuyan.designpattern.__d2__abstractFactory.pizza.Pizza;
import com.libuyan.designpattern.__d2__abstractFactory.pizzaStore.NYPizzaStore;
import com.libuyan.designpattern.__d2__abstractFactory.pizzaStore.PizzaStore;

/**
 * @author libuyan
 * @date 2021/5/8 19:17
 */
public class TestMain {
    public static void main(String[] args) {
        PizzaStore nyPizzaStore = new NYPizzaStore();
        Pizza cheesePizza = nyPizzaStore.orderPizza("cheesePizza");
        System.out.println(cheesePizza.toString());


    }
}
