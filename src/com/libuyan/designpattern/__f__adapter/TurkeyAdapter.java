package com.libuyan.designpattern.__f__adapter;

import com.libuyan.designpattern.__f__adapter.duck.Duck;
import com.libuyan.designpattern.__f__adapter.turkey.Turkey;

/**
 * @author libuyan
 * @date 2021/5/10 16:46
 * 在这里使用接口也是一样的道理
 */
public class TurkeyAdapter extends Duck {
    Turkey turkey;

    public TurkeyAdapter(Turkey turkey) {
        this.turkey = turkey;
    }

    @Override
    public void quack() {
        turkey.gobble();
    }

    @Override
    public void fly() {
        for (int i = 0; i < 5; i++) {
            turkey.fly();
        }
    }
}
