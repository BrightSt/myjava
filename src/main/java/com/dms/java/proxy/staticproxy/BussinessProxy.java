package com.dms.java.proxy.staticproxy;

public class BussinessProxy implements BussinessInterface{

	private BussinessInterface bussinessImpl;
	
	public BussinessProxy(BussinessInterface bussinessImpl) {
		this.bussinessImpl = bussinessImpl;
	}

	@Override
	public void execute() {
		System.out.println("前拦截.....");
		bussinessImpl.execute();
		System.out.println("后拦截.....");
		
	}
	
	
}
