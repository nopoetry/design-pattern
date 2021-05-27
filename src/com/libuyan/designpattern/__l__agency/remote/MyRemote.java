package com.libuyan.designpattern.__l__agency.remote;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * @author libuyan
 * @date 2021/5/15 17:20
 */
public interface MyRemote extends Remote {
    String sayHello() throws RemoteException;
}
