package com.libuyan.designpattern.__j__composite.iterator;

import java.util.Iterator;

/**
 * @author libuyan
 * @date 2021/5/12 13:25
 */
public class NullIterator implements Iterator {
    @Override
    public boolean hasNext() {
        return false;
    }
    @Override
    public Object next() {
        return null;
    }
}
