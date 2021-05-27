package com.libuyan.designpattern.__l__agency.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @author libuyan
 * @date 2021/5/15 21:10
 */
public class ProxyFactory {
    private PersonBean personBean;
    private InvocationHandler invocationHandler;

    public ProxyFactory(PersonBean personBean, InvocationHandler invocationHandler) {
        this.personBean = personBean;
        this.invocationHandler = invocationHandler;
    }

    PersonBean getPersonBeanProxy() {
        return (PersonBean) Proxy.newProxyInstance(personBean.getClass().getClassLoader(),
                personBean.getClass().getInterfaces(),
                invocationHandler);
    }
}
