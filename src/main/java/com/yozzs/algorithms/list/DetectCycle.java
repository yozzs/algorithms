package com.yozzs.algorithms.list;

/**
 * @Author: liuys23
 * @Date: 2020/9/16
 * 面试题 02.08. 环路检测
 * 快慢指针
 */
public class DetectCycle {
    public ListNode detectCycle(ListNode head) {
        if (head == null || head.next == head) return head;
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast){
                fast = head;
                while (slow != fast){
                    slow = slow.next;
                    fast = fast.next;
                }
                return slow;
            }
        }
        return null;
    }
}
