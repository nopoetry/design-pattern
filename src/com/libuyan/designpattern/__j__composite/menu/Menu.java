package com.libuyan.designpattern.__j__composite.menu;

import com.libuyan.designpattern.__j__composite.iterator.CompositeIterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author libuyan
 * @date 2021/5/12 9:39
 */
public class Menu extends MenuComponent {
    private String name;
    private String description;
    private List<MenuComponent> menuComponentList;

    public Menu(String name, String description) {
        menuComponentList = new ArrayList<>();
        this.name = name;
        this.description = description;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public MenuComponent getChild(int i) {
        return menuComponentList.get(i);
    }

    @Override
    public void addItem(MenuComponent e) {
        menuComponentList.add(e);
    }

    @Override
    public void print() {
        System.out.println(name);
        System.out.println(description);
        System.out.println("=====================");

        Iterator<MenuComponent> iterator = menuComponentList.iterator();
        while (iterator.hasNext()) {
            MenuComponent menuComponent = iterator.next();
            menuComponent.print();
        }
    }

    @Override
    public Iterator createIterator() {
        return new CompositeIterator(menuComponentList.iterator());
    }
}
