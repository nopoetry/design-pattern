package com.libuyan.designpattern.__m__MVC.model;

import com.libuyan.designpattern.__m__MVC.observer.Observer;

/**
 * @author libuyan
 * @date 2021/5/27 15:24
 */
public interface BeatModelInterface {
    void initialize();

    void on();

    void off();

    void setBpm(int bpm);

    int getBpm();

    void registerBeatObserver(Observer observer);

    void notifyBeatObservers();

    void registerBpmObserver(Observer observer);

    void notifyBpmObservers();
}
