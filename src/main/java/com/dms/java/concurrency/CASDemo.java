package com.dms.java.concurrency;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * CAS使用示例  CAS=compare and swap 比较并交换
 * 先比较，比较的内容为：期望值与实际值是否一样，如果一样就交换新值。如果不一样就无法交换，返回false
 * AtomicXX 就是使用了CAS
 * @author Dong
 *
 */
public class CASDemo {

	public static void main(String[] args) {
		
		AtomicInteger atomicInteger = new AtomicInteger(666);
		boolean b = atomicInteger.compareAndSet(666, 2019);
		System.out.println(b +" atomicInteger value = " + atomicInteger.get());
		
		boolean b1 = atomicInteger.compareAndSet(666, 2020);
		System.out.println(b1 +" atomicInteger value = " + atomicInteger.get());
		
		atomicInteger.getAndIncrement();

	}

}
