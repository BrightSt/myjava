package com.dms.java.jvm;

import java.lang.ref.SoftReference;

/**
 * 软引用示例
 * @author Dong
 *
 */
public class SoftReferenceDemo {
	
	public static void softRef_Memory_Enough() {
		Object o1 = new Object();
		SoftReference<Object> softReference = new SoftReference<Object>(o1);
		System.out.println(o1);
		System.out.println(softReference.get());
	}
	
	/**
	 * -Xms10m -Xmx10m -XX:+PrintGCDetail
	 */
	public static void softRef_Memory_NotEnough() {
		Object obj = new Object();
		SoftReference<Object> softReference = new SoftReference<Object>(obj);
		obj = null;
		
		try {
			byte[] bytes = new byte[20*1024*1024];
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			System.out.println("软引用:"+softReference.get());
		}
	}
	
	public static void main(String[] args) {
		//softRef_Memory_Enough(); 
		softRef_Memory_NotEnough();
	}

} 
