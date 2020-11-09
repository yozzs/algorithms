package com.yozzs.algorithms.list.block;

import java.util.LinkedList;

/**
 * @Author: liuys23
 * @Date: 2020/11/9
 */
public class BlockingQueue<E> implements Queue<E> {
    private int maxSize;
    private static final int DEFAULT_MAXSIZE = 10;
    LinkedList<E> queue;

    public BlockingQueue(int maxSize) {
        this.maxSize = maxSize;
        this.queue = new LinkedList<>();
    }

    public BlockingQueue() {
        this(DEFAULT_MAXSIZE);
    }

    @Override
    public int size() {
        return queue.size();
    }

    @Override
    public void offer(E e) {
        synchronized (queue){
            while (this.queue.size() >= maxSize){
                try {
                    console(e, "wait");
                    queue.wait();
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
            }
            queue.addLast(e);
            console(e, "add");
            queue.notifyAll();
        }
    }

    @Override
    public E take() {
        E e = null;
        synchronized (queue){
            while (this.queue.isEmpty()){
                try {
                    console(null, "wait");
                    queue.wait();
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
            }
            e = queue.removeFirst();
            console(e, "remove");
            queue.notifyAll();
        }
        return e;
    }

    public void console(E e, String flag) {
        System.out.println(Thread.currentThread().getName() + ":" + flag + ":" + e + ":" + queue.size());
    }
}
