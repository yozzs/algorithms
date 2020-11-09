package com.yozzs.algorithms.list.block;

import java.util.concurrent.CountDownLatch;

/**
 * @Author: liuys23
 * @Date: 2020/11/9
 */
public class Test {
    public static void main(String[] args) throws InterruptedException {
        Queue queue = new BlockingQueue(5);
        CountDownLatch offerLatch = new CountDownLatch(1);
        CountDownLatch takeLatch = new CountDownLatch(1);
        for (int i = 0; i < 10; i++) {
            int finalI = i;
            new Thread(() -> {
                try {
                    offerLatch.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                queue.offer("offer-" + finalI);
            }, "OfferThread-" + i).start();
        }
        offerLatch.countDown();
        Thread.sleep(5000);

        for (int i = 0; i < 10; i++) {
            int finalI = i;
            new Thread(() -> {
                try {
                    takeLatch.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                queue.take();
            }, "TakeThread-" + i).start();
        }
        takeLatch.countDown();
        Thread.sleep(5000);
    }
}
