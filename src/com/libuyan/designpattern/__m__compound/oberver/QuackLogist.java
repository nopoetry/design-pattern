package com.libuyan.designpattern.__m__compound.oberver;

import com.libuyan.designpattern.__m__compound.inter.Quackable;

/**
 * @author libuyan
 * @date 2021/5/27 10:34
 */
public class QuackLogist implements QuackObserver {
    @Override
    public void update(Quackable quackable) {
        System.out.println("quack logist observer: " + quackable + " quacked.");
    }
}
