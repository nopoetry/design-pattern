package com.libuyan.designpattern.__j__composite.menu;

import com.libuyan.designpattern.__j__composite.iterator.NullIterator;

import java.util.Iterator;

/**
 * @author libuyan
 * @date 2021/5/12 9:35
 */
public class MenuItem extends MenuComponent {
    private String name;
    private int price;
    private boolean vegetarian;

    public MenuItem(String name, int price, boolean vegetarian) {
        this.name = name;
        this.price = price;
        this.vegetarian = vegetarian;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public boolean isVegetarian() {
        return vegetarian;
    }

    @Override
    public String toString() {
        return "MenuItem{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", vegetarian=" + vegetarian +
                '}';
    }

    @Override
    public void print() {
        System.out.println(toString());
    }

    @Override
    public Iterator createIterator() {
        return new NullIterator();
    }
}
