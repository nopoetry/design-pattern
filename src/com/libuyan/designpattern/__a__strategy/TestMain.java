package com.libuyan.designpattern.__a__strategy;

import com.libuyan.designpattern.__a__strategy.entity.Duck;
import com.libuyan.designpattern.__a__strategy.entity.MallardDuck;
import com.libuyan.designpattern.__a__strategy.interf.impl.FlyWithWings;

/**
 * @author libuyan
 * @date 2021/5/6 22:10
 */
public class TestMain {
    public static void main(String[] args) {
        Duck mallardDuck = new MallardDuck();
        mallardDuck.performFly();
        mallardDuck.performQuack();

        /*
            动态改变行为, 加入set的方法, 注入FlyBehavior以及QuarkBehavior
         */
        mallardDuck.setFlyBehavior(new FlyWithWings());
        mallardDuck.performFly();
    }
}
