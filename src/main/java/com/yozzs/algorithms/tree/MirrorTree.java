package com.yozzs.algorithms.tree;

/**
 * @Author: liuys23
 * @Date: 2020/7/14
 * 27.镜像二叉树
 */
public class MirrorTree {
    public TreeNode mirrorTree(TreeNode root) {
        if (root == null) return null;
        TreeNode temp = mirrorTree(root.left);
        root.left = mirrorTree(root.right);
        root.right = temp;
        return root;
    }
}
