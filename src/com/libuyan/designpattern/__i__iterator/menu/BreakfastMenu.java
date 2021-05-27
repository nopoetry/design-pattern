package com.libuyan.designpattern.__i__iterator.menu;

import com.libuyan.designpattern.__i__iterator.iterator.BreakfastMenuIterator;
import com.libuyan.designpattern.__i__iterator.iterator.Iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * @author libuyan
 * @date 2021/5/11 20:50
 */
public class BreakfastMenu implements Menu {
    private List<MenuItem> menuItemList;

    public BreakfastMenu() {
        this.menuItemList = new ArrayList<>();
    }

    public void addItem(MenuItem item) {
        menuItemList.add(item);
    }

    public int size() {
        return menuItemList.size();
    }

    @Override
    public Iterator createIterator() {
        return new BreakfastMenuIterator(menuItemList);
    }
}
