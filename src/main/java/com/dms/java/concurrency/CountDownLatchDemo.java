package com.dms.java.concurrency;

import java.util.concurrent.CountDownLatch;

/**
 * CountDownLatch 使用示例
 * @author Dong
 *
 */
public class CountDownLatchDemo {

	public static void main(String[] args) {
		
		CountDownLatch countDownLatch = new CountDownLatch(6);
		
		for (int i = 0; i < 6; i++) {
			new Thread(()->{
				countDownLatch.countDown();
				System.out.println(Thread.currentThread().getName() + " 离开了教室");
			},String.valueOf(i)).start();
		}
		
		try {
			countDownLatch.await();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("班长把门给关上，离开教室。。。。");
	}
}
