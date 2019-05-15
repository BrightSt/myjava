package com.dms.java.proxy.dynamicproxy;

import java.lang.reflect.Proxy;

import org.junit.Test;

import com.dms.java.proxy.staticproxy.Bussiness;
import com.dms.java.proxy.staticproxy.BussinessInterface;

public class DynamicProxyTest {

	@Test
	public void test() {
		BussinessInterface business = new Bussiness();
		ProxyFactory proxyFactory = new ProxyFactory(business);
		BussinessInterface business1 = (BussinessInterface)Proxy.newProxyInstance(
				business.getClass().getClassLoader(), 
				business.getClass().getInterfaces(), proxyFactory);
		business1.execute();
	
	}

}
