package com.yozzs.algorithms.list;

import java.util.List;

/**
 * @Author: liuys23
 * @Date: 2020/7/13
 */
public class ReserveList {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next(2).next(3).next(4).next(5).next(6).next(7).next(8).next(9);
        System.out.println(new ReserveList().reverseList(head));
    }
    public ListNode reverseList(ListNode head) {
        ListNode pTemp = head;
        ListNode pReserveHead = null;
        ListNode pPrev = null;
        while (pTemp != null){
            ListNode pNext = pTemp.next;
            if (pNext == null){
                pReserveHead = pTemp;
            }
            pTemp.next = pPrev;
            pPrev = pTemp;
            pTemp = pNext;
        }
        return pReserveHead;
    }
}
