package com.dms.java.common;

import java.util.ArrayList;
import java.util.List;

public class FinalTest {

	public static void main(String[] args) {
		
		 final List<String> strList = new ArrayList<>();
		 strList.add("Hello");
		 strList.add("world");  
//		 List<String> unmodifiableStrList = List.of("hello", "world");
//		 unmodifiableStrList.add("again");

		 System.runFinalization();
		

	}

}
