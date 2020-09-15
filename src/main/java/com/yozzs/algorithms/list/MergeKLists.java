package com.yozzs.algorithms.list;

/**
 * @Author: liuys23
 * @Date: 2020/9/15
 * 23. 合并K个升序链表
 * 分治
 */
public class MergeKLists {
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists == null || lists.length == 0) return null;
        ListNode res = lists[0];
        if (lists.length == 1) return res;
        for (int i = 1; i < lists.length; i++) {
            res = merge2Lists(res, lists[i]);
        }
        return res;
    }

    private ListNode merge2Lists(ListNode l1, ListNode l2) {
        if (l1 == null) return l2;
        if (l2 == null) return l1;
        if (l1.val < l2.val){
            l1.next = merge2Lists(l1.next, l2);
            return l1;
        }else {
            l2.next = merge2Lists(l1, l2.next);
            return l2;
        }
    }
}
