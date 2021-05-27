package com.libuyan.designpattern.__a__strategy.interf.impl;

import com.libuyan.designpattern.__a__strategy.interf.QuackBehavior;

/**
 * @author libuyan
 * @date 2021/5/6 21:56
 */
public class QuackNo implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("鸭子不叫");
    }
}
