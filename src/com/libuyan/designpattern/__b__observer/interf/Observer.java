package com.libuyan.designpattern.__b__observer.interf;

/**
 * @author libuyan
 * @date 2021/5/7 15:48
 */
public interface Observer {
    /**
     * 更新观察者观察的数据
     * @param temperature 温度
     * @param pressure 压力
     * @param humidity xx
     */
    void update(float temperature, float pressure, float humidity);
}
