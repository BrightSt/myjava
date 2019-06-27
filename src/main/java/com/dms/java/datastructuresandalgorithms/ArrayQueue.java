package com.dms.java.datastructuresandalgorithms;

import java.lang.reflect.Array;

/**
 * 数组实现的队列
 * @author Dong
 *
 */
public class ArrayQueue<T> {
	
	private T[] mArray;
	private int mCount;
	
	public ArrayQueue(Class<T> t,int size) {
		mArray = (T[]) Array.newInstance(t, size);
		mCount = 0;
	}
	
	public void add(T val) {
		mArray[mCount++] = val;
	}
	
	public T front() {
		return mArray[0];
	}
	
	public T pop() {
		T ret = mArray[0];
		mCount--;
		for(int i=1;i<=mCount;i++) {
			mArray[i-1] = mArray[i];
		}
		return ret;
	}
	
	public int size() {
		return mCount;
	}
	
	public boolean isEmpty() {
		return size() == 0;
	}

	public static void main(String[] args) {
		
		int tmp = 0;
		ArrayQueue<Integer> aQueue = new ArrayQueue<>(Integer.class, 12);
		
		aQueue.add(10);
		aQueue.add(20);
		aQueue.add(30);
		
		tmp = aQueue.pop();
		System.out.printf("tmp=%d\n", tmp);
		
		tmp = aQueue.front();
		System.out.printf("tmp=%d\n", tmp);
		
		aQueue.add(40);
		
		System.out.printf("isEmpty()=%b\n", aQueue.isEmpty());
		System.out.printf("size()=%d\n", aQueue.size());
		while (!aQueue.isEmpty()) {
			System.out.printf("size()=%d\n", aQueue.pop());
		}

	}

}
