package com.libuyan.designpattern.__d3__factoryDemo.v3_simlpleFactory.operation;

/**
 * @author libuyan
 * @date 2021/5/9 11:33
 */
public abstract class Operation {
    private double num1;
    private double num2;

    public double getNum1() {
        return num1;
    }
    public void setNum1(double num1) {
        this.num1 = num1;
    }
    public double getNum2() {
        return num2;
    }
    public void setNum2(double num2) {
        this.num2 = num2;
    }

    public abstract double getResult();
}

