package com.dms.java.test;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/**
 * @author dongmingsheng
 */
public class Test {

	public static void main(String[] args) {
		Calendar date = Calendar.getInstance();
		String year = String.valueOf(date.get(Calendar.YEAR));
		System.out.println(year);

	}
}


class Test11{
	static {
		System.out.println(1111);
	}
}
