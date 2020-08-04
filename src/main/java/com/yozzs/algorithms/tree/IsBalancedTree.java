package com.yozzs.algorithms.tree;

/**
 * @Author: liuys23
 * @Date: 2020/8/1
 * 55. 是否为平衡二叉树
 */
public class IsBalancedTree {
    public boolean isBalanced(TreeNode root) {
        if(root==null) return true;
        if(Math.abs(getHigh(root.left) - getHigh(root.right)) <= 1){
            return isBalanced(root.left) && isBalanced(root.right);
        }
        return false;
    }

    private int getHigh(TreeNode root){
        if(root==null) return 0;
        return Math.max(getHigh(root.left),getHigh(root.right)) + 1;
    }
}
