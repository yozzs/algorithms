package com.yozzs.algorithms.tree;

import java.util.LinkedList;

/**
 * @Author: liuys23
 * @Date: 2020/7/31
 * BST 第k大的节点
 */
public class KthLargestNode {
    private int result;
    private int count;
    public int kthLargest(TreeNode root, int k) {
        if (root == null || k == 0) return 0;
        helper(root, k);
        return result;
    }

    private void helper(TreeNode root, int k) {
        if (root.right != null) helper(root.right, k);
        if (++count == k) {
            result = root.val;
            return;
        }
        if (root.left != null) helper(root.left, k);
    }
}
