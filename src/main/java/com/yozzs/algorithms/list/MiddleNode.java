package com.yozzs.algorithms.list;

/**
 * @Author: liuys23
 * @Date: 2020/9/21
 * 876. 链表的中间结点
 */
public class MiddleNode {
    public ListNode middleNode(ListNode head) {
        if (head == null) return null;
        ListNode fast = head;
        ListNode slow = head;
        while (fast.next != null && fast.next.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        return fast.next == null ? slow : slow.next;
    }
}
