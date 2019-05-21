package com.dms.java.concurrency;

import java.util.concurrent.CyclicBarrier;

/**
 * CyclicBarrier 使用示例
 * @author Dong
 *
 */
public class CyclicBarrierDemo {

	public static void main(String[] args) {
		CyclicBarrier cyclicBarrier = new CyclicBarrier(4,()->{
			System.out.println("车满了，开始出发。。。");
		}) ;
		
		for (int i = 0; i < 12; i++) {
			new Thread(()->{
				
				System.out.println(Thread.currentThread().getName() + " 开始上车。。。");
				try {
					cyclicBarrier.await();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}).start(); 
		}
	}
	
	

}
