package com.libuyan.designpattern.__d3__factoryDemo.v3_simlpleFactory;

import com.libuyan.designpattern.__d3__factoryDemo.v3_simlpleFactory.operation.Add;
import com.libuyan.designpattern.__d3__factoryDemo.v3_simlpleFactory.operation.Operation;

/**
 * @author libuyan
 * @date 2021/5/9 11:33
 */
public class OperationFactory {
    public Operation getOperation(String type) {
        Operation operation = null;
        if ("+".equals(type)) {
            operation = new Add();
        }
        return operation;
    }
}
