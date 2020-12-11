package com.dms.java.common;

/**
 * break测试，break终止内部的循环
 * 例子中break终止while，外层for不会受到影响
 * @author dongms
 */
public class BreakTest {

    private static final int NUM = 10;
    public static void main(String[] args) {
        for (int i=0;i<NUM;i++){
            int j = 0;
            while (true){
                if (j<5){
                    j++;
                }else{
                    break;
                }
            }
            System.out.println(j);
        }
    }
}
