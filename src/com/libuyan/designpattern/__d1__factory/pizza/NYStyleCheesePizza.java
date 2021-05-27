package com.libuyan.designpattern.__d1__factory.pizza;

/**
 * @author libuyan
 * @date 2021/5/8 16:45
 */
public class NYStyleCheesePizza extends Pizza {

    public NYStyleCheesePizza() {
        this.name = "NYStyleCheesePizza";
    }

    @Override
    public void prepare() {
        System.out.println("正在准备纽约风味的芝士披萨");
    }

    @Override
    public void bake() {
        System.out.println("正在烘烤纽约风味的芝士披萨");
    }

    @Override
    public void cut() {
        System.out.println("切成一片一片圆形");
    }

    @Override
    public void box() {
        System.out.println("打包");
    }
}
