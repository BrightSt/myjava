package com.dms.java.common;

import java.math.BigDecimal;

public class BigDecimalDemo {

	public static void main(String[] args) {
		String n1 = "4.5";
		String n2 = "3.6";
		
		BigDecimal bigDecimal = new BigDecimal(0);
		BigDecimal bigDecimal1 = new BigDecimal(n1);
		BigDecimal bigDecimal2 = new BigDecimal(n2);
		

		bigDecimal = bigDecimal.add(bigDecimal1);
		bigDecimal = bigDecimal.add(bigDecimal2);
		
		BigDecimal bigDecimal3 = new BigDecimal("4");
		
		System.out.println(bigDecimal3.doubleValue());
		
	}

}
