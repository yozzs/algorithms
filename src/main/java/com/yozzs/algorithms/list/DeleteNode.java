package com.yozzs.algorithms.list;

/**
 * @Author: liuys23
 * @Date: 2020/7/12
 * 18. 删除节点 题目保证链表中节点的值互不相同
 */
public class DeleteNode {
    public ListNode deleteNode(ListNode head, int val) {
        if (head == null) return null;
        if (head.val == val) return head.next;
        ListNode dummy = head;
        while (dummy.next != null){
            if (dummy.next.val == val){
                dummy.next = dummy.next.next;
                break;
            }
            dummy = dummy.next;
        }
        return head;
    }
}
