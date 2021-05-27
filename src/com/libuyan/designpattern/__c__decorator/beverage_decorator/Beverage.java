package com.libuyan.designpattern.__c__decorator.beverage_decorator;

/**
 * @author libuyan
 * @date 2021/5/7 18:58
 */
public abstract class Beverage {
    /**
     * 返回饮品价钱
     * @return 饮品价钱
     */
    public abstract float cost();

    /**
     * 返回饮品描述
     * @return 饮品描述
     */
    public abstract String getDescription();
}
