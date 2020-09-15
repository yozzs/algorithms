package com.yozzs.algorithms.list;

/**
 * @Author: liuys23
 * @Date: 2020/9/15
 * 61. 旋转链表
 * 给定一个链表，旋转链表，将链表每个节点向右移动 k 个位置，其中 k 是非负数。
 *
 * 示例 1:
 *
 * 输入: 1->2->3->4->5->NULL, k = 2
 * 输出: 4->5->1->2->3->NULL
 * 解释:
 * 向右旋转 1 步: 5->1->2->3->4->NULL
 * 向右旋转 2 步: 4->5->1->2->3->NULL
 */
public class RotateRight {
    //双指针闭环 ，断链  打败5%
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null) return null;
        ListNode p1 = head;
        ListNode p2 = head;
        for (int i = 0; i < k; i++) {
            p1 = p1.next;
            if (p1 == null){
                p1 = head;
            }
        }
        while (true){
            if (p1.next == null){
                p1.next = head;
                ListNode res = p2.next;
                p2.next = null;
                return res;
            }else {
                p1 = p1.next;
                p2 = p2.next;
            }
        }
    }

    //计算链表长度，先闭环，再断链， 打败89%
    public ListNode rotateRight2(ListNode head, int k) {
        if (head == null) return null;
        ListNode p = head;
        int size = 1;
        while (p.next != null){
            size++;
            p = p.next;
        }
        k %= size;
        int idx = size - k;
        p.next = head;
        for (int i = 0; i < idx; i++) {
            p = p.next;
        }
        ListNode res = p.next;
        p.next = null;
        return res;
    }
}
