package com.libuyan.designpattern.__l__agency.dynamic;

/**
 * @author libuyan
 * @date 2021/5/15 21:13
 */
public class TestMain {
    public static void main(String[] args) {
        PersonBean jack = new PersonBeanImpl("jack");
        ProxyFactory ownerJackProxyFactory = new ProxyFactory(jack, new OwnerInvocationHandler(jack));
        PersonBean ownerJackProxy = ownerJackProxyFactory.getPersonBeanProxy();
        ownerJackProxy.setGender("男");
        ownerJackProxy.setInterests("跑步");
//        ownerJackProxy.setHotOrNotRating(5);
        System.out.println(ownerJackProxy.toString());

        ProxyFactory nonOwnerProxyFactory = new ProxyFactory(jack, new NonOwnerInvocationHandler(jack));
        PersonBean nonOwnerProxy = nonOwnerProxyFactory.getPersonBeanProxy();
        System.out.println(nonOwnerProxy.getGender());
        nonOwnerProxy.setHotOrNotRating(5);
        System.out.println(nonOwnerProxy.getHotOrNotRating());
        nonOwnerProxy.setGender("女");
        System.out.println(nonOwnerProxy.toString());
        System.out.println(nonOwnerProxy.getHotOrNotRating());

        
    }
}
