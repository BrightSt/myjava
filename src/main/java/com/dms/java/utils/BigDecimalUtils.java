package com.dms.java.utils;
import java.math.BigDecimal;

/**
 * @author dongms
 * @version V1.0
 * @Package com.wisedu.data.common.utils
 * @description 说明：Bigdecimal工具类
 * @date 2020/7/6 17:34
 */
public class BigDecimalUtils {

    private BigDecimalUtils () {
    }

    /**
     * 两数相除，取小数点两位
     *
     * @param num1 分子
     * @param num2 分母
     * @return
     */
    public static String divideByTwoDecimal (BigDecimal num1, BigDecimal num2) {
        if (num1 == null || num2 == null) {
            return "";
        }
        if (num2.compareTo(new BigDecimal(0)) == 0) {
            return "0";
        }
        return num1.divide(num2, 4, BigDecimal.ROUND_DOWN)
                .multiply(new BigDecimal(100)).setScale(2, BigDecimal.ROUND_DOWN).toString();
    }

    /**
     * @param num1
     * @param num2
     * @return
     */
    public static String divideByTwoDecimal (Integer num1, Integer num2) {
        if (num1 == null || num2 == null) {
            return "";
        }
        return divideByTwoDecimal(new BigDecimal(num1), new BigDecimal(num2));
    }

}
