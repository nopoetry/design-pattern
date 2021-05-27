package com.libuyan.designpattern.__l__agency.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author libuyan
 * @date 2021/5/15 21:05
 */
public class NonOwnerInvocationHandler implements InvocationHandler {
    private PersonBean personBean;

    public NonOwnerInvocationHandler(PersonBean personBean) {
        this.personBean = personBean;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) {
        try {
            if (method.getName().startsWith("get")) {
                return method.invoke(personBean, args);
            } else if ("setHotOrNotRating".equals(method.getName())) {
                return method.invoke(personBean, args);
            } else if (method.getName().startsWith("set")) {
                throw new IllegalAccessException("没有权限修改他人信息");
            } else {
                return method.invoke(personBean, args);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
