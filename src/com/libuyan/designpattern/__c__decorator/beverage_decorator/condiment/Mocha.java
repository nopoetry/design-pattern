package com.libuyan.designpattern.__c__decorator.beverage_decorator.condiment;

import com.libuyan.designpattern.__c__decorator.beverage_decorator.Beverage;

/**
 * @author libuyan
 * @date 2021/5/7 19:05
 */
public class Mocha extends CondimentDecorator {
    Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

    @Override
    public float cost() {
        return beverage.cost() + 0.2f;
    }
}
