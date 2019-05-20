package com.dms.java.concurrency;

import java.util.concurrent.atomic.AtomicStampedReference;

/**
 * 时间戳原子引用
 * 多了一个类似版本号的变量，在CAS的时候不仅需要期望值与实际值一致，还要求期望版本号与实际版本号一致，才能更新成功。
 * @author Dong
 *
 */
public class AtomicStampedReferenceDemo {

	private static AtomicStampedReference<Integer> atomicStampReference = new AtomicStampedReference<Integer>(100, 1);
	
	public static void main(String[] args) {
		new Thread(()->{
			int stamp = atomicStampReference.getStamp();
			System.out.println(Thread.currentThread().getName() + " 的版本号为："+stamp);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			atomicStampReference.compareAndSet(100, 101, atomicStampReference.getStamp(), atomicStampReference.getStamp()+1);
			atomicStampReference.compareAndSet(101, 100, atomicStampReference.getStamp(), atomicStampReference.getStamp()+1);
		}).start(); 
		
		
		new Thread(()->{
			int stamp = atomicStampReference.getStamp();
			System.out.println(Thread.currentThread().getName() + "的版本号为:"+stamp);
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			boolean b = atomicStampReference.compareAndSet(100, 2019, stamp, stamp+1);
			System.out.println(b);
			System.out.println(atomicStampReference.getReference());
		}).start(); 

	}

}
