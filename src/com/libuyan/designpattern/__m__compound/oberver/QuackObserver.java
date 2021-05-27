package com.libuyan.designpattern.__m__compound.oberver;

import com.libuyan.designpattern.__m__compound.inter.Quackable;

/**
 * @author libuyan
 * @date 2021/5/27 10:11
 */
public interface QuackObserver {
    void update(Quackable quackable);
}
