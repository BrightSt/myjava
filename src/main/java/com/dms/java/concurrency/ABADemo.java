package com.dms.java.concurrency;

import java.util.concurrent.atomic.AtomicReference;

/**
 * ABA问题产生演示
 * 什么是ABA问题：
 * 一个线程获取到了变量值是A，然后改成了B，又改回来了A，另外一个线程同时也获取到了
 * 该变量，它期望是A实际上也是A(只不过中间被改过)，于是就CAS成功。
 * @author Dong
 *
 */
public class ABADemo {
	
	private static AtomicReference<Integer> atomicReference = new AtomicReference<Integer>(100);

	public static void main(String[] args) {
		new Thread(()->{
			atomicReference.compareAndSet(100, 101);
			atomicReference.compareAndSet(101, 100);
		}).start(); 
		
		new Thread(()->{
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			atomicReference.compareAndSet(100, 2019);
			System.out.println(atomicReference.get());
		}).start(); 

	}

}
