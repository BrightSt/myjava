package com.dms.java.utils;

import java.util.List;
import org.apache.poi.ss.formula.functions.T;

/**
 * @author dongms
 * @version V1.0
 * @Package com.dms.java.utils
 * @description 说明：list 工具类
 * @date 2020/6/11 10:39
 */
public class ListUtils {

    /**
     * 获取list的分页数据
     * @param list
     * @param myPage
     * @param <T>
     * @return
     */
    public static <T> List<T> listPage(List<T> list,MyPage myPage){
        int startRow = (myPage.getPageNum()-1)*myPage.getPageSize();
        int endRow = myPage.getPageNum()*myPage.getPageSize();

        return list.subList(startRow,endRow);
    }
}
