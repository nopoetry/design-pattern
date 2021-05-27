package com.libuyan.designpattern.__e__command.command;

/**
 * @author libuyan
 * @date 2021/5/9 16:08
 */
public class NoCommand implements Command {
    @Override
    public void execute() {
        System.out.println("do nothing");
    }

    @Override
    public void undo() {
        System.out.println("do nothing");
    }
}
