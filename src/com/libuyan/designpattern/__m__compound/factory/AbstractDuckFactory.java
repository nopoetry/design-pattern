package com.libuyan.designpattern.__m__compound.factory;

import com.libuyan.designpattern.__m__compound.inter.Quackable;

/**
 * @author libuyan
 * @date 2021/5/26 21:51
 */
public abstract class AbstractDuckFactory {
    /**
     * 创建绿头鸭
     * @return 返回一个绿头鸭
     */
    public abstract Quackable createMallardDuck();

    public abstract Quackable createRedHeadDuck();

    public abstract Quackable createRubberDuck();

    public abstract Quackable createDuckCall();
}
