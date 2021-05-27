package com.libuyan.designpattern.__m__compound;

import com.libuyan.designpattern.__m__compound.adapter.Goose;
import com.libuyan.designpattern.__m__compound.adapter.GooseAdapter;
import com.libuyan.designpattern.__m__compound.composite.Flock;
import com.libuyan.designpattern.__m__compound.decorator.QuackCounter;
import com.libuyan.designpattern.__m__compound.entity.*;
import com.libuyan.designpattern.__m__compound.factory.*;
import com.libuyan.designpattern.__m__compound.inter.Quackable;
import com.libuyan.designpattern.__m__compound.oberver.QuackLogist;

/**
 * @author libuyan
 * @date 2021/5/26 21:07
 * @description 鸭子模拟器
 */
public class DuckSimulator {
    private AbstractDuckFactory duckFactory = new DuckFactory();
    private AbstractDuckFactory countingDuckFactory = new CountingDuckFactory();
    private AbstractGooseAdapterFactory gooseAdapterFactory = new GooseAdapterFactory();
    public static void main(String[] args) {
        DuckSimulator duckSimulator = new DuckSimulator();
        duckSimulator.simulator();
    }

    private void simulator() {
        Quackable mallardDuck = countingDuckFactory.createMallardDuck();
        Quackable redHeadDuck = countingDuckFactory.createRedHeadDuck();
        Quackable rubberDuck = countingDuckFactory.createRubberDuck();
        Quackable duckCall = countingDuckFactory.createDuckCall();
        Quackable gooseAdapter = gooseAdapterFactory.createGooseAdapter();

        Flock quackableFlock = new Flock();
        quackableFlock.add(mallardDuck);
        quackableFlock.add(redHeadDuck);
        quackableFlock.add(rubberDuck);
        quackableFlock.add(duckCall);
        quackableFlock.add(gooseAdapter);

        Flock mallardDuckFlock = new Flock();
        mallardDuckFlock.add(duckFactory.createMallardDuck());
        mallardDuckFlock.add(duckFactory.createMallardDuck());
        mallardDuckFlock.add(duckFactory.createMallardDuck());
        mallardDuckFlock.add(duckFactory.createMallardDuck());

        quackableFlock.add(mallardDuckFlock);

        //注册观察者
        System.out.println("quack logist observer quack");
        QuackLogist quackLogist = new QuackLogist();
        quackableFlock.registerObserver(quackLogist);

        System.out.println("duck simulator start");
        simulator(quackableFlock);

        System.out.println(QuackCounter.getQuackCount());
    }

    private void simulator(Quackable duck) {
        duck.quack();
    }
}
