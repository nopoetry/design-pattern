package com.libuyan.designpattern.__k__state.state;

import com.libuyan.designpattern.__k__state.GumballMachine;

/**
 * @author libuyan
 * @date 2021/5/12 15:53
 */
public class NoQuarterState implements State {
    private GumballMachine gumballMachine;

    public NoQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("已投入一块钱硬币");
        gumballMachine.setState(gumballMachine.getInsertQuarterState());
    }

    @Override
    public void returnQuarter() {
        System.out.println("您还没有投入硬币, 不能退回");
    }
    @Override
    public void turnCrank() {
        System.out.println("请投入硬币");
    }
    @Override
    public void dispense() {
        System.out.println("请投入硬币");
    }
}
