package com.yozzs.algorithms.tree.bst;

import com.yozzs.algorithms.tree.TreeNode;

/**
 * @Author: liuys23
 * @Date: 2020/9/21
 * 538. 把二叉搜索树转换为累加树
 * 输入: 原始二叉搜索树:
 *               5
 *             /   \
 *            2     13
 *
 * 输出: 转换为累加树:
 *              18
 *             /   \
 *           20     13
 */
public class ConvertBST {
    int num = 0;
    public TreeNode convertBST(TreeNode root) {
        if (root == null) return null;
        convertBST(root.right);
        num += root.val;
        root.val = num;
        convertBST(root.left);
        return root;
    }
}
