package com.libuyan.designpattern.__i__iterator.iterator;

import com.libuyan.designpattern.__i__iterator.menu.MenuItem;

/**
 * @author libuyan
 * @date 2021/5/11 21:06
 */
public class DinerMenuIterator implements Iterator {
    private MenuItem[] menuItems;
    private int position;

    public DinerMenuIterator(MenuItem[] menuItems) {
        this.menuItems = menuItems;
    }

    @Override
    public boolean hasNext() {
        return position < menuItems.length && menuItems[position] != null;
    }

    @Override
    public Object next() {
        return menuItems[position++];
    }
}
