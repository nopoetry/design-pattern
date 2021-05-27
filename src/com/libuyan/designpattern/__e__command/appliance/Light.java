package com.libuyan.designpattern.__e__command.appliance;

/**
 * @author libuyan
 * @date 2021/5/9 15:45
 */
public class Light {
    private String name;

    public Light(String name) {
        this.name = name;
    }

    public void on() {
        System.out.println("light on");
    }

    public void off() {
        System.out.println("light off");
    }
}
