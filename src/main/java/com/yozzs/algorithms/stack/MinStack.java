package com.yozzs.algorithms.stack;

import java.util.Stack;

/**
 * @Author: liuys23
 * @Date: 2020/7/14
 * 实现stack的获取最小值方法
 * 辅助栈
 */
public class MinStack {
    private Stack<Integer> mainStack;
    private Stack<Integer> supStack;

    public MinStack() {
        this.mainStack = new Stack<>();
        this.supStack = new Stack<>();
    }

    public void push(int x) {
        mainStack.push(x);
        if (supStack.empty()){
            supStack.push(x);
        }else {
            supStack.push(Math.min(supStack.peek(),x));
        }
    }

    public void pop() {
        mainStack.pop();
        supStack.pop();
    }

    public int top() {
        return mainStack.peek();
    }

    public int min() {
        return supStack.peek();
    }
}
