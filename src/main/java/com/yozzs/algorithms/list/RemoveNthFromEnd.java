package com.yozzs.algorithms.list;

/**
 * @Author: liuys23
 * @Date: 2020/9/15
 * 19. 删除链表的倒数第N个节点
 * 双指针
 */
public class RemoveNthFromEnd {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next(2).next(3).next(4);
        System.out.println(new RemoveNthFromEnd().removeNthFromEnd(head, 2));
    }
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode p1= head;
        ListNode p2 = head;
        for (int i = 1; i < n ; i++) {
            p1 = p1.next;
        }
        while (p1 != null){
            if (p1.next == null){
                return head.next;
            }
            p1 = p1.next;
            if (p1.next == null){
                p2.next = p2.next.next;
                break;
            }
            p2 = p2.next;
        }
        return head;
    }
}
