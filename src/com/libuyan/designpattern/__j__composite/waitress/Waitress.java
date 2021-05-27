package com.libuyan.designpattern.__j__composite.waitress;


import com.libuyan.designpattern.__j__composite.menu.MenuComponent;

import java.util.Iterator;

/**
 * @author libuyan
 * @date 2021/5/11 21:15
 */
public class Waitress {
    private MenuComponent menuComponent;

    public Waitress(MenuComponent menuComponent) {
        this.menuComponent = menuComponent;
    }

    public void print() {
        menuComponent.print();
    }

    public void printVegetarianMenu() {
        Iterator<MenuComponent> iterator = menuComponent.createIterator();
        System.out.println("素菜菜单");
        while (iterator.hasNext()) {
            MenuComponent menuComponent = iterator.next();
            try {
                if (menuComponent.isVegetarian()) {
                    menuComponent.print();
                }
            } catch (UnsupportedOperationException ignored) {

            }
        }
    }
}
