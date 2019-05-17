package com.dms.java.proxy.cglib;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

public class DaoProxy implements MethodInterceptor{

	@Override
	public Object intercept(Object object, Method arg1, Object[] objects, MethodProxy proxy) throws Throwable {
		System.out.println("before method invoke");
		proxy.invokeSuper(object, objects);
		System.out.println("after method invoke");
		return objects;
	}

}
