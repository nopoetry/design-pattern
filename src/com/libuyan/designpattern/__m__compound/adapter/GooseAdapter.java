package com.libuyan.designpattern.__m__compound.adapter;

import com.libuyan.designpattern.__m__compound.inter.Quackable;
import com.libuyan.designpattern.__m__compound.oberver.QuackObserver;

/**
 * @author libuyan
 * @date 2021/5/26 21:12
 */
public class GooseAdapter implements Quackable {
    private Goose goose;

    public GooseAdapter(Goose goose) {
        this.goose = goose;
    }

    @Override
    public void quack() {
        goose.honk();
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
