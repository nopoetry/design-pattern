package com.libuyan.designpattern.__m__compound.decorator;

import com.libuyan.designpattern.__m__compound.inter.Quackable;
import com.libuyan.designpattern.__m__compound.oberver.QuackObserver;

/**
 * @author libuyan
 * @date 2021/5/26 21:21
 */
public class QuackCounter implements Quackable {
    private Quackable duck;
    private static int quackCount = 0;
    public QuackCounter(Quackable duck) {
        this.duck = duck;
    }

    @Override
    public void quack() {
        duck.quack();
        quackCount++;
    }

    public static int getQuackCount() {
        return quackCount;
    }

    @Override
    public void registerObserver(QuackObserver observer) {
        duck.registerObserver(observer);
    }
    @Override
    public void notifyAllObservers() {
        duck.notifyAllObservers();
    }
    @Override
    public void deleteObserver(QuackObserver observer) {

    }
}
