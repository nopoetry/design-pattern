package com.libuyan.designpattern.__l__agency.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author libuyan
 * @date 2021/5/15 20:55
 * @description 拥有者代理invocationHandler 拥有者除了不可以执行 setHotOrNotRating 外,
 * 可以执行其他所有get and set方法
 */
public class OwnerInvocationHandler implements InvocationHandler {
    private final PersonBean personBean;

    public OwnerInvocationHandler(PersonBean personBean) {
        this.personBean = personBean;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) {
        try {
            if (method.getName().startsWith("get")) {
                return method.invoke(personBean, args);
            } else if ("setHotOrNotRating".equals(method.getName())) {
                throw new IllegalAccessException("不可以修改自己的喜欢值");
            } else if (method.getName().startsWith("set")) {
                return method.invoke(personBean, args);
            } else {
                return method.invoke(personBean, args);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
