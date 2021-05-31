package com.dms.java.java8;

import jdk.nashorn.internal.runtime.options.Option;
import org.junit.Test;

import java.util.Optional;

public class OptionTest {

    @Test
    public void test1(){
        Person p = null;
        Optional<Person> option1 = Optional.ofNullable(p); // ofNullable 传入值可以为null   of：传入值不能为null
        System.out.println("option1:"+option1.isPresent());


        Person p1 = new Person();
        p1.setName(null);
        Optional<String> option2 = Optional.ofNullable(p1).map(Person::getName);
        System.out.println("option2:"+option2.isPresent());


        Person p2 = new Person();
        p2.setName("dms");
        Optional<String> option3 = Optional.ofNullable(p2).map(Person::getName);
        if (option3.isPresent()){
            System.out.println("name:"+option3.get());
        }
    }
}


class Person{
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}