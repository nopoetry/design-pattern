package com.libuyan.designpattern.__k__state;

import com.libuyan.designpattern.__k__state.state.*;

/**
 * @author libuyan
 * @date 2021/5/12 15:55
 */
public class GumballMachine {
    private State noQuarterState;
    private State insertQuarterState;
    private State soldState;
    private State soldOutState;

    private State state;
    private int count;

    public GumballMachine(int count) {
        this.noQuarterState = new NoQuarterState(this);
        this.insertQuarterState = new InsertQuarterState(this);
        this.soldOutState = new SoldOutState(this);
        this.soldState = new SoldState(this);
        this.state = soldOutState;
        this.count = count;
        if (count > 0) {
            this.state = noQuarterState;
        }
    }

    public State getState() {
        return state;
    }

    public int getCount() {
        return count;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void insertQuarter() {
        state.insertQuarter();
    }

    public void returnQuarter() {
        state.returnQuarter();
    }

    public void turnCrank() {
        state.turnCrank();
        state.dispense();
    }

    public void releaseBall() {
        System.out.println("正在出糖果");
        if (count > 0) {
            count--;
        }
    }

    public State getNoQuarterState() {
        return noQuarterState;
    }
    public State getInsertQuarterState() {
        return insertQuarterState;
    }
    public State getSoldState() {
        return soldState;
    }
    public State getSoldOutState() {
        return soldOutState;
    }
}
