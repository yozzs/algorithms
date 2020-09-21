package com.yozzs.algorithms.list;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @Author: liuys23
 * @Date: 2020/9/18
 * 143. 重排链表
 * 给定一个单链表 L：L0→L1→…→Ln-1→Ln ，
 * 将其重新排列后变为： L0→Ln→L1→Ln-1→L2→Ln-2→…
 */
public class ReOrderList {
    public void reorderList(ListNode head) {
        Deque<ListNode> queue = new LinkedList<>();
        ListNode p = head;
        while (p != null){
            queue.addLast(p);
            p = p.next;
        }
        while (!queue.isEmpty()){
            if (p == null){
                p = queue.pollFirst();
            }else {
                p.next = queue.pollFirst();
                p = p.next;
            }
            p.next = queue.pollLast();
            p = p.next;
        }
        if (p != null){
            p.next = null;
        }
    }
}
