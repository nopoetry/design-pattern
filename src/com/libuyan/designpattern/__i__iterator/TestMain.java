package com.libuyan.designpattern.__i__iterator;

import com.libuyan.designpattern.__i__iterator.menu.BreakfastMenu;
import com.libuyan.designpattern.__i__iterator.menu.DinerMenu;
import com.libuyan.designpattern.__i__iterator.menu.MenuItem;
import com.libuyan.designpattern.__i__iterator.waitress.Waitress;

import java.util.Collection;

/**
 * @author libuyan
 * @date 2021/5/11 21:09
 */
public class TestMain {
    public static void main(String[] args) throws Exception {
        BreakfastMenu breakfastMenu = new BreakfastMenu();
        breakfastMenu.addItem(new MenuItem("包子", 2));
        breakfastMenu.addItem(new MenuItem("饺子", 1));
        breakfastMenu.addItem(new MenuItem("馅饼", 4));

        DinerMenu dinerMenu = new DinerMenu();
        dinerMenu.addItem(new MenuItem("米饭", 1));
        dinerMenu.addItem(new MenuItem("鱼香肉丝", 15));
        dinerMenu.addItem(new MenuItem("锅包肉", 20));

        Waitress waitress = new Waitress(breakfastMenu, dinerMenu);
        waitress.printMenu();

        char c = '1';
        Integer.parseInt(String.valueOf(c));
        StringBuilder sb = new StringBuilder();
        sb.append(1);
    }
}
