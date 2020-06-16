package com.dms.java.utils;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author dongms
 * @version V1.0
 * @Package com.dms.java.utils
 * @description 说明：分页
 * @date 2020/6/11 10:40
 */
@Data
@AllArgsConstructor
public class MyPage {

    /** 页号 **/
    private int pageNum;

    /** 页数据条数 **/
    private int pageSize;

}
