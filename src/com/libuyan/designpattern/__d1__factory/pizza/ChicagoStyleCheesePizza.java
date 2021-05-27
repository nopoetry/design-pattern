package com.libuyan.designpattern.__d1__factory.pizza;

/**
 * @author libuyan
 * @date 2021/5/8 16:51
 */
public class ChicagoStyleCheesePizza extends Pizza {

    public ChicagoStyleCheesePizza() {
        this.name = "ChicagoStyleCheesePizza";
    }

    @Override
    public void prepare() {
        System.out.println("正在准备芝加哥风味的芝士披萨");
    }

    @Override
    public void bake() {
        System.out.println("正在烘烤芝加哥风味的芝士披萨");
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
