package com.yozzs.algorithms.stack;

import java.util.Stack;

/**
 * @Author: liuys23
 * @Date: 2020/7/9
 * 用两个栈实现队列
 */
public class CQueue {
    Stack<Integer> stack1;
    Stack<Integer> stack2;

    public CQueue() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    public void appendTail(int value) {
        stack1.push(value);
    }

    public int deleteHead() {
        if (stack2.empty()){
            if (stack1.empty())
                return -1;
            while (!stack1.empty()){
                stack2.push(stack1.pop());
            }
        }
        return  stack2.pop();
    }
}
