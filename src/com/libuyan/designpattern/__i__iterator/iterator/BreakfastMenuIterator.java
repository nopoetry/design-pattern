package com.libuyan.designpattern.__i__iterator.iterator;

import com.libuyan.designpattern.__i__iterator.menu.MenuItem;

import java.util.List;

/**
 * @author libuyan
 * @date 2021/5/11 20:57
 */
public class BreakfastMenuIterator implements Iterator {
    private List<MenuItem> menuItemList;
    private int position;

    public BreakfastMenuIterator(List<MenuItem> menuItemList) {
        this.menuItemList = menuItemList;
    }

    @Override
    public boolean hasNext() {
        return position < menuItemList.size();
    }

    @Override
    public MenuItem next() {
        return menuItemList.get(position++);
    }
}
