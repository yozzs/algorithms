package com.yozzs.algorithms.list;

/**
 * @Author: liuys23
 * @Date: 2020/9/15
 * 面试题 02.02. 返回倒数第 k 个节点
 * 输入： 1->2->3->4->5 和 k = 2
 * 输出： 4
 */
public class KthFromEnd2 {
    public int kthToLast(ListNode head, int k) {
        ListNode p1 = head;
        ListNode p2 = head;
        for (int i = 0; i < k; i++) {
            p1 = p1.next;
        }
        while (p1 != null){
            p1 = p1.next;
            p2 = p2.next;
        }
        return p2.val;
    }
}
