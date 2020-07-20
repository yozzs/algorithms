package com.yozzs.algorithms.list;

import java.util.Stack;

/**
 * @Author: liuys23
 * @Date: 2020/7/13
 * 找出链表的倒数第k个节点
 * 双指针
 * 123456789 3
 */
public class KthFromEnd {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next(2).next(3).next(4).next(5).next(6).next(7).next(8).next(9);
        System.out.println(new KthFromEnd().getKthFromEnd(head,9));
    }
    public ListNode getKthFromEnd(ListNode head, int k) {
        if (head == null) return null;
        if (k <= 0) return null;
        ListNode p1 = head;
        ListNode p2 = head;
        for (int i = 1; i < k; i++) {
            p1 = p1.next;
            if (p1 == null){
                return null;
            }
        }
        while (p1.next != null){
            p1 = p1.next;
            p2 = p2.next;
        }
        return p2;

    }
}
