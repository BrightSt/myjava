package com.dms.java.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author dongms
 * @version V1.0
 * @Package com.dms.java.collection
 * @description 说明：
 * @date 2020/7/9 16:54
 */
public class ListTest {

    public static void main (String[] args) {
        retailAll();
    }

    /**
     * 取交集
     */
    public static void retailAll(){

        List<String> list1 = new ArrayList<>();
        list1.add("1");
        list1.add("2");
        list1.add("3");
        list1.add("4");
        List<String> list2 = new ArrayList<>();
        list2.add("3");
        list2.add("45");
        list2.add("5");
        list2.add("1");
        list2.add("2");

        System.out.println(list1.size());
        list1.retainAll(list2);
        System.out.println(list1.size());

    }

}
