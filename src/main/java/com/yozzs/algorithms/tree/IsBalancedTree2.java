package com.yozzs.algorithms.tree;

/**
 * @Author: liuys23
 * @Date: 2020/8/1
 * 55. 是否为平衡二叉树
 */
public class IsBalancedTree2 {
    public boolean isBalanced(TreeNode root) {
        return recur(root) != -1;
    }

    private int recur(TreeNode root){
        if (root == null) return 0;
        int left = recur(root.left);
        if(left == -1) return -1;
        int right = recur(root.right);
        if(right == -1) return -1;
        return Math.abs(left - right) <= 1 ? Math.max(left, right) + 1 : -1;
    }
}
