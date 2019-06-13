package com.dms.java.jvm;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/**
 * 引用队列示例（弱引用）
 * @author Dong
 *
 */
public class ReferenceQueueDemo {

	public static void main(String[] args) throws InterruptedException {
		Object obj = new Object();
		ReferenceQueue<Object> referenceQueue = new ReferenceQueue<>();
		WeakReference<Object> weakReference = new WeakReference<Object>(obj, referenceQueue);
		System.out.println(obj);
		System.out.println(weakReference.get());
		System.out.println(referenceQueue.poll());
		
		
		obj = null;
		System.gc();
		Thread.sleep(500);
		
		System.out.println("GC之后。。。。。");
		System.out.println(obj);
		System.out.println(weakReference.get());
		System.out.println(referenceQueue.poll());

	}

}
