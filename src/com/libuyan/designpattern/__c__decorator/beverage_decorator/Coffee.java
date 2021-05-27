package com.libuyan.designpattern.__c__decorator.beverage_decorator;

/**
 * @author libuyan
 * @date 2021/5/7 19:00
 */
public class Coffee extends Beverage{
    private String description = "Is a coffee";
    @Override
    public float cost() {
        return 0.9f;
    }

    @Override
    public String getDescription() {
        return description;
    }
}
