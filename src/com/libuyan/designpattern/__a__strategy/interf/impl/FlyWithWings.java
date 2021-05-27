package com.libuyan.designpattern.__a__strategy.interf.impl;

import com.libuyan.designpattern.__a__strategy.interf.FlyBehavior;

/**
 * @author libuyan
 * @date 2021/5/6 21:58
 */
public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("鸭子用翅膀飞");
    }
}
