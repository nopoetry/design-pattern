package com.libuyan.designpattern.__m__MVC.observer;

import com.libuyan.designpattern.__m__MVC.model.BeatModel;

/**
 * @author libuyan
 * @date 2021/5/27 15:26
 */
public interface Observer {
    void update(BeatModel beatModel);
}
