package com.libuyan.designpattern.__k__state.state;

/**
 * @author libuyan
 * @date 2021/5/12 15:49
 */
public interface State {
    void insertQuarter();
    void returnQuarter();
    void turnCrank();
    void dispense();
}
