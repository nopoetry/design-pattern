package com.libuyan.designpattern.__j__composite;

import com.libuyan.designpattern.__j__composite.menu.Menu;
import com.libuyan.designpattern.__j__composite.menu.MenuComponent;
import com.libuyan.designpattern.__j__composite.menu.MenuItem;
import com.libuyan.designpattern.__j__composite.waitress.Waitress;

/**
 * @author libuyan
 * @date 2021/5/12 9:47
 */
public class MainTest {
    public static void main(String[] args) {
        MenuComponent breakfastMenu = new Menu("早餐菜单", "早餐");
        breakfastMenu.addItem(new MenuItem("包子", 2, true));
        breakfastMenu.addItem(new MenuItem("饺子", 1, false));
        breakfastMenu.addItem(new MenuItem("馅饼", 4, false));

        MenuComponent dinerMenu = new Menu("午餐菜单", "午餐");
        dinerMenu.addItem(new MenuItem("米饭", 1, true));
        dinerMenu.addItem(new MenuItem("鱼香肉丝", 15, false));
        dinerMenu.addItem(new MenuItem("锅包肉", 20, false));

        MenuComponent allMenu = new Menu("全部菜单", "全部菜单");
        allMenu.addItem(breakfastMenu);
        allMenu.addItem(dinerMenu);

        Waitress waitress = new Waitress(allMenu);
        waitress.print();

        waitress.printVegetarianMenu();
    }
}
