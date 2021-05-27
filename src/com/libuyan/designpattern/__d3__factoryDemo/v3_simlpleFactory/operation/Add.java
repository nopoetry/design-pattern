package com.libuyan.designpattern.__d3__factoryDemo.v3_simlpleFactory.operation;

/**
 * @author libuyan
 * @date 2021/5/8 20:59
 */
public class Add extends Operation {
    @Override
    public double getResult() {
        return this.getNum1() + this.getNum2();
    }
}
