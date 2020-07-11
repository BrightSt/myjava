package com.dms.java.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import java.util.List;
import lombok.Data;

/**
 * @author dongms
 * @version V1.0
 * @Package com.dms.java.entity
 * @description 说明：
 * @date 2020/6/12 14:42
 */
@Data
@TableName("T_PERSON")
public class Person {

    @TableField("name")
    private String name;

    private List<String> id;

}
