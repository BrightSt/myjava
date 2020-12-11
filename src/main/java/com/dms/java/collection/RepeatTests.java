package com.dms.java.collection;

import com.dms.java.entity.User;
import java.util.*;

/**
 * @author dongms（01119453）
 * @version V1.0
 * @Package com.dms.java.Collection
 * @description 说明：重复性校验测试
 * @date 2020/2/16 20:34
 */
public class RepeatTests {
    public static void main(String[] args) {
        User user = new User();
        user.setId(1);
        user.setName("dms");

        // 同一个对象的hash值一样
        System.out.println("hash1=="+Objects.hash(user));
        System.out.println("hash2=="+Objects.hash(user));

        // HashSet 根据传递对象的hash值，去重
        Set<User> userSet = new HashSet<>();
        userSet.add(user);
        userSet.add(user);
        userSet.add(user);
        userSet.add(user);
        userSet.add(user);
        userSet.add(user);
        System.out.println("userSet="+userSet);


        // ArrayList 没有校验，直接加+存储元素
        List<User> userList = new ArrayList<>();
        userList.add(user);
        userList.add(user);
        System.out.println("userList="+userList);
    }
}

