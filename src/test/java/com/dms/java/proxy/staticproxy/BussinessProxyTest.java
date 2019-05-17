package com.dms.java.proxy.staticproxy;

import org.junit.Test;

/**
 * 静态代理测试类
 * @author Dong
 *
 */
public class BussinessProxyTest {

	@Test
	public void test() {
		Bussiness bussiness = new Bussiness();
		BussinessProxy bussinessProxy = new BussinessProxy(bussiness);
		bussinessProxy.execute();
	}

}
