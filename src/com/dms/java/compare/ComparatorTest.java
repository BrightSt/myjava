package com.dms.java.compare;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.TreeSet;

/**
 * 利用comparator接口实现集合的排序
 */
public class ComparatorTest {

    public static void main(String[] args) {
        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return Integer.compare(o1,o2);
            }
        };

        TreeSet<Integer> ts = new TreeSet<>(comparator);
        ts.add(1);
        ts.add(12);
        ts.add(23);
        ts.add(11);
        System.out.println(ts);


    }
}
