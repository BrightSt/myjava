package com.dms.java.jvm;

import java.util.HashMap;
import java.util.WeakHashMap;

/**
 * weakhashmap 使用示例  缓存设计使用。
 * @author Dong
 *
 */
public class WeakHashMapDemo {
	
	public static void main(String[] args) {
		myHashmap();
		System.out.println("===================================");
		myWeakHashmap();
	}
	
	public static void myHashmap() {
		HashMap<Integer, String> map = new HashMap<>();
		Integer key = new Integer(1);
		String value = "HashMap";
		map.put(key, value);
		System.out.println(map);
		
		
		key = null;
		System.out.println(map);
		
		System.gc();
		
		System.out.println(map);
	}
	
	public static void myWeakHashmap() {
		WeakHashMap<Integer, String> map = new WeakHashMap<>();
		Integer key = new Integer(2);
		String value = "WeakHashMap";
		map.put(key, value);
		System.out.println(map);
		
		
		key = null;
		System.out.println(map);
		
		System.gc();
		
		System.out.println(map);
	}

}
