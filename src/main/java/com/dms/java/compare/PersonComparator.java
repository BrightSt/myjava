package com.dms.java.compare;

import java.util.Comparator;

/**
 * @author dongms
 * @version V1.0
 * @Package com.dms.java.compare
 * @description 说明：
 * @date 2020/7/8 9:55
 */
public class PersonComparator implements Comparator<Person> {

    /**
     * 降序
     * @param o1
     * @param o2
     * @return
     */
    @Override
    public int compare (Person o1, Person o2) {
        Integer num1 = o1.getHavePhones();
        Integer num2 = o2.getHavePhones();
        return num1.compareTo(num2);
    }
}
