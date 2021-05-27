package com.libuyan.designpattern.__e__command.command;

import com.libuyan.designpattern.__e__command.appliance.Light;

/**
 * @author libuyan
 * @date 2021/5/9 15:49
 */
public class LightOffCommand implements Command{
    private Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    public void setLight(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }

    @Override
    public void undo() {
        light.on();
    }
}
