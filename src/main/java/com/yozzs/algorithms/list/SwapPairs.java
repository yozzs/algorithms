package com.yozzs.algorithms.list;

/**
 * @Author: liuys23
 * @Date: 2020/9/16
 * 24. 两两交换链表中的节点
 * 给定 1->2->3->4, 你应该返回 2->1->4->3.
 */
public class SwapPairs {
    //递归
    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode next = head.next;
        head.next = swapPairs(next.next);
        next.next = head;
        return next;
    }

    //迭代
    public ListNode swapPairs1(ListNode head) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode pre = dummy;

        while (head != null && head.next != null){
            ListNode first = head;
            ListNode second = head.next;
            //swap
            pre.next = second;
            first.next = second.next;
            second.next = first;

            pre = first;
            head = pre.next;
        }
        return dummy.next;
    }

}
