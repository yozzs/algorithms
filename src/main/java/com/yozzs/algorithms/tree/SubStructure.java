package com.yozzs.algorithms.tree;

/**
 * @Author: liuys23
 * @Date: 2020/7/14
 * 判断二叉树Tree2是不是Tree1的子树
 */
public class SubStructure {

    public boolean isSubStructure(TreeNode A, TreeNode B) {
        if (A == null) return false;
        if (B == null) return false;
        return (A.val == B.val && isSameTree(A, B)) || isSubStructure(A.left,B) || isSubStructure(A.right,B);
    }

    private boolean isSameTree(TreeNode t1, TreeNode t2) {
        if (t2 == null) return true;
        if (t1 == null) return false;
        return t1.val == t2.val && (isSameTree(t1.left, t2.left) && isSameTree(t1.right, t2.right));
    }
}
