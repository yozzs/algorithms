package com.yozzs.algorithms.list;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @Author: liuys23
 * @Date: 2020/9/17
 * 445. 两数相加 II
 * 输入：(7 -> 2 -> 4 -> 3) + (5 -> 6 -> 4)
 * 输出：7 -> 8 -> 0 -> 7
 */
public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if (l1 == null) return l2;
        if (l2 == null) return l1;
        Deque<ListNode> stack1 = new LinkedList<>();
        Deque<ListNode> stack2 = new LinkedList<>();
        ListNode p1 = l1;
        ListNode p2 = l2;
        while (p1 != null){
            stack1.push(p1);
            p1 = p1.next;
        }
        while (p2 != null){
            stack2.push(p2);
            p2 = p2.next;
        }
        int cur = 0;
        ListNode temp = new ListNode(0);
        while (!stack1.isEmpty() || !stack2.isEmpty()){
            int val1 = stack1.isEmpty() ? 0 : stack1.pop().val;
            int val2 = stack2.isEmpty() ? 0 : stack2.pop().val;
            int val = (val1 + val2 + cur) % 10;

            ListNode current = new ListNode(val);
            current.next = temp.next;
            temp.next = current;
            cur = (val1 + val2 + cur) / 10;
        }
        if (cur > 0){
            temp.val = 1;
            return temp;
        }else {
            return temp.next;
        }
    }
}
