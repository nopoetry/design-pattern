package com.libuyan.designpattern.__h__template;

/**
 * @author libuyan
 * @date 2021/5/10 22:56
 */
public class TestMain {
    public static void main(String[] args) {
        CaffeineBeverage coffee = new Coffee();
        coffee.prepareRecipe();

        CaffeineBeverage tea = new Tea();
        tea.prepareRecipe();
    }
}
