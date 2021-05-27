package com.libuyan.designpattern.__a__strategy.entity;

import com.libuyan.designpattern.__a__strategy.interf.FlyBehavior;
import com.libuyan.designpattern.__a__strategy.interf.QuackBehavior;

/**
 * @author libuyan
 * @date 2021/5/6 21:51
 */
public abstract class Duck {

    QuackBehavior quackBehavior;

    FlyBehavior flyBehavior;

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    /**
     * 叫和飞都不是所有鸭子必须的方法, 如果用继承的话, 各个子类必须自己重写这两个方法,
     * 哪怕有两个类的方法是一样的也要单独重写,
     * 会导致在修改飞行和叫声方法时, 要改的代码太多,
     * 所以将飞行和叫抽象为两个行为接口, 具体的飞行和叫声由行为类实现接口来决定,
     * 选择哪种行为, 由子类在构造函数中, 选择new哪种行为类来决定
     * <p>
     * 适用于不是所有子类都有该方法时, 从is a , 变为 has a `行为`
     */
    public void performQuack() {
        quackBehavior.quack();
    }

    public void performFly() {
        flyBehavior.fly();
    }

    public void swim() {
        System.out.println("鸭子游泳");
    }

    public abstract void display();
}
