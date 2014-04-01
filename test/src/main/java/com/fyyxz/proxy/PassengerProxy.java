package com.fyyxz.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class PassengerProxy implements InvocationHandler {

	public Object obj;

	// 把obj交给代理类
	public Object obj(Object obj) {
	   this.obj = obj;
	   return Proxy.newProxyInstance(obj.getClass().getClassLoader(), obj
	     .getClass().getInterfaces(), this);
	}

	public Object invoke(Object proxy, Method method, Object[] args)
	    throws Throwable {
	   // TODO Auto-generated method stub
	   System.out.print("通过代理");
	   method.invoke(obj, args);
	   return null;
	}

}
