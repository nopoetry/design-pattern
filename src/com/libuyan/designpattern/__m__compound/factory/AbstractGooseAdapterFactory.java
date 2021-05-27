package com.libuyan.designpattern.__m__compound.factory;

import com.libuyan.designpattern.__m__compound.inter.Quackable;

/**
 * @author libuyan
 * @date 2021/5/27 9:47
 */
public abstract class AbstractGooseAdapterFactory {
    public abstract Quackable createGooseAdapter();
}
