package com.dms.java.jvm;

import java.util.ArrayList;
import java.util.List;

/**
 * 《深入理解java虚拟机》
 * 模拟堆溢出实例
 * VM Args : -Xmx20m -Xmx20m -XX:+HeapDumpOnOutOfMemoryError  为了快速印证，可以把heap的配置参数调小一点
 * 解决思路：1.先分析堆栈快照
 * 			2.分析是内存泄露还是内存溢出
 * 			3.内存泄露表示垃圾回收没有回收应当回收的，这种就是程序可能有问题
 * 			4.内存溢出表示对象都是应当存活的，分配的堆空间太少，不够使用的。
 * @author Dong
 *
 */
public class HeapOOM {

	static class OOMObject{
		
	}
	
	public static void main(String[] args) {
	
		List<OOMObject> list = new ArrayList<OOMObject>();
		
		while(true) {
			list.add(new OOMObject());
		}

	}

}
