package com.dms.java.concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
/**
 * 双重锁单例
 * instance加volatile的必要性：
 * @author Dong
 *
 */
public class VolatileUseSingleton02 {
	
	private static volatile VolatileUseSingleton02 instance = null;
	
	private VolatileUseSingleton02() {
		System.out.println(Thread.currentThread().getName() + " construction...");
	}
	
	public static VolatileUseSingleton02 getInstance() {
		if(instance == null ) {
			synchronized (VolatileUseSingleton02.class) {
				if(instance == null) {
					instance = new VolatileUseSingleton02();
				}
			}
		}
		
		return instance;
	}

	
	public static void main(String[] args) {
		ExecutorService executorService = Executors.newFixedThreadPool(10);
		for(int i=0;i<10;i++) {
			executorService.execute(()->VolatileUseSingleton02.getInstance());
		}
		executorService.shutdown();
	}
}
