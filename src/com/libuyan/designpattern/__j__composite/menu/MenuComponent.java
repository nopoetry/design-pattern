package com.libuyan.designpattern.__j__composite.menu;

import java.util.Iterator;

/**
 * @author libuyan
 * @date 2021/5/12 9:31
 */
public abstract class MenuComponent {
    public String getName() {
        throw new UnsupportedOperationException();
    }
    public String getDescription() {
        throw new UnsupportedOperationException();
    }
    public int getPrice() {
        throw new UnsupportedOperationException();
    }
    public boolean isVegetarian() {
        throw new UnsupportedOperationException();
    }
    public MenuComponent getChild(int i) {
        throw new UnsupportedOperationException();
    }
    public void addItem(MenuComponent e) {
        throw new UnsupportedOperationException();
    }
    public void print() {
        throw new UnsupportedOperationException();
    }
    public Iterator createIterator() {
        throw new UnsupportedOperationException();
    }
}
