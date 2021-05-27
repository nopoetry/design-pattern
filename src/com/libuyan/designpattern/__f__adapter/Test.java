package com.libuyan.designpattern.__f__adapter;

import com.libuyan.designpattern.__f__adapter.duck.Duck;
import com.libuyan.designpattern.__f__adapter.duck.MallardDuck;
import com.libuyan.designpattern.__f__adapter.turkey.Turkey;
import com.libuyan.designpattern.__f__adapter.turkey.WildTurkey;

/**
 * @author libuyan
 * @date 2021/5/6 22:10
 */
public class Test {
    public static void main(String[] args) {
        Test test = new Test();
        Duck mallardDuck = new MallardDuck();
        test.testDuck(mallardDuck);

        Turkey turkey = new WildTurkey();
        TurkeyAdapter turkeyAdapter = new TurkeyAdapter(turkey);
        test.testDuck(turkeyAdapter);
    }

    public void testDuck(Duck duck) {
        duck.quack();
        duck.fly();
    }
}
