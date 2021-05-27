package com.libuyan.designpattern.__m__compound.factory;

import com.libuyan.designpattern.__m__compound.decorator.QuackCounter;
import com.libuyan.designpattern.__m__compound.entity.DuckCall;
import com.libuyan.designpattern.__m__compound.entity.MallardDuck;
import com.libuyan.designpattern.__m__compound.entity.RedHeadDuck;
import com.libuyan.designpattern.__m__compound.entity.RubberDuck;
import com.libuyan.designpattern.__m__compound.inter.Quackable;

/**
 * @author libuyan
 * @date 2021/5/27 9:20
 */
public class CountingDuckFactory extends AbstractDuckFactory{
    @Override
    public Quackable createMallardDuck() {
        return new QuackCounter(new MallardDuck());
    }

    @Override
    public Quackable createRedHeadDuck() {
        return new QuackCounter(new RedHeadDuck());
    }

    @Override
    public Quackable createRubberDuck() {
        return new QuackCounter(new RubberDuck());
    }

    @Override
    public Quackable createDuckCall() {
        return new QuackCounter(new DuckCall());
    }
}
