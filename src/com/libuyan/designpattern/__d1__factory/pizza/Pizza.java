package com.libuyan.designpattern.__d1__factory.pizza;

/**
 * @author libuyan
 * @date 2021/5/8 16:41
 */
public abstract class Pizza {
    String name;
    public Float price;
    public String description;

    public abstract void prepare();

    public abstract void bake();

    public abstract void cut();

    public abstract void box();

    public String getName() {
        return name;
    }
}
