package com.yozzs.algorithms.list;

/**
 * @Author: liuys23
 * @Date: 2020/9/21
 * 234. 回文链表
 */
public class IsPalindrome {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next(2).next(3).next(4);
        System.out.println(new IsPalindrome().isPalindrome(head));
    }
    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) return true;
        ListNode fast = head;
        ListNode slow = head;
        while (fast.next != null && fast.next.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        slow = reverse(slow.next);
        while (slow != null){
            if (head.val != slow.val){
                return false;
            }
            head = head.next;
            slow = slow.next;
        }
        return true;
    }

    private ListNode reverse(ListNode head) {
        ListNode temp = head;
        ListNode pre = null;
        ListNode result = null;
        while(temp != null){
            ListNode next = temp.next;
            if (temp.next == null){
                result = temp;
            }
            temp.next = pre;
            pre = temp;
            temp = next;
        }
        return result;
    }
}
