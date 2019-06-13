package com.dms.java.jvm;

import java.util.Random;

/**
 * 抛出java heap space 异常的演示示例
 * intern():作用；简单来说就是intern用来返回常量池中的某字符串，
 * 				   如果常量池中已经存在该字符串，则直接返回常量池中该对象的引用。
 * 				   否则，在常量池中加入该对象，然后 返回引用
 * 常量池：在jdk1.7之前，字符串常量存储在方法区的PermGen Space。在jdk1.7之后，字符串常量重新被移到了堆中。
 * 
 * 
 * 为了快速演示效果：启动时可配置：-Xms10m -Xmx10m
 * @author Dong
 *
 */
public class JavaHeapSpaceDemo {

	public static void main(String[] args) {
		String str = "dms";
		
		while(true) {
			str += str + new Random().nextInt(11111111) + new Random().nextInt(22222222);
			str.intern();
		}

	}

}
