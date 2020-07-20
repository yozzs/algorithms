package com.yozzs.algorithms.stack;

/**
 * @Author: liuys23
 * @Date: 2020/7/14
 * 实现stack的获取最小值方法
 * 单向链表，在头节点维护最小值
 */
public class MinStack2 {
    private Node head;

    public MinStack2() {}

    public void push(int x) {
        if (head == null)
            head = new Node(x, x, null);
        else
            head = new Node(x, Math.min(head.min, x), head);
    }

    public void pop() {
        head = head.next;
    }

    public int top() {
        return head.val;
    }

    public int min() {
        return head.min;
    }

    private class Node {
        int val;
        int min;
        Node next;

        Node(int val, int min, Node next) {
            this.val = val;
            this.min = min;
            this.next = next;
        }
    }
}
