package com.dms.java.utils;

import java.util.Arrays;
import java.util.List;

/**
 * @author dongms
 * @version V1.0
 * @Package com.dms.java.utils
 * @description 说明：
 * @date 2020/6/11 10:53
 */
public class UtilTest {

    public static void main (String[] args) {
        testListUtilsListPage();
    }

    public static void testListUtilsListPage(){
        List<String> list = Arrays.asList("1","2","3","4","5","6","7","8","9","10","11","12","13");
        MyPage myPage = new MyPage(2,5);
        System.out.println(ListUtils.listPage(list, myPage));
    }

}
