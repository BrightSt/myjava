package com.dms.java.concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 这个在多线程下达不到单例的效果，多次运行会存在构造函数被调用多次的情况。
 * 发现构造器里的内容会多次输出
 * @author Dong
 *
 */
public class VolatileUseSingleton01 {

	private static VolatileUseSingleton01 instance = null;
	
	private VolatileUseSingleton01() {
		System.out.println(Thread.currentThread().getName() + " construction ....");
	}
	
	public static VolatileUseSingleton01 getInstance() {
		if(instance == null) {
			instance = new VolatileUseSingleton01();
		}
		
		return instance;
	}
	
	public static void main(String[] args) {
		ExecutorService executorService = Executors.newFixedThreadPool(10);
		
		for (int i = 0;i<10;i++) {
			executorService.execute(()->VolatileUseSingleton01.getInstance());
		}
		
		executorService.shutdown();
	}
}
