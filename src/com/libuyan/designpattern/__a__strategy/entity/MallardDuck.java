package com.libuyan.designpattern.__a__strategy.entity;

import com.libuyan.designpattern.__a__strategy.interf.impl.FlyNo;
import com.libuyan.designpattern.__a__strategy.interf.impl.QuackGaGa;

/**
 * @author libuyan
 * @date 2021/5/6 22:04
 */
public class MallardDuck extends Duck {

    public MallardDuck() {
        quackBehavior = new QuackGaGa();
        flyBehavior = new FlyNo();
    }

    @Override
    public void display() {
        System.out.println("绿头鸭");
    }
}
