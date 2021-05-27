package com.libuyan.designpattern.__e__command;

import com.libuyan.designpattern.__e__command.appliance.Light;
import com.libuyan.designpattern.__e__command.command.LightOffCommand;
import com.libuyan.designpattern.__e__command.command.LightOnCommand;

/**
 * @author libuyan
 * @date 2021/5/9 15:54
 */
public class TestMain {
    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();
        Light livingRoomLight = new Light("living room light");
        Light kitchenRoomLight = new Light("kitchen room light");

        LightOnCommand livingRoomLightOnCommand = new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLightOffCommand = new LightOffCommand(livingRoomLight);
        LightOnCommand kitchenRoomLightOnCommand = new LightOnCommand(kitchenRoomLight);
        LightOffCommand kitchenRoomLightOffCommand = new LightOffCommand(kitchenRoomLight);
        remoteControl.setCommand(0, livingRoomLightOnCommand, livingRoomLightOffCommand);
        remoteControl.setCommand(1, kitchenRoomLightOnCommand, kitchenRoomLightOffCommand);
        remoteControl.onButtonPushed(0);
        remoteControl.undo();

    }
}
