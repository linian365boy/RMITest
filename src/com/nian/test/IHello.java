package com.nian.test;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface IHello extends Remote {
	public String helloworld() throws RemoteException;
	public String sayHelloToSomeBody(String someBodyName) throws RemoteException;
}
