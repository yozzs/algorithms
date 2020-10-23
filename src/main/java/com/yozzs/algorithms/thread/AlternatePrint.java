package com.yozzs.algorithms.thread;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.locks.LockSupport;

/**
 * @Author: liuys23
 * @Date: 2020/10/19
 */
public class AlternatePrint {
    Thread t1 = null;
    Thread t2 = null;
    public static void main(String[] args) {
        new AlternatePrint().test();
    }

    private void test(){
        CountDownLatch latch = new CountDownLatch(1);

        int[] int1 = new int[]{1,3,5};
        int[] int2 = new int[]{2,4,6};
        t1 = new Thread(() -> {
            try {
                    latch.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            for ( int i : int1) {
                System.out.println(i);
                LockSupport.unpark(t2);
                LockSupport.park();
            }
        }, "t1");
        t2 = new Thread(() -> {
            try {
                    latch.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            for ( int i : int2) {
                LockSupport.park();
                System.out.println(i);
                LockSupport.unpark(t1);
            }
        }, "t2");
        t1.start();
        t2.start();
        latch.countDown();
    }
}
