package com.libuyan.designpattern.__m__compound.composite;

import com.libuyan.designpattern.__m__compound.inter.Quackable;
import com.libuyan.designpattern.__m__compound.oberver.QuackObservable;
import com.libuyan.designpattern.__m__compound.oberver.QuackObserver;

import java.util.ArrayList;
import java.util.List;

/**
 * @author libuyan
 * @date 2021/5/27 9:58
 */
public class Flock implements Quackable {
    private List<Quackable> duckList = new ArrayList<>();

    public void add(Quackable duck) {
        duckList.add(duck);
    }

    @Override
    public void quack() {
        duckList.forEach(Quackable::quack);
    }

    @Override
    public void registerObserver(QuackObserver observer) {
        duckList.forEach(duck -> duck.registerObserver(observer));
    }

    @Override
    public void notifyAllObservers() {
        duckList.forEach(QuackObservable::notifyAllObservers);
    }

    @Override
    public void deleteObserver(QuackObserver observer) {
        duckList.forEach(duck -> duck.deleteObserver(observer));
    }
}
