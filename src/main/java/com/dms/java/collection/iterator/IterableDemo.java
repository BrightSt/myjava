package com.dms.java.collection.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author dongmingsheng
 * @description 可迭代的
 * @date 2019/10/8
 */
public class IterableDemo {

    public static void main(String[] args) {
        List<String> list = new ArrayList<String>() ;
        list.add("1");
        list.add("2");
        list.add("3");

        Iterator<String> iterator = list.iterator();
        System.out.println(iterator.next());
    }
}
