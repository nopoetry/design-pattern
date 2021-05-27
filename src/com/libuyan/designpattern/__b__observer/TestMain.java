package com.libuyan.designpattern.__b__observer;

import com.libuyan.designpattern.__b__observer.interf.impl.ConditionDisplay;

/**
 * @author libuyan
 * @date 2021/5/7 16:02
 */
public class TestMain {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        ConditionDisplay conditionDisplay = new ConditionDisplay();
        weatherData.register(conditionDisplay);
        weatherData.flushData(12f, 13f, 14f);
        weatherData.notifyObserver();
    }
}
