package com.dms.java.common;

public class BreakTest {

    public static void main(String[] args) {
        for (int i=0;i<10;i++){
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
