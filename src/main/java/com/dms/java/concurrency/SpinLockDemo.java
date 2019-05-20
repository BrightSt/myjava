package com.dms.java.concurrency;

import java.util.concurrent.atomic.AtomicReference;

/**
 * 自旋锁示例
 * @author Dong
 *
 */
public class SpinLockDemo {

	private AtomicReference<Thread> atomicReference = new AtomicReference<Thread>();
	
	private void lock() {
		System.out.println(Thread.currentThread()+ " coming....");
		while(!atomicReference.compareAndSet(null, Thread.currentThread())) {
			
		}
	}
	
	private void unlock() {
		Thread thread = Thread.currentThread();
		atomicReference.compareAndSet(thread, null);
		System.out.println(thread+" unlock...");
	}
	
	public static void main(String[] args) {
		SpinLockDemo lock = new SpinLockDemo();
		
		new Thread(()->{
			lock.lock();
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("hahaha");
			lock.unlock();
		}).start(); 
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		new Thread(()->{
			lock.lock();
			System.out.println("hehehe");
			lock.unlock();
		}).start(); 
	}
}
