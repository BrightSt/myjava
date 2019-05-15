package com.dms.java.jvm;

/**
 * 栈溢出
 * StackOverflowError: 如果线程请求的栈深度大于虚拟机所允许的最大深度，讲抛出StackOverflowError
 * OutOfMemoryError:如果虚拟机在扩展栈时无法申请到足够的内存空间，则抛出OutOfMemoryError
 * VM Args:-Xss128k
 * @author Dong
 *
 */
public class JavaVMStackSOF {
	private int stackLength = 1;
	
	// 递归调用  引发StackOverflowError
	public void stackLeak() {
		stackLength ++;
		stackLeak();
	}
	public static void main(String[] args) {
		JavaVMStackSOF javaVMStackSOF = new JavaVMStackSOF();
		try {
			javaVMStackSOF.stackLeak();
		} catch (Exception e) {
			System.out.println("stack length:"+javaVMStackSOF.stackLength);
			throw e;
		}
		
	}

}
