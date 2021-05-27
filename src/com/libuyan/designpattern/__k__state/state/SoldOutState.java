package com.libuyan.designpattern.__k__state.state;

import com.libuyan.designpattern.__k__state.GumballMachine;

/**
 * @author libuyan
 * @date 2021/5/12 15:56
 */
public class SoldOutState implements State {
    private GumballMachine gumballMachine;

    public SoldOutState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }
    @Override
    public void insertQuarter() {
        System.out.println("已卖光");
    }
    @Override
    public void returnQuarter() {
        System.out.println("已卖光");
    }
    @Override
    public void turnCrank() {
        System.out.println("已卖光");
    }
    @Override
    public void dispense() {
        System.out.println("已卖光");
    }
}
