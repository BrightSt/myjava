package com.dms.java.compare;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
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
        ListSortTest();
    }

    /**
     * Collections.sort 测试
     */
    public static void CollectionSortTest(){
        List<Person> arrayList = Arrays.asList(
                new Person(29,"张三",1),
                new Person(30,"王五",8),
                new Person(23,"李四",4)
        );
        System.out.println(arrayList);
        Collections.sort(arrayList);
        System.out.println(arrayList);
    }

    public static void ListSortTest(){
        List<Person> arrayList = Arrays.asList(
                new Person(29,"张三",1),
                new Person(30,"王五",8),
                new Person(23,"李四",4)
        );
        System.out.println(arrayList);
       // arrayList.sort(new PersonComparator());
        arrayList.sort(Comparator.comparing(Person::getHavePhones).reversed());
        System.out.println(arrayList);
    }
}
