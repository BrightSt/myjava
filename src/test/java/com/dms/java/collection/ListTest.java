package com.dms.java.collection;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author dongms
 * @version V1.0
 * @Package com.dms.java.collection
 * @description 说明：
 * @date 2020/7/9 16:54
 */
public class ListTest {

    public static void main (String[] args) {
        java8sort();
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

    public static void java8sort(){
        List<Person> personList = new ArrayList<>();

        Person pA = new Person();
        pA.setOrder("-");
        personList.add(pA);

        Person p1 = new Person();
        p1.setOrder("2");
        personList.add(p1);

        Person p2 = new Person();
        p2.setOrder("5");
        personList.add(p2);

        Person p3 = new Person();
        p3.setOrder("1");
        personList.add(p3);

        Person p4 = new Person();
        p4.setOrder("-");
        personList.add(p4);

        Person p5 = new Person();
        p5.setOrder("10");
        personList.add(p5);

        List<Person> lastList = new ArrayList<>();

        Iterator<Person> iterator = personList.iterator();
        while (iterator.hasNext()){
            Person person = iterator.next();
            if (person.getOrder().equals("-")){
                lastList.add(person);
                iterator.remove();
            }
        }

        Collections.sort(personList, Comparator.comparing(o -> Integer.valueOf(o.getOrder())));
        personList.addAll(lastList);

        System.out.println(personList);
    }



}


class Person{

    private String order;

    public String getOrder() {
        return order;
    }

    public void setOrder(String order) {
        this.order = order;
    }

    @Override
    public String toString() {
        return "Person{" +
                "order='" + order + '\'' +
                '}';
    }
}
