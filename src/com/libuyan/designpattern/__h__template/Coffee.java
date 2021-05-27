package com.libuyan.designpattern.__h__template;

/**
 * @author libuyan
 * @date 2021/5/10 22:53
 */
public class Coffee extends CaffeineBeverage {
    @Override
    public void brew() {
        System.out.println("用沸水冲泡咖啡");
    }
    @Override
    public void addCondiment() {
        System.out.println("加糖和牛奶");
    }
}
