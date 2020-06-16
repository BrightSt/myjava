package com.dms.java.entity;

/**
 * @author dongms
 * @version V1.0
 * @Package com.dms.java.entity
 * @description 说明：
 * @date 2020/6/16 19:25
 */
public class User{
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
