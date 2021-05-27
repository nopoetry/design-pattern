package com.libuyan.designpattern.__m__compound.entity;

import com.libuyan.designpattern.__m__compound.inter.Quackable;
import com.libuyan.designpattern.__m__compound.oberver.QuackObserver;

/**
 * @author libuyan
 * @date 2021/5/26 21:00
 */
public class Duck implements Quackable {

    String name = "";
    float size;

    @Override
    public void quack() {
        System.out.println("quack");
    }
    @Override
    public void registerObserver(QuackObserver observer) {

    }
    @Override
    public void notifyAllObservers() {

    }
    @Override
    public void deleteObserver(QuackObserver observer) {

    }
}
