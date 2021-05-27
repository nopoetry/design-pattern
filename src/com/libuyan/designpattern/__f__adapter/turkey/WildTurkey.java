package com.libuyan.designpattern.__f__adapter.turkey;

/**
 * @author libuyan
 * @date 2021/5/10 16:46
 */
public class WildTurkey extends Turkey {
    @Override
    public void gobble() {
        System.out.println("gu gu gu");
    }

    @Override
    public void fly() {
        System.out.println("飞一小段");
    }
}
