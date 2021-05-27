package com.libuyan.designpattern.__j__composite.iterator;

import com.libuyan.designpattern.__j__composite.menu.Menu;
import com.libuyan.designpattern.__j__composite.menu.MenuComponent;

import java.util.Iterator;
import java.util.Stack;

/**
 * @author libuyan
 * @date 2021/5/12 13:04
 */
public class CompositeIterator implements Iterator {
    private Stack<Iterator<MenuComponent>> stack;

    public CompositeIterator(Iterator<MenuComponent> iterator) {
        stack = new Stack<>();
        this.stack.push(iterator);
    }

    @Override
    public boolean hasNext() {
        if (stack.isEmpty()) {
            return false;
        }
        Iterator iterator = stack.peek();
        if (!iterator.hasNext()) {
            stack.pop();
            return hasNext();
        }
        return true;
    }

    @Override
    public MenuComponent next() {
        if (hasNext()) {
            Iterator<MenuComponent> peekIterator = stack.peek();
            MenuComponent menuComponent = peekIterator.next();
            if (menuComponent instanceof Menu) {
                stack.push(menuComponent.createIterator());
            }
            return menuComponent;
        }
        return null;
    }
}
