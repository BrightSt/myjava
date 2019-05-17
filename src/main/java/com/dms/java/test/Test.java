package com.dms.java.test;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Test {
	public static void main(String[] args) {
		// 1557453600
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");  
		System.out.println(sdf.format(new Date(1557417600)));
	}
}
