package com.dms.java;

import org.junit.Test;

import com.dms.java.cglib.Dao;
import com.dms.java.cglib.DaoProxy;

import net.sf.cglib.proxy.Enhancer;

/**
 * cglib 测试类
 * @author Dong
 *
 */
public class CglibTest {
	
	@Test
	public void testCglib() {
		DaoProxy daoProxy = new DaoProxy();
		
		Enhancer enhancer = new Enhancer();
		enhancer.setSuperclass(Dao.class);
		enhancer.setCallback(daoProxy);
		
		Dao dao = (Dao)enhancer.create();
		dao.update();
		dao.select();
	}

}
