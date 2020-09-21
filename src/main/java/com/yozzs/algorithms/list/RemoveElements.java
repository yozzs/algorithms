package com.yozzs.algorithms.list;

/**
 * @Author: liuys23
 * @Date: 2020/9/21
 * 203. 移除链表元素
 * 删除链表中等于给定值 val 的所有节点。
 */
public class RemoveElements {
    public ListNode removeElements(ListNode head, int val) {
        if (head == null) return null;
        ListNode pre = new ListNode(-1);
        pre.next = head;
        ListNode p = pre;
        while (p.next != null){
            if (p.next.val == val){
                p.next = p.next.next;
            }else{
                p = p.next;
            }
        }
        return pre.next;
    }
}
