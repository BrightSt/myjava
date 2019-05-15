package com.dms.java.proxy.staticproxy;

/**
 * 目标对象的实现类
 * @author Dong
 *
 */
public class Bussiness implements BussinessInterface{

	@Override
	public void execute() {
		System.out.println("执行业务逻辑......");
		
	}

}
