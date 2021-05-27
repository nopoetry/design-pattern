package com.libuyan.designpattern.__i__iterator.menu;

import com.libuyan.designpattern.__i__iterator.iterator.DinerMenuIterator;
import com.libuyan.designpattern.__i__iterator.iterator.Iterator;

/**
 * @author libuyan
 * @date 2021/5/11 20:53
 */
public class DinerMenu implements Menu {
    private MenuItem[] menuItems;
    private int position = 0;

    public DinerMenu() {
        this.menuItems = new MenuItem[5];
    }

    public void addItem(MenuItem item) throws Exception {
        if(position > menuItems.length) {
            throw new Exception("超出菜单长度限制");
        }
        menuItems[position++] = item;
    }

    @Override
    public Iterator createIterator() {
        return new DinerMenuIterator(menuItems);
    }
}
