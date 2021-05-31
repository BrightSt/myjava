package com.dms.java;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class FutureTaskTest {

    public static void main(String[] args) throws InterruptedException, ExecutionException {

        long starttime = System.currentTimeMillis();

        //input2生成， 需要耗费3秒
        FutureTask<Integer> input2_futuretask = new FutureTask<>(new Callable<Integer>() {

            @Override
            public Integer call() throws Exception {
                Thread.sleep(3000);
                return 5;
            }
        });

        new Thread(input2_futuretask).start();

        //input1生成，需要耗费2秒
        FutureTask<Integer> input1_futuretask = new FutureTask<>(new Callable<Integer>() {

            @Override
            public Integer call() throws Exception {
                Thread.sleep(2000);
                return 3;
            }
        });
        new Thread(input1_futuretask).start();

        Integer integer2 = input2_futuretask.get();
        Integer integer1 = input1_futuretask.get();
        System.out.println(algorithm(integer1, integer2));
        long endtime = System.currentTimeMillis();
        System.out.println("用时：" + String.valueOf(endtime - starttime));
    }

    //这是我们要执行的算法
    public static int algorithm(int input, int input2) {
        return input + input2;
    }
}
