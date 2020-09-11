package com.yozzs.algorithms.queue;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @Author: liuys23
 * @Date: 2020/9/8
 * 剑指 Offer 59 - II. 队列的最大值
 * 单调队列
 */
public class MaxQueue {
    private Deque<Integer> queue;
    private Deque<Integer> helper;

    public MaxQueue() {
        queue = new ArrayDeque<>();
        helper = new ArrayDeque<>();
    }

    public int max_value() {
        return helper.isEmpty() ? -1 : helper.peek();
    }

    public void push_back(int value) {
        queue.offer(value);
        while (!helper.isEmpty() && helper.peekLast() < value){
            helper.pollLast();
        }
        helper.offer(value);
    }

    public int pop_front() {
        if (queue.isEmpty() || helper.isEmpty()){
            return -1;
        }
        Integer val = queue.removeFirst();
        if (val >= helper.peek()){
            helper.pop();
        }
        return val;
    }
}
