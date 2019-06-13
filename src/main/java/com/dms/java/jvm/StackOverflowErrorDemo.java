package com.dms.java.jvm;

/**
 * 出现StackOverflow错误演示。 栈空间溢出
 * @author Dong
 *
 */
public class StackOverflowErrorDemo {
	
	public static void main(String[] args) {
		stackOverflowError();
	}
	
	public static void stackOverflowError() {
		stackOverflowError();
	}

}
