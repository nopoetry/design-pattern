package com.libuyan.designpattern.__k__state.state;

import com.libuyan.designpattern.__k__state.GumballMachine;

/**
 * @author libuyan
 * @date 2021/5/12 15:56
 */
public class SoldState implements State {
    private GumballMachine gumballMachine;

    public SoldState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("您已投入硬币");
    }

    @Override
    public void returnQuarter() {
        System.out.println("已摇动曲柄, 不能退回");
    }

    @Override
    public void turnCrank() {
        System.out.println("已摇动曲柄, 请稍后");
    }

    @Override
    public void dispense() {
        gumballMachine.releaseBall();
        if (gumballMachine.getCount() > 0) {
            gumballMachine.setState(gumballMachine.getNoQuarterState());
        } else {
            gumballMachine.setState(gumballMachine.getSoldOutState());
        }
    }
}
