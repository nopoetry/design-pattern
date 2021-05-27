package com.libuyan.designpattern.__k__state.state;

import com.libuyan.designpattern.__k__state.GumballMachine;

/**
 * @author libuyan
 * @date 2021/5/12 15:55
 */
public class InsertQuarterState implements State {
    private GumballMachine gumballMachine;

    public InsertQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("您已投入硬币");
    }

    @Override
    public void returnQuarter() {
        System.out.println("正在退回硬币");
        gumballMachine.setState(gumballMachine.getNoQuarterState());
    }

    @Override
    public void turnCrank() {
        System.out.println("摇动曲柄");
        gumballMachine.setState(gumballMachine.getSoldState());
    }
    @Override
    public void dispense() {
        System.out.println("先摇动曲柄");
    }
}
