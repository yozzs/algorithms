package com.yozzs.algorithms.list;

/**
 * @Author: liuys23
 * @Date: 2020/7/14
 * 25.合并两个递增链表，得到的链表仍递增
 * 递归
 */
public class Merge2List {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        l1.next(3).next(5).next(7).next(8);
        l2.next(4).next(8);
        System.out.println(new Merge2List().mergeTwoLists(l1,l2));
    }
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) return l2;
        if (l2 == null) return l1;
        ListNode result = null;
        if (l1.val <= l2.val){
            result = l1;
            result.next = mergeTwoLists(l2, l1.next);
        }else{
            result = l2;
            result.next = mergeTwoLists(l1, l2.next);
        }
        return result;
    }
}
