package com.libuyan.designpattern.__m__compound.oberver;

import com.libuyan.designpattern.__m__compound.inter.Quackable;

import java.util.ArrayList;
import java.util.List;

/**
 * @author libuyan
 * @date 2021/5/27 10:24
 */
public class Observable implements QuackObservable {

    private List<QuackObserver> quackObserverList = new ArrayList<>();

    private Quackable quackable;

    public Observable(Quackable quackable) {
        this.quackable = quackable;
    }

    @Override
    public void registerObserver(QuackObserver observer) {
        quackObserverList.add(observer);
    }

    @Override
    public void notifyAllObservers() {
        quackObserverList.forEach(quackObserver -> quackObserver.update(quackable));
    }

    @Override
    public void deleteObserver(QuackObserver observer) {
        quackObserverList.remove(observer);
    }
}
