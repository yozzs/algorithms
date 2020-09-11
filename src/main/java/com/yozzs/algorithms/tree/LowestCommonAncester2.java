package com.yozzs.algorithms.tree;

/**
 * @Author: liuys23
 * @Date: 2020/9/10
 * 剑指 Offer 68 - II. 二叉树的最近公共祖先
 */
public class LowestCommonAncester2 {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null || p == null || q == null) return null;
        if (root == p || root == q) return root;
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);
        if (left == null){
            return right;
        }
        if (right == null){
            return left;
        }
        return root;
    }
}
