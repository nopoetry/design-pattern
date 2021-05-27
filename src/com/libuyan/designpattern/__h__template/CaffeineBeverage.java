package com.libuyan.designpattern.__h__template;

/**
 * @author libuyan
 * @date 2021/5/10 22:48
 */
public abstract class CaffeineBeverage {
    final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        addCondiment();
    }

    private void boilWater() {
        System.out.println("将水煮沸");
    }

    /**
     * 浸泡方法
     */
    public abstract void brew();

    private void pourInCup() {
        System.out.println("倒进杯子里");
    }

    /**
     * 加调料
     */
    public abstract void addCondiment();
}
