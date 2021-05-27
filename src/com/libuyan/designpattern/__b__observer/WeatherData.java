package com.libuyan.designpattern.__b__observer;

import com.libuyan.designpattern.__b__observer.interf.Observer;
import com.libuyan.designpattern.__b__observer.interf.Subject;

import java.util.ArrayList;
import java.util.List;

/**
 * @author libuyan
 * @date 2021/5/7 15:41
 */
public class WeatherData implements Subject {
    private Float temperature;
    private Float pressure;
    private Float humidity;
    private List<Observer> observerList;
    private boolean changed;

    public WeatherData() {
        this.observerList = new ArrayList<>();
    }

    @Override
    public void register(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void delete(Observer observer) {
        int i = observerList.indexOf(observer);
        if (i >= 0) {
            observerList.remove(observer);
        }
    }

    @Override
    public void notifyObserver() {
        if (changed) {
            observerList.forEach(observer -> observer.update(temperature, pressure, humidity));
            changed = false;
        }
    }

    public void flushData(Float temperature, Float pressure, Float humidity) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        changed = !changed;
        notifyObserver();
    }
}
