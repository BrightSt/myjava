package com.dms.java.collection;

import java.util.ArrayList;
import java.util.List;
import org.apache.commons.collections4.CollectionUtils;

/**
 * @author dongms
 * @version V1.0
 * @Package com.dms.java.collection
 * @description 说明：CollectionUtils类测试
 * @date 2020/6/19 15:54
 */
public class CollectionUtilsTest {

    public static void main (String[] args) {
        collecionTest();
    }

    public static void collecionTest(){
        List<String> list = new ArrayList<>();
        System.out.println(list.size());
        System.out.println(CollectionUtils.isEmpty(list));
    }

}
