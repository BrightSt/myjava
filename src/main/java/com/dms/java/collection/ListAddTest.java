package com.dms.java.collection;

import com.dms.java.entity.Person;
import java.util.ArrayList;
import java.util.List;

/**
 * @author dongms
 * @version V1.0
 * @Package com.dms.java.collection
 * @description 说明： 数据对象新增list后，再往list里面加数据，是否会存到对象里
 * @date 2020/7/6 16:52
 */
public class ListAddTest {

    public static void main (String[] args) {
        Person person = new Person();
        person.setName("dms");
        List<String> strs = new ArrayList<>();
        strs.add("1");
        person.setId(strs);

        System.out.println(person);

        strs.add("3");
        strs.add("2");

        System.out.println(person);
    }

}
