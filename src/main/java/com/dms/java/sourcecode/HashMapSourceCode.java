package com.dms.java.sourcecode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class HashMapSourceCode {

	/**
	 * HashMap的实现原理
	 * 1.基于哈希表（数组+链表+二叉树（红黑树））  默认大小为：16
	 * 2.默认加载因子为0.75，代表的含义：如果存储的元素达到了0.75，表示存储的元素已经够多了，数据的空间已经达到了上限，然后数组需要重新创建。16*0.75=12.自己可以指定加载因子，不建议修改，0.75比较合理。
	 * 3.把对象存储到哈希表中，如何存储？
	 * 	把key对象通过hash()方法计算hash值，然后用这个hash值对数组长度取余（默认16），来决定该key对象的在数组中存储的位置，当这个位置有多个对象时，以链表结构存储，jdk1.8后、
	 *  当链表长度大于8时，链表将转化为红黑树机构存储。
	 *  这样的目的，是为了取值更快。 根据key的hash值，就可以获取到所在的位置。存储的数据量越大，性能的表现越明显。
	 *  
	 *  数组扩充原理：当数组的容量超过了.75,表示该数组需要扩充，如果进行扩充：
	 *  扩充的算法是：当前数组容量<<1（相当于*2），扩大1倍-32。需要重新散列。 扩充次数过多，会影响性能，每次扩充表示哈希表重新散列（重新计算每个对象的存储位置），我们在
	 *  开发中要减少扩充次数带来的性能问题。
	 *
	 *   线程不安全的 ：适合在单线程使用 
	 *  
	 *  
	 *  细节整理：
	 *  oldCap << 1  左移一位，也就是oldCap*2 。
	 *  
	 */
	
	public static void main(String[] args) {
		
		HashMap<String, String> hashmap = new HashMap<String, String>();
		hashmap.put("1", "1");
		hashmap.get("1");
		
		
		System.out.println();


		ArrayList<Integer> list = new ArrayList<>();
		list.toArray();

		Integer[] i = new Integer[30];
		Arrays.asList(i);
	}

}
