package com.dms.java.test;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.dms.java.entity.Person;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

/**
 * @author dongmingsheng
 */
public class Test {

	public static void main(String[] args) {
	}


	public static void testList1(){
		List<String> list1 = new ArrayList<>();
		list1.add("1");
		list1.add("2");
		list1.add("3");
		list1.add("4");
		list1.add("5");

		List<String> list2 = new ArrayList<>();
		list2.add("2");
		list2.add("3");
		list2.add("4");
		list2.add("6");

		for (String str : list1){
			for (int i=0;i<list2.size();i++){
				if (str.equals(list2.get(i))){
					list2.remove(i);
					i--;
				}
			}
		}
		System.out.println(list2);
		System.out.println(111);
	}
}
