package com.libuyan.designpattern.__i__iterator.waitress;

import com.libuyan.designpattern.__i__iterator.iterator.Iterator;
import com.libuyan.designpattern.__i__iterator.menu.Menu;

/**
 * @author libuyan
 * @date 2021/5/11 21:15
 */
public class Waitress {
    private Menu breakfastMenu;
    private Menu dinerMenu;

    public Waitress(Menu breakfastMenu, Menu dinerMenu) {
        this.breakfastMenu = breakfastMenu;
        this.dinerMenu = dinerMenu;
    }

    public void printMenu() {
        Iterator breakfastMenuIterator = breakfastMenu.createIterator();
        Iterator dinerMenuIterator = dinerMenu.createIterator();
        System.out.println("打印早餐菜单");
        printMenu(breakfastMenuIterator);
        System.out.println("打印午餐菜单");
        printMenu(dinerMenuIterator);
    }

    private void printMenu(Iterator iterator) {
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    public Menu getBreakfastMenu() {
        return breakfastMenu;
    }
    public void setBreakfastMenu(Menu breakfastMenu) {
        this.breakfastMenu = breakfastMenu;
    }
    public Menu getDinerMenu() {
        return dinerMenu;
    }
    public void setDinerMenu(Menu dinerMenu) {
        this.dinerMenu = dinerMenu;
    }
}
