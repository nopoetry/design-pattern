package com.libuyan.designpattern.__m__compound.factory;

import com.libuyan.designpattern.__m__compound.adapter.Goose;
import com.libuyan.designpattern.__m__compound.adapter.GooseAdapter;
import com.libuyan.designpattern.__m__compound.inter.Quackable;

/**
 * @author libuyan
 * @date 2021/5/27 9:48
 */
public class GooseAdapterFactory extends AbstractGooseAdapterFactory {
    @Override
    public Quackable createGooseAdapter() {
        return new GooseAdapter(new Goose());
    }
}
