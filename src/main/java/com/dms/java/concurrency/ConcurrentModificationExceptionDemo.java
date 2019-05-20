package com.dms.java.concurrency;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * 多线程下操作线程不安全集合的后果
 * 报java.util.ConcurrentModificationException的异常。
 * @author Dong
 *
 */
public class ConcurrentModificationExceptionDemo {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		Random random = new Random();
		for (int i = 0; i < 100; i++) {
			new Thread(()->{
				list.add(random.nextInt(10));
				System.out.println(list);
			}).start(); 
		}
	}
}
