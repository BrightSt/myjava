package com.dms.java.compare;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author DongMingsheng
 * @Title: ${file_name}
 * @Package ${package_name}
 * @Description: ${todo}
 * @date 2018/5/517:47
 */
public class ComparableTest {
    public static void main(String[] args) {
        List<Person> arrayList = Arrays.asList(
                new Person(29,"张三"),
                new Person(30,"王五"),
                new Person(23,"李四")
        );
        System.out.println(arrayList);
        Collections.sort(arrayList);
        System.out.println(arrayList);
    }
}
