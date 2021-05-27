package com.libuyan.designpattern.__d2__abstractFactory.pizza;

import com.libuyan.designpattern.__d2__abstractFactory.ingredient.Cheese;
import com.libuyan.designpattern.__d2__abstractFactory.ingredient.Clam;

/**
 * @author libuyan
 * @date 2021/5/8 19:00
 */
public abstract class Pizza {
    String name;
    Clam clam;
    Cheese cheese;

    public abstract void prepare();

    public void bake() {
        System.out.println("烘烤披萨");
    }

    public void cut() {
        System.out.println("切片");
    }

    public void box() {
        System.out.println("打包");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "name='" + name + '\'' +
                ", clam=" + clam.getName() +
                ", cheese=" + cheese.getName() +
                '}';
    }
}
