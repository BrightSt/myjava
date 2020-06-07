package com.dms.java.Collection;

import java.util.*;

/**
 * @author dongms（01119453）
 * @version V1.0
 * @Package com.dms.java.Collection
 * @description 说明：
 * @date 2020/2/16 20:34
 * @Copyright © 2017 - 2019 江苏金智教育信息股份有限公司
 */
public class ListTests {
    public static void main(String[] args) {
        User user = new User();
        user.setId(1);
        user.setName("dms");
        List<User> userList = new LinkedList<>();
        Set<User> userSet = new HashSet<>();
        userSet.add(user);
        userSet.add(user);
        userSet.add(user);
        userSet.add(user);
        userSet.add(user);
        userSet.add(user);
        System.out.println(userSet);
    }
}

class User{
    private int id ;

    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}