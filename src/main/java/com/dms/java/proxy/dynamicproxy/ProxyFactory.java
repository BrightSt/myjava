package com.dms.java.proxy.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 动态代理对象，无需实现任何接口
 * 通过传入任务类型的目标对象并制定接口
 * 调用JDk接口动态创建代理对象
 * @author Dong
 *
 */
public class ProxyFactory implements InvocationHandler {
	
	private Object target;
	
	ProxyFactory(Object target){
		this.target = target;
	}

	@Override
	public Object invoke(Object o, Method method, Object[] args) throws Throwable {
		
		System.out.println("前逻辑...");
		Object result = method.invoke(target, args);
		System.out.println("后逻辑...");
		return result;
	}
	
}
