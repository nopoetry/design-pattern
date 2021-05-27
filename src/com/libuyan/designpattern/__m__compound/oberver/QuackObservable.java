package com.libuyan.designpattern.__m__compound.oberver;

/**
 * @author libuyan
 * @date 2021/5/27 10:16
 */
public interface QuackObservable {
    void registerObserver(QuackObserver observer);

    void notifyAllObservers();

    void deleteObserver(QuackObserver observer);
}
