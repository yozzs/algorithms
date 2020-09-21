package com.yozzs.algorithms.tree;

/**
 * @Author: liuys23
 * @Date: 2020/9/18
 * 100.相同的树
 */
public class IsSameTree {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null || q == null){
            return p == q;
        }
        if (p.val != q.val) {
            return false;
        }
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}
