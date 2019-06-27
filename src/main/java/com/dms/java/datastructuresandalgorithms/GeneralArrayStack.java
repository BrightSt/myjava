package com.dms.java.datastructuresandalgorithms;

import java.lang.reflect.Array;

/**
 * 数组实现的栈，能存储任意类型的数据
 * @author Dong
 *
 */
public class GeneralArrayStack<T> {
	
	// 数组默认长度
	private static final int DEFAULT_SIZE = 12;
	
	// 存储数据的数组
	private T[] mArray;
	
	// 存储的数据大小
	private int count;
	
	public GeneralArrayStack(Class<T> type) {
		this(type,DEFAULT_SIZE);
	}
	
	public GeneralArrayStack(Class<T> type, int size) {
		mArray = (T[]) Array.newInstance(type, size);
		count = 0;
	}
	
	public void push(T val) {
		mArray[count++]=val;
	}
	
	public T peek() {
		return mArray[count-1];
	}
	
	public T pop() {
		T ret = mArray[count-1];
		count--;
		return ret;
	}
	
	public int size() {
		return count;
	}
	
	public boolean isEmpty() {
		return size() == 0;
	}
	
	public void PrintArrayStack() {
		if(isEmpty()) {
			System.out.println("stack is Empty\n");
			return;
		}
		
		System.out.printf("stack size()=%d\n",size());
		
		int i=size()-1;
		while(i>=0) {
			System.out.println(mArray[i]);
			i--;
		}
	}
	
	public static void main(String[] args) {
		String tmp;
		GeneralArrayStack<String> astack = new GeneralArrayStack<>(String.class);
		
		astack.push("10");
		astack.push("20");
		astack.push("30");
		
		tmp = astack.pop();
		System.out.println("tmp="+tmp);
		
		tmp = astack.peek();
		System.out.println("tmp="+tmp);
		
		astack.push("40");
		astack.PrintArrayStack();
	}
}
