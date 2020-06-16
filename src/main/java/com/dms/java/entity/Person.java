package com.dms.java.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;

/**
 * @author dongms
 * @version V1.0
 * @Package com.dms.java.entity
 * @description 说明：
 * @date 2020/6/12 14:42
 */
@TableName("T_PERSON")
public class Person {

    @TableField("name")
    private String name;

    public String getName () {
        return name;
    }

    public void setName (String name) {
        this.name = name;
    }
}
