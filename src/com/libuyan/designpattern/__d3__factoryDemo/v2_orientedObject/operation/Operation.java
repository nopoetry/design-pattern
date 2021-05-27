package com.libuyan.designpattern.__d3__factoryDemo.v2_orientedObject.operation;

/**
 * @author libuyan
 * @date 2021/5/8 20:55
 */
public abstract class Operation {
    private Double num1;
    private Double num2;

    public Double getNum1() {
        return num1;
    }
    public void setNum1(Double num1) {
        this.num1 = num1;
    }
    public Double getNum2() {
        return num2;
    }
    public void setNum2(Double num2) {
        this.num2 = num2;
    }

    public abstract double getResult();
}
