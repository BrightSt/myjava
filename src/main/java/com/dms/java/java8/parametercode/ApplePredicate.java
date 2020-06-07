package com.dms.java.java8.parametercode;

/**
 * @author dongms
 * @version V1.0
 * @Package com.dms.java.java8.parametercode
 * @description 说明：筛选条件判断
 * 如果需要筛选条件，实现该接口即可
 * @date 2020/6/7 22:06
 */
public interface ApplePredicate {
    boolean test(Apple apple);
}
