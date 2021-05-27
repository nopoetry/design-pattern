package com.libuyan.designpattern.__m__compound.entity;

import com.libuyan.designpattern.__m__compound.inter.Quackable;
import com.libuyan.designpattern.__m__compound.oberver.Observable;
import com.libuyan.designpattern.__m__compound.oberver.QuackObserver;

/**
 * @author libuyan
 * @date 2021/5/26 21:03
 */
public class MallardDuck implements Quackable {

    private Observable observable;

    public MallardDuck() {
        observable = new Observable(this);
    }

    @Override
    public void quack() {
        System.out.println("quack");
        notifyAllObservers();
    }

    @Override
    public void registerObserver(QuackObserver observer) {
        observable.registerObserver(observer);
    }

    @Override
    public void notifyAllObservers() {
        observable.notifyAllObservers();
    }

    @Override
    public void deleteObserver(QuackObserver observer) {
        observable.deleteObserver(observer);
    }
}
