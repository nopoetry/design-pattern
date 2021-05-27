package com.libuyan.designpattern.__f__adapter.duck;

/**
 * @author libuyan
 * @date 2021/5/6 22:04
 */
public class MallardDuck extends Duck {

    @Override
    public void quack() {
        System.out.println("鸭子叫");
    }
    @Override
    public void fly() {
        System.out.println("鸭子飞行");
    }
}
