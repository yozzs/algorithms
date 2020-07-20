package com.yozzs.algorithms.list;


/**
 * @Author: liuys23
 * @Date: 2020/7/9
 * 反向输出单向链表
 * tips: 递归  或 使用栈
 */
public class Reprint {
    public static void main(String[] args) {

    }


    public int[] reversePrint(ListNode head) {
        int length = 1;
        ListNode temp = head;
        while(temp != null){
            length++;
            temp = temp.next;
        }
        int[] ints = new int[length];
        int index = --length;
        addToArray(ints,head,index);
        return ints;
    }
    public void addToArray(int[] ints, ListNode node, int index){
        if (node != null) {
            ints[index] = node.val;
            addToArray(ints,node.next,--index);
        }
    }

}
