package com.libuyan.designpattern.__e__command.command;

import com.libuyan.designpattern.__e__command.appliance.Light;

/**
 * @author libuyan
 * @date 2021/5/9 15:45
 */
public class LightOnCommand implements Command{
    private Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    public void setLight(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }

    @Override
    public void undo() {
        light.off();
    }
}
