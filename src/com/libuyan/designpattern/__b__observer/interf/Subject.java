package com.libuyan.designpattern.__b__observer.interf;


/**
 * @author libuyan
 * @date 2021/5/7 15:42
 */
public interface Subject {
    void register(Observer observer);

    void delete(Observer observer);

    void notifyObserver();
}
