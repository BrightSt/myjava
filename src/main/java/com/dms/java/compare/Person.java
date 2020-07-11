package com.dms.java.compare;

import lombok.Data;

/**
 * @author DongMingsheng
 * @Title: ${file_name}
 * @Package ${package_name}
 * @Description: ${todo}
 * @date 2018/5/517:38
 */
@Data
public class Person implements Comparable<Person>{

    private int age;

    private String name;

    private Integer havePhones;

    public Person(int age, String name,int havePhones) {
        this.age = age;
        this.name = name;
        this.havePhones = havePhones;
    }

    @Override
    public int compareTo(Person p) {
        return this.getAge()-p.getAge();
    }
}
