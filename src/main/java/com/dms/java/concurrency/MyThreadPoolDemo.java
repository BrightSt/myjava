package com.dms.java.concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 *  自定义线程池
 * @author Dong
 *
 */
public class MyThreadPoolDemo {

	public static void main(String[] args) {
		
		// 获取当前CPU核数
		System.out.println(Runtime.getRuntime().availableProcessors());
		
		ExecutorService threadPool = new ThreadPoolExecutor(
										2, 
										5, 
										1L, 
										TimeUnit.SECONDS, 
										new LinkedBlockingQueue<Runnable>(3),
										Executors.defaultThreadFactory(),
										new ThreadPoolExecutor.DiscardPolicy()); // 显示不同策略的效果
		try {
			
			for (int i = 1; i <= 10; i++) {
				threadPool.execute(()->{
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println(Thread.currentThread().getName() + "\t办理业务");
					
				});
			}
			
		} finally {
			threadPool.shutdown();
		}
	}

}
