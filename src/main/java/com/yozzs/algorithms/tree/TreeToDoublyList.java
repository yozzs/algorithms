package com.yozzs.algorithms.tree;

/**
 * @Author: liuys23
 * @Date: 2020/7/18
 * 36.将二叉搜索树转化为双向链表
 */
public class TreeToDoublyList {
    TreeNode head = null;
    TreeNode pre = null;

    public TreeNode treeToDoublyList(TreeNode root) {
        if (root == null) return null;
        helper(root);
        head.left = pre;
        pre.right = head;
        return head;
    }

    private void helper(TreeNode root) {
        if (root == null) return;
        helper(root.left);
        root.left = pre;
        if (pre != null){
            pre.right = root;
        }else {
            head = root;
        }
        pre = root;
        helper(root.right);
    }
}
