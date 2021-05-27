package com.libuyan.designpattern.__m__compound.inter;

import com.libuyan.designpattern.__m__compound.oberver.QuackObservable;

/**
 * @author libuyan
 * @date 2021/5/26 21:02
 */
public interface Quackable extends QuackObservable {
    void quack();
}
