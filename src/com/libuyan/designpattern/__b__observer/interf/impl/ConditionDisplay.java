package com.libuyan.designpattern.__b__observer.interf.impl;

import com.libuyan.designpattern.__b__observer.interf.Observer;

/**
 * @author libuyan
 * @date 2021/5/7 15:58
 */
public class ConditionDisplay implements Observer {
    private Float temperature;
    private Float pressure;
    private Float humidity;

    @Override
    public void update(float temperature, float pressure, float humidity) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }

    public void display() {
        System.out.println("当前的温度为: " + temperature + ", 当前的压力为: " + pressure);
    }
}
