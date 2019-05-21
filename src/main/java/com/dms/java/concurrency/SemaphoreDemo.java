package com.dms.java.concurrency;

import java.util.concurrent.Semaphore;
/**
 * 信号量使用示例，多个线程抢占多个资源的情况
 * @author Dong
 *
 */
public class SemaphoreDemo {

	public static void main(String[] args) {
		Semaphore semaphore = new Semaphore(3);
		
		for (int i=0;i<6;i++) {
			new Thread(()->{
				try {
					semaphore.acquire();
					System.out.println(Thread.currentThread().getName() + " 获取车位。。。");
					Thread.sleep(3000);
					System.out.println(Thread.currentThread().getName() + " 离开车位...");
				} catch (InterruptedException e) {
					e.printStackTrace();
				}finally {
					semaphore.release();
				}
				
			}).start(); 
			
		}

	}

}
