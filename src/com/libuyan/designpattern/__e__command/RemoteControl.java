package com.libuyan.designpattern.__e__command;

import com.libuyan.designpattern.__e__command.command.Command;
import com.libuyan.designpattern.__e__command.command.NoCommand;

/**
 * @author libuyan
 * @date 2021/5/9 15:50
 */
public class RemoteControl {
    Command[] onCommands;
    Command[] offCommands;
    Command undoCommand;

    public RemoteControl() {
        NoCommand noCommand = new NoCommand();
        this.onCommands = new Command[7];
        this.offCommands = new Command[7];

        /*
            在执行execute命令时, 我们不想每次执行都判空, 那么可以使用一个空对象来做这件事情,
            将处理null的责任丢给空对象, 在许多设计模式中都用到了空对象
         */
        for (int i = 0; i < onCommands.length; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
        undoCommand = noCommand;
    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void onButtonPushed(int slot) {
        onCommands[slot].execute();
        undoCommand = onCommands[slot];
    }

    public void offButtonPushed(int slot) {
        offCommands[slot].execute();
        undoCommand = offCommands[slot];
    }

    public void undo() {
        undoCommand.undo();
    }
}
