package com.libuyan.designpattern.__h__template;

/**
 * @author libuyan
 * @date 2021/5/10 22:55
 */
public class Tea extends CaffeineBeverage {
    @Override
    public void brew() {
        System.out.println("用沸水浸泡茶叶");
    }

    @Override
    public void addCondiment() {
        System.out.println("加柠檬");
    }
}
