package com.nian.test;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class HelloImpl extends UnicastRemoteObject implements IHello {
	
	private static final long serialVersionUID = -4362318384491855460L;

	public HelloImpl() throws RemoteException{
	}
	@Override
	public String helloworld() throws RemoteException {
		return "Hello World!!";
	}

	@Override
	public String sayHelloToSomeBody(String someBodyName)
			throws RemoteException {
		return "你好，"+someBodyName+"!";
	}

}
