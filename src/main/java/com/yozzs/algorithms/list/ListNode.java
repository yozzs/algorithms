package com.yozzs.algorithms.list;

/**
 * @Author: liuys23
 * @Date: 2020/7/9
 */
public class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }

    public ListNode next(int x){
        this.next = new ListNode(x);
        return this.next;
    }

    @Override
    public String toString() {
        String nextVal = next == null ? "" : " " + next;
        return  val + nextVal;
    }
}
