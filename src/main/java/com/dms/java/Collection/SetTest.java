package com.dms.java.Collection;

import java.util.HashSet;
import java.util.Set;

public class SetTest {
    public static void main(String[] args) {
        Set<Person> set =new HashSet<>();
       Person person = new Person();
       person.setName("dms");
       person.setCode("111");
       set.add(person);

        Person person1 = new Person();
        person1.setName("dms");
        person1.setCode("111");
        set.add(person1);


        System.out.println(set);
    }
}

class Person{
    String name;
    String code;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
